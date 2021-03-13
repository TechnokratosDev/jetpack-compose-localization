package com.technokratos.compose.localization

import java.util.Locale
import kotlin.math.absoluteValue
import android.util.Log

class PluralRule(
    val zero: (Double, Long, Long, Int) -> Boolean = { _, _, _, _ -> false },
    val one: (Double, Long, Long, Int) -> Boolean = { _, _, _, _ -> false },
    val two: (Double, Long, Long, Int) -> Boolean = { _, _, _, _ -> false },
    val few: (Double, Long, Long, Int) -> Boolean = { _, _, _, _ -> false },
    val many: (Double, Long, Long, Int) -> Boolean = { _, _, _, _ -> false }
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

fun Localization.getPlural(name: String, quantity: Double): CharSequence? {
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
            fractionPartDigitCount
        )
    }
}

private val defaultPluralRule = PluralRule()
private val localeToPluralRule: Map<Locale, PluralRule> = mutableMapOf(
    Locale.ENGLISH to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int ->
            i == 1L && v == 0
        }
    ),
    Locale("ru") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L
        },
        few = { _: Double, i: Long, _: Long, v: Int ->
            v == 0 && i % 10 in 2..4 && i % 100 !in 12..14
        },
        many = { _: Double, i: Long, _: Long, v: Int ->
            v == 0 && (i % 10 == 0L || i % 10 in 5..9 || i % 100 in 11..14)
        }
    )
)

fun isLocaleRegistered(locale: Locale): Boolean {
    return localeToPluralRule.containsKey(locale)
}

fun resolveString(
    plural: Plural,
    locale: Locale,
    n: Double,
    i: Long,
    f: Long,
    v: Int
): CharSequence {
    val rule = localeToPluralRule[locale] ?: defaultPluralRule

    return when {
        rule.zero(n, i, f, v) && plural.zero != null -> plural.zero
        rule.one(n, i, f, v) && plural.one != null -> plural.one
        rule.two(n, i, f, v) && plural.two != null -> plural.two
        rule.few(n, i, f, v) && plural.few != null -> plural.few
        rule.many(n, i, f, v) && plural.many != null -> plural.many
        else -> plural.other
    }
}