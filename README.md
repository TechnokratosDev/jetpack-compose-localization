# Jetpack Compose Localization library  
  
Бибилиотека для организации строковых ресурсов без применения xml, а также реактивной смены локали  

Ключевые моменты:
-
- Работает без ссылки на `android.content.Context`
- Использует инструмент `Ambient` (аналогично темам)
- Пока не сохраняет текущую локаль между запусками (*все впереди!*)
- Позволяет реактивно менять локаль, не заботясь о обновлении вьюшек
- Если строка не указана для какой-либо локали, будет автоматически взята строка из дефолтной локали

Применение
-
**_Strings.kt_**
```kotlin
// создаем интересующие нас локали 
// английская локаль добавлена по умолчанию
val RUSSIAN = Locale("ru")  
val TATAR = Locale("tt")  
  
val supportedLocalesNow = registerSupportedLocales(RUSSIAN, TATAR)  
  
// 1st parameter: идентификатор нигде более неиспользуемый, TODO подумать как убрать
// 2nd parameter: значение для дефолтной локали (английский)
// 3rd parameter: лямбда, возвращающая мапу Локаль-Строка
val hello = Translatable("hello", "Hello!") {  
  hashMapOf(  
      RUSSIAN to "Привет!",  
	  TATAR to "Исәнме!"  
  )
  // вариант для непереводимых строк
val nonTrans = NonTranslatable("format", "%1\$d:%2\$02d")
```

**_Ui.kt_**
```kotlin
@Composable
fun Content() {
  Column() {
    // Vocabulary - объект из библиотеки для быстрого доступа к локализации
    // получаем объект текущей локализации
    val localization = Vocabulary.localization  
    // на нем вызываем определенную ранее extension-функцию, 
    // которая вернет строку в нужной локали
    Text(text = localization.hello())
    // эта строка не будет переводиться
    Text(text = localization.nonTrans().format(20, 9))
  }
}
```

**_MainActivity.kt_**
```kotlin
setContent {
  val locale = remember { mutableStateOf(Locale.getDefault()) }  
  Localization(locale = locale.value) {
    Content()
  }
}
```
При изменении состояния `locale`, будет изменяться текст по всей иерархии.

Sample
-
<img height="600px" src="media/localization.gif"/>

LICENSE
-
```
MIT License

Copyright (c) 2021 Technokratos

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```