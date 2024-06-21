package ui.screens.dashboard.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

@Composable
fun BottomNavigationBar(
    items: List<BottomNavigationItem>,
    selectedItem: BottomNavigationItem,
    onItemSelected: (BottomNavigationItem) -> Unit
) {
    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == item,
                onClick = { onItemSelected(item) }
            )
        }
    }
}

data class BottomNavigationItem(val label: String, val icon: ImageVector)
