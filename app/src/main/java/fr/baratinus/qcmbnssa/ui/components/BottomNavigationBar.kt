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
import androidx.navigation.NavController
import fr.baratinus.qcmbnssa.ui.screens.Screen

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation (
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground
    ) {
        BottomNavigationItem(
            icon = {Icon(Icons.Filled.Home, contentDescription = null)},
            label = { Text(text = "accueil")},
            selected = true,
            onClick = { navController.navigate(Screen.Home.route) }
        )
        BottomNavigationItem(
            icon = {Icon(Icons.Filled.Star, contentDescription = null)},
            label = { Text(text = "statistiques")},
            selected = true,
            onClick = { navController.navigate(Screen.Statistics.route) }
        )
        BottomNavigationItem(
            icon = {Icon(Icons.Filled.Settings, contentDescription = null)},
            label = { Text(text = "paramètres")},
            selected = true,
            onClick = { navController.navigate(Screen.Settings.route) }
        )
    }
}