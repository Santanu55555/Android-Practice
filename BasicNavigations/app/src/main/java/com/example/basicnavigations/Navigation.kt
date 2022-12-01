package com.example.basicnavigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { Home(navController = navController) }
        composable("profile") { Profile(navController = navController) }
        composable("friendslist") { FriendsList(navController = navController) }

    }
}

