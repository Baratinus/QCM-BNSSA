package fr.baratinus.qcmbnssa.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigationBar() {
    BottomNavigation (
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.primary
    ) {
        BottomNavigationItem(
            icon = {Icon(Icons.Filled.Home, contentDescription = null)},
            label = { Text(text = "accueil")},
            selected = true,
            onClick = { /*TODO*/ }
        )
        BottomNavigationItem(
            icon = {Icon(Icons.Filled.Star, contentDescription = null)},
            label = { Text(text = "stats")},
            selected = true,
            onClick = { /*TODO*/ }
        )
        BottomNavigationItem(
            icon = {Icon(Icons.Filled.Settings, contentDescription = null)},
            label = { Text(text = "paramètre")},
            selected = true,
            onClick = { /*TODO*/ }
        )
    }
}