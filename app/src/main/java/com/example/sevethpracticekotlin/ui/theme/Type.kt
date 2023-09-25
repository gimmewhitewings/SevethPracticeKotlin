package com.example.sevethpracticekotlin.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sevethpracticekotlin.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val first = GoogleFont("Lobster")
val second = GoogleFont("Comfortaa")
val third = GoogleFont("Merriweather")


val firstFamily = FontFamily(
    Font(googleFont = first, fontProvider = provider)
)

val secondFamily = FontFamily(
    Font(googleFont = second, fontProvider = provider)
)

val thirdFamily = FontFamily(
    Font(googleFont = third, fontProvider = provider)
)



// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = firstFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = secondFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = thirdFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
)

@Preview
@Composable
fun fontpreview() {
    SeventhPracticeKotlinTheme {
        Text(text = "example", style = MaterialTheme.typography.bodyLarge)
    }
}