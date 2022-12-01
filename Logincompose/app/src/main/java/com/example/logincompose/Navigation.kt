package com.example.logincompose

import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val context = LocalContext.current
    NavHost(navController = navController, startDestination = NextScreenPlease.LoginUIState.route) {

        composable(route = NextScreenPlease.LoginUIState.route) {
            LoginUIState(context, navController = navController)
        }

        composable(route = NextScreenPlease.namePage.route + "/{name}", arguments = listOf(navArgument("name") {
            type = NavType.StringType
            defaultValue = "You haven't passed any name"
            nullable = true
        })) { entry ->
            entry.arguments?.getString("name")?.let { namePage(name = it) }
        }
    }
}