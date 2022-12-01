package com.example.bottombarwithcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {

        composable(NavigationItem.Home.route) {
            Home()
        }

        composable(NavigationItem.Notifications.route) {
            Notifications()
        }

        composable(NavigationItem.Settings.route) {
            Settings()
        }

        composable(NavigationItem.Account.route) {
            Accounts()
        }

    }


}