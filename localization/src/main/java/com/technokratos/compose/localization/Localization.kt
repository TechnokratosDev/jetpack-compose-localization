package com.technokratos.compose.localization

import java.util.Locale
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf

internal val defaultLocalization: Localization = Localization(Locale.ENGLISH)

private val supportedLocales: MutableSet<Locale> = mutableSetOf()

internal val localizationMap = hashMapOf<Locale, Localization>()

data class Localization(
    val locale: Locale,
    internal val strings: MutableMap<String, String> = mutableMapOf(),
    internal val plurals: MutableMap<String, Plural> = mutableMapOf()
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

fun Translatable(
    name: String,
    defaultValue: String,
    localeToValue: () -> Map<Locale, String>
): Localization.() -> String {
    defaultLocalization.strings[name] = defaultValue
    for ((locale, value) in localeToValue().entries) {
        val localization =
            localizationMap[locale] ?: throw RuntimeException("There is no locale $locale")
        localization.strings[name] = value
    }
    return fun Localization.(): String {
        return this.strings[name] ?: defaultLocalization.strings[name]
        ?: throw RuntimeException("There is no string called $name in localization $this")
    }
}

fun NonTranslatable(name: String, defaultValue: String): Localization.() -> String {
    defaultLocalization.strings[name] = defaultValue
    return fun Localization.(): String {
        return defaultLocalization.strings[name]
            ?: throw RuntimeException("There is no string called $name in localization default")
    }
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