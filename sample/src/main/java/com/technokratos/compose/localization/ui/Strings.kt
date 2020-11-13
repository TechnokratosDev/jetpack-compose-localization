package com.technokratos.compose.localization.ui

import java.util.Locale
import com.technokratos.compose.localization.NonTranslatable
import com.technokratos.compose.localization.Translatable
import com.technokratos.compose.localization.registerSupportedLocales

val RUSSIAN = Locale("ru")
val TATAR = Locale("tt")

val supportedLocalesNow = registerSupportedLocales(RUSSIAN, TATAR)

val hello = Translatable("hello", "Hello!") {
    hashMapOf(
        RUSSIAN to "Привет!",
        TATAR to "Исэнме!"
    )
}

val bye = Translatable("bye", "Goodbye!") {
    hashMapOf(
        RUSSIAN to "Пока!",
        TATAR to "Хуш!"
    )
}

val nonTrans = NonTranslatable("poh", "afjgrjad")