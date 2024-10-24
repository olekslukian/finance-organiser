package com.financeorganiser.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.financeorganiser.features.auth.view.AuthView
import com.financeorganiser.features.home.HomeView

@Composable
fun Navigation() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = Screen.AuthScreen.route) {
    composable(route = Screen.AuthScreen.route) {
        AuthView(navController)
    }
    composable(route = Screen.HomeScreen.route) {
        HomeView(navController)
    }
    }    
}