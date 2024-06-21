package ui.screens.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import ui.screens.dashboard.components.*

class DashboardScreen: Screen {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    @Composable
    override fun Content() {
        val windowSizeClass = calculateWindowSizeClass()
        val isLargeScreen = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded
        val isLandScape = windowSizeClass.heightSizeClass > WindowHeightSizeClass.Compact

        val items = listOf(
            BottomNavigationItem("Home", Icons.Default.Home),
            BottomNavigationItem("Feed", Icons.Default.Notifications),
            BottomNavigationItem("Sessions", Icons.Default.Timer)
        )

        var selectedItem by remember { mutableStateOf(items.first()) }

        Scaffold(
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                when {
                    isLargeScreen || isLandScape -> {
                        Row {
                            SidebarNavigation(
                                items = items,
                                selectedItem = selectedItem,
                                onItemSelected = { selectedItem = it }
                            )
                            Column(
                                modifier = Modifier.fillMaxSize().padding(start = 8.dp)
                            ) {
                                // Main content goes here based on the selected item
                            }
                        }
                    }
                    //isLandScape -> LandscapeLayout(state, gridVm, gameVm, gridState)
                    else -> {
                        BottomNavigationBar(
                            items = items,
                            selectedItem = selectedItem,
                            onItemSelected = { selectedItem = it }
                        )
                    }
                }

            }
        }
    }
}
