package com.technokratos.compose.localization.ui

import java.util.Locale
import com.technokratos.compose.localization.NonTranslatable
import com.technokratos.compose.localization.Plural
import com.technokratos.compose.localization.Plurals
import com.technokratos.compose.localization.Translatable
import com.technokratos.compose.localization.registerSupportedLocales

val RUSSIAN = Locale("ru")
val TATAR = Locale("tt")

val supportedLocalesNow = registerSupportedLocales(RUSSIAN, TATAR)

val localesHeader = Translatable(
    "Locales",
    hashMapOf(
        RUSSIAN to "Локали",
        TATAR to "Локальләштерүләр"
    )
)

val hello = Translatable(
    "Hello!",
    hashMapOf(
        RUSSIAN to "Привет!",
        TATAR to "Исәнме!"
    )
)

val bye = Translatable(
    "Goodbye!",
    hashMapOf(
        RUSSIAN to "Пока!",
        TATAR to "Хуш!"
    )
)

val nonTrans = NonTranslatable("%1\$d:%2\$02d")

val plural = Plurals(
    Plural(one = "it's one", other = "it's other"),
    hashMapOf(
        RUSSIAN to Plural(
            one = "это один",
            few = "это несколько",
            many = "это много",
            other = "это другое"
        ),
        TATAR to Plural(
            one = "это не покажется",
            other = "бу башка"
        )
    )
)
