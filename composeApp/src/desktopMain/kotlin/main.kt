import androidx.compose.foundation.layout.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import di.KoinInit
import org.koin.core.Koin

lateinit var koin: Koin

fun main() {
    koin = KoinInit().init()
    koin.loadModules(listOf())

    return application {
        Window(
            onCloseRequest = { exitApplication() },
            title = "Droidcon Kenya 2024",
            state = rememberWindowState(
                position = WindowPosition.Aligned(Alignment.Center),
                width = 1200.dp,
                height = 700.dp,
            ),
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                DroidconKeKMP()
            }
        }
    }
}
