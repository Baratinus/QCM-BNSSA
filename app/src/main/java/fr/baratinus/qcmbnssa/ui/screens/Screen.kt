package fr.baratinus.qcmbnssa.ui.screens

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Statistics: Screen("statistics")
    object Settings: Screen("settings")
}
