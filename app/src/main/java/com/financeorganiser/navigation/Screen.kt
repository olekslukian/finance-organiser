package com.financeorganiser.navigation

sealed class Screen(val route: String) {
   data object AuthScreen : Screen("auth_route")
   data object HomeScreen : Screen("home_route")
}