package com.example.sevethpracticekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.sevethpracticekotlin.ui.theme.SeventhPracticeKotlinTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private val random = Random(123)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SeventhPracticeKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        val listOfStyles = listOf(
                            MaterialTheme.typography.bodyLarge,
                            MaterialTheme.typography.titleLarge,
                            MaterialTheme.typography.labelSmall,
                        )

                        var styleIndex by remember { mutableIntStateOf(0) }

                        MyName(
                            name = stringResource(id = R.string.my_name),
                            onClick = { styleIndex = random.nextInt(0, listOfStyles.size) },
                            style = listOfStyles[styleIndex]
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MyName(
    name: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Text(
        text = name,
        modifier = modifier.clickable { onClick() },
        textAlign = TextAlign.Center,
        style = style,
        color = MaterialTheme.colorScheme.onSecondaryContainer
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SeventhPracticeKotlinTheme {
        MyName("Android", style = MaterialTheme.typography.titleLarge, onClick = {})
    }
}