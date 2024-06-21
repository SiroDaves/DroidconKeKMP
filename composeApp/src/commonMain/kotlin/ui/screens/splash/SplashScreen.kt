package ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import dcke.composeapp.generated.resources.*
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import ui.screens.dashboard.DashboardScreen

class SplashScreen(private val darkTheme: Boolean) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val imageRes = if (darkTheme) Res.drawable.droidcon_dark else Res.drawable.droidcon

        // Show the splash screen for 3 seconds before navigating to dashboard screen
        LaunchedEffect (Unit) {
            delay(3000)
            navigator?.push(DashboardScreen())
        }

        Scaffold() {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(imageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}