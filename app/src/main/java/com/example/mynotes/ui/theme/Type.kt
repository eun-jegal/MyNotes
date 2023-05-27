package com.example.mynotes.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mynotes.R

val fonts_dm_sans = FontFamily(
    Font(R.font.dm_sans_bold, weight = FontWeight.Bold),
    Font(R.font.dm_sans_medium, weight = FontWeight.Medium),
    Font(R.font.dm_sans_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.dm_sans_regular, weight = FontWeight.Normal),
    Font(R.font.dm_sans_italic, weight = FontWeight.Normal, style = FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h2 = TextStyle(
        fontFamily = fonts_dm_sans,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    body1 = TextStyle(
        fontFamily = fonts_dm_sans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)