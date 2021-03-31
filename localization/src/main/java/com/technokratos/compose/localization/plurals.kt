package com.technokratos.compose.localization

import java.util.Locale
import kotlin.math.absoluteValue
import android.util.Log

class PluralRule(
    val zero: (Double, Long, Long, Int, Int) -> Boolean = { _, _, _, _, _ -> false },
    val one: (Double, Long, Long, Int, Int) -> Boolean = { _, _, _, _, _ -> false },
    val two: (Double, Long, Long, Int, Int) -> Boolean = { _, _, _, _, _ -> false },
    val few: (Double, Long, Long, Int, Int) -> Boolean = { _, _, _, _, _ -> false },
    val many: (Double, Long, Long, Int, Int) -> Boolean = { _, _, _, _, _ -> false }
)

class Plural(
    val zero: CharSequence? = null,
    val one: CharSequence? = null,
    val two: CharSequence? = null,
    val few: CharSequence? = null,
    val many: CharSequence? = null,
    val other: CharSequence
)

fun Plurals(
    name: String,
    defaultValue: Plural,
    localeToPlural: () -> Map<Locale, Plural>
): Localization.(Double) -> CharSequence {
    defaultLocalization.plurals[name] = defaultValue
    for ((locale, value) in localeToPlural().entries) {
        if (!isLocaleRegistered(locale)) {
            // TODO issue-9
            Log.w(
                "jcl10n",
                "There is no plural rule for $locale currently. Plural's 'other = ${value.other}' field can be used only!"
            )
        }
        val localization =
            localizationMap[locale] ?: throw RuntimeException("There is no locale $locale")
        localization.plurals[name] = value
    }
    return fun Localization.(quantity: Double): CharSequence {
        return getPlural(name, quantity) ?: defaultLocalization.getPlural(name, quantity)
        ?: throw RuntimeException("There is no string called $name in localization $this")
    }
}

private fun Localization.getPlural(name: String, quantity: Double): CharSequence? {
    val absQuantity = quantity.absoluteValue
    val (int, frac) = absQuantity.toString().split('.')
    val integerPart = int.toLong()
    val fractionPart = frac.trimStart('0').ifEmpty { "0" }.toLong()
    val fractionPartDigitCount = frac.trimEnd('0').count()

    return plurals[name]?.let {
        resolveString(
            it,
            locale,
            absQuantity,
            integerPart,
            fractionPart,
            fractionPartDigitCount,
            0 // we don't support String quantity parameter now so exp part is always 0
        )
    }
}

private val defaultPluralRule = onlyOther

private fun isLocaleRegistered(locale: Locale): Boolean {
    return localeToPluralRule.containsKey(locale)
}

private fun resolveString(
    plural: Plural,
    locale: Locale,
    n: Double,
    i: Long,
    f: Long,
    v: Int,
    e: Int
): CharSequence {
    val rule = localeToPluralRule[locale] ?: defaultPluralRule

    return when {
        rule.zero(n, i, f, v, e) && plural.zero != null -> plural.zero
        rule.one(n, i, f, v, e) && plural.one != null -> plural.one
        rule.two(n, i, f, v, e) && plural.two != null -> plural.two
        rule.few(n, i, f, v, e) && plural.few != null -> plural.few
        rule.many(n, i, f, v, e) && plural.many != null -> plural.many
        else -> plural.other
    }
}