package fr.baratinus.qcmbnssa.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fr.baratinus.qcmbnssa.ui.components.BottomNavigationBar
import fr.baratinus.qcmbnssa.ui.theme.QCMBNSSATheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Settings(navController: NavController) {
    QCMBNSSATheme {
        Scaffold (
            bottomBar = { BottomNavigationBar(navController) },
            content = { innerPadding ->
                Column() {
                    Text(
                        text = "Paramètres",
                        modifier = Modifier.padding(innerPadding),
                        fontSize = 20.sp
                    )
                }
            }
        )
    }
}