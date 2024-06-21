package ui.screens.dashboard.components

import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun SidebarNavigation(
    items: List<BottomNavigationItem>,
    selectedItem: BottomNavigationItem,
    onItemSelected: (BottomNavigationItem) -> Unit
) {
    NavigationRail {
        items.forEach { item ->
            NavigationRailItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == item,
                onClick = { onItemSelected(item) }
            )
        }
    }
}
