package com.technokratos.compose.localization

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import java.util.Locale

internal val defaultLocalization: Localization = Localization(Locale.ENGLISH)

private val supportedLocales: MutableSet<Locale> = mutableSetOf()

internal val localizationMap = hashMapOf<Locale, Localization>()

data class Localization(
    val locale: Locale,
    internal val strings: MutableMap<Int, String> = mutableMapOf(),
    internal val plurals: MutableMap<Int, Plural> = mutableMapOf()
)

fun registerSupportedLocales(vararg locales: Locale): Set<Locale> {
    locales.filter { it != Locale.ENGLISH }
        .forEach {
            if (supportedLocales.add(it)) {
                registerLocalizationForLocale(it)
            }
        }
    return supportedLocales + Locale.ENGLISH
}

private fun registerLocalizationForLocale(locale: Locale) {
    localizationMap[locale] = Localization(locale)
}

/**
 * Builder function for translatable string resource
 *
 * Saves given locales into corresponding [Localization] and returns extension function
 * that can be used for string resource retrieving
 *
 * @param defaultValue string value for default localization
 * @param localeToValue dictionary of locale to string resource
 * @param id integer id of a string resource
 * @return ext function that finds string in [Localization] receiver and returns it
 */
fun Translatable(
    defaultValue: String,
    localeToValue: Map<Locale, String>,
    id: Int = generateUID()
): Localization.() -> String {
    defaultLocalization.strings[id] = defaultValue
    for ((locale, value) in localeToValue.entries) {
        val localization =
            localizationMap[locale] ?: throw RuntimeException("There is no locale $locale")
        localization.strings[id] = value
    }
    return fun Localization.(): String {
        return this.strings[id] ?: defaultLocalization.strings[id]
        ?: throw RuntimeException("There is no string called $id in localization $this")
    }
}

/**
 * Builder function for translatable string resource
 *
 * Saves given locales into corresponding [Localization] and returns extension function
 * that can be used for string resource retrieving
 *
 * @param name id of a string resource, may be any object
 * @param defaultValue string value for default localization
 * @param localeToValue dictionary of locale to string resource
 * @return ext function that finds string in [Localization] receiver and returns it
 */
fun Translatable(
    name: Any,
    defaultValue: String,
    localeToValue: Map<Locale, String>
): Localization.() -> String {
    return Translatable(
        defaultValue,
        localeToValue,
        generateUID(name)
    )
}

/**
 * Builder function for non-translatable string resource
 *
 * Saves given locales into corresponding [Localization] and returns extension function
 * that can be used for string resource retrieving
 *
 * @param defaultValue string value for default localization
 * @param id integer id of a string resource
 * @return ext function that finds string in [Localization] receiver and returns it
 */
fun NonTranslatable(defaultValue: String, id: Int = generateUID()): Localization.() -> String {
    defaultLocalization.strings[id] = defaultValue
    return fun Localization.(): String {
        return defaultLocalization.strings[id]
            ?: throw RuntimeException("There is no string called $id in localization default")
    }
}

/**
 * Builder function for non-translatable string resource
 *
 * Saves given locales into corresponding [Localization] and returns extension function
 * that can be used for string resource retrieving
 *
 * @param name id of a string resource, may be any object
 * @param defaultValue string value for default localization
 * @return ext function that finds string in [Localization] receiver and returns it
 */
fun NonTranslatable(name: Any, defaultValue: String): Localization.() -> String {
    return NonTranslatable(defaultValue, generateUID(name))
}

val LocalLocalization = compositionLocalOf { defaultLocalization }

object Vocabulary {
    val localization: Localization
        @Composable
        @ReadOnlyComposable
        get() = LocalLocalization.current
}

@Composable
fun Localization(locale: Locale, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalLocalization provides (localizationMap[locale] ?: defaultLocalization),
        content = content
    )
}
