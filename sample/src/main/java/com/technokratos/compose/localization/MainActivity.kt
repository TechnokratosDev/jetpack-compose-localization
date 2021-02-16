package com.technokratos.compose.localization

import java.util.Locale
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.technokratos.compose.localization.ui.SampleTheme
import com.technokratos.compose.localization.ui.bye
import com.technokratos.compose.localization.ui.hello
import com.technokratos.compose.localization.ui.localesHeader
import com.technokratos.compose.localization.ui.nonTrans
import com.technokratos.compose.localization.ui.supportedLocalesNow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContent(null) {
            MyApp {
                Column(modifier = Modifier.fillMaxSize()) {
                    LanguageChooser(onClick = it)
                    Spacer(modifier = Modifier.preferredHeight(8.dp))
                    Examples(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable ((Locale)-> Unit) -> Unit) {
    SampleTheme {
        val locale = remember { mutableStateOf(Locale.getDefault()) }
        Localization(locale = locale.value) {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                content {
                    locale.value = it
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApp {
        Column(modifier = Modifier.fillMaxSize()) {
            LanguageChooser(modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.preferredHeight(8.dp))
            Examples(modifier = Modifier.weight(0.3f))
        }
    }
}

@Composable
fun LanguageChooser(modifier: Modifier = Modifier, onClick: (Locale) -> Unit = {}) {
    val locales = remember { derivedStateOf { supportedLocalesNow } }
    val localization = Vocabulary.localization
    rememberScrollState(0f)
    LazyColumn(modifier = modifier.fillMaxWidth()) {
        // use `item` for separate elements like headers
        // and `items` for lists of identical elements
        item {
            Box(modifier = Modifier.padding(8.dp)) {
                Text(text = localization.localesHeader(), style = MaterialTheme.typography.h4)
            }
        }
        items(locales.value.toList()) { locale ->
            val background = if (locale == localization.locale) Color.Green.copy(alpha = 0.3f) else MaterialTheme.colors.surface
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = { onClick(locale) })
                    .background(background)
                    .padding(8.dp),
                color = Color.Transparent
            ) {
                Text(
                    text = locale.toString(),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}

@Composable
fun Examples(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth().padding(8.dp)) {
        val localization = Vocabulary.localization
        Text(text = localization.hello(), style = MaterialTheme.typography.h4)
        Text(text = localization.bye(), style = MaterialTheme.typography.h4)
        Text(text = localization.nonTrans(), style = MaterialTheme.typography.h4)
    }
}