package com.technokratos.compose.localization

import java.util.Locale
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableContract
import androidx.compose.runtime.Providers
import androidx.compose.runtime.ambientOf

private val defaultLocalization: Localization = Localization(Locale.ENGLISH)

private val supportedLocales: MutableSet<Locale> = mutableSetOf()

private val localizationMap = hashMapOf<Locale, Localization>()

data class Localization(val locale: Locale, internal val strings: MutableMap<String, String> = mutableMapOf())

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

fun Translatable(name: String, defaultValue: String, localeToValue: () -> Map<Locale, String>): Localization.() -> String {
    defaultLocalization.strings[name] = defaultValue
    for ((locale, value) in localeToValue().entries) {
        val localization = localizationMap[locale] ?: throw RuntimeException("There is no locale $locale")
        localization.strings[name] = value
    }
    return fun Localization.(): String {
        return this.strings[name] ?: defaultLocalization.strings[name] ?: throw RuntimeException("There is no string called $name in localization $this")
    }
}

fun NonTranslatable(name: String, defaultValue: String): Localization.() -> String {
    defaultLocalization.strings[name] = defaultValue
    return fun Localization.(): String {
        return defaultLocalization.strings[name] ?: throw RuntimeException("There is no string called $name in localization default")
    }
}

val AmbientLocalization = ambientOf { defaultLocalization }

object Vocabulary {
    @Composable
    @ComposableContract(readonly = true)
    val localization: Localization get() = AmbientLocalization.current
}

@Composable
fun Localization(locale: Locale, content: @Composable () -> Unit) {
    Providers(
        AmbientLocalization provides (localizationMap[locale] ?: defaultLocalization),
        children = content
    )
}