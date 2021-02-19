package com.technokratos.compose.localization.ui

import java.util.Locale
import com.technokratos.compose.localization.NonTranslatable
import com.technokratos.compose.localization.Translatable
import com.technokratos.compose.localization.registerSupportedLocales

val RUSSIAN = Locale("ru")
val TATAR = Locale("tt")

val supportedLocalesNow = registerSupportedLocales(RUSSIAN, TATAR)

val localesHeader = Translatable("locales", "Locales") {
    hashMapOf(
        RUSSIAN to "Локали",
        TATAR to "Локальләштерүләр"
    )
}

val hello = Translatable("hello", "Hello!") {
    hashMapOf(
        RUSSIAN to "Привет!",
        TATAR to "Исәнме!"
    )
}

val bye = Translatable("bye", "Goodbye!") {
    hashMapOf(
        RUSSIAN to "Пока!",
        TATAR to "Хуш!"
    )
}

val nonTrans = NonTranslatable("format", "%1\$d:%2\$02d")