package fr.baratinus.qcmbnssa.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.baratinus.qcmbnssa.ui.screens.*

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            Home(navController)
        }
        composable(route = Screen.Statistics.route) {
            Statistics(navController)
        }
        composable(route = Screen.Settings.route) {
            Settings(navController)
        }
    }
}