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
	  TATAR to "Исэнме!"  
  )
  // вариант для непереводимых строк
val nonTrans = NonTranslatable("sym", "4")
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
    Text(text = localization.nonTrans())
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