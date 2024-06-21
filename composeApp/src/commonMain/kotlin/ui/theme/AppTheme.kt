package com.sirodaves.droidconke.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val lightTheme = lightColorScheme(
    primary = primaryColor,
    onPrimary = primaryTextColor,
    secondary = secondaryColor,
    onSecondary = secondaryTextColor,
    tertiary = primaryLightColor,
    onTertiary = primaryTextColor,
    background = backgroundLightColor,
    onBackground = Color.Black,
    surface = surfaceLight,
    onSurface = Color.Black,
    surfaceVariant = surfaceLight,
    onSurfaceVariant = Color.Black,
    secondaryContainer = primaryColor,
    onSecondaryContainer = Color.White,
    error = errorColor,
    onError = onErrorColor,
)

private val darkTheme = darkColorScheme(
    primary = primaryColor,
    onPrimary = primaryTextColor,
    secondary = secondaryLightColor,
    onSecondary = secondaryTextColor,
    tertiary = primaryLightColor,
    onTertiary = primaryTextColor,
    background = backgroundDarkColor,
    onBackground = Color.White,
    surface = surfaceDark,
    onSurface = Color.White,
    surfaceVariant = surfaceDark,
    onSurfaceVariant = Color.White,
    secondaryContainer = primaryColor,
    onSecondaryContainer = Color.White,
    error = errorColor,
    onError = onErrorColor,
)

@Composable
internal fun AppTheme(
    letThereBeDarkness: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (letThereBeDarkness) darkTheme else lightTheme

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = AppShapes,
        content = content,
    )
}
