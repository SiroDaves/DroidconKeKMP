import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.*
import com.sirodaves.droidconke.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.koinInject
import platform.StatusBarColors
import ui.screens.AppViewModel
import ui.screens.splash.SplashScreen

@Composable
@Preview
fun DroidconKeKMP(
    appVm: AppViewModel = koinInject(),
) {
    val darkTheme = appVm.appTheme.collectAsState().value == 1
    KoinContext {
        AppTheme(
            letThereBeDarkness = darkTheme,
        ) {
            StatusBarColors(
                statusBarColor = MaterialTheme.colorScheme.background,
                navBarColor = MaterialTheme.colorScheme.background,
            )
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background,
            ) {
                Navigator(
                    screen = SplashScreen(darkTheme),
                    content = {
                        CurrentScreen()
                    },
                )
            }
        }
    }
}