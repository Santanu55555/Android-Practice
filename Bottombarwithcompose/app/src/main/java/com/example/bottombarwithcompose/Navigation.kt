package com.example.bottombarwithcompose

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navigation() {

    val navController = rememberNavController()

    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Settings,
        NavigationItem.Notifications,
        NavigationItem.Account
    )


    Scaffold(topBar = { TopAppBar(title = { Text(text = "Bottom Navigation View") }) },
        bottomBar = {
            BottomNavigation(backgroundColor = MaterialTheme.colors.background) {

                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route


                items.forEach {
                    BottomNavigationItem(selected = currentRoute == it.route, label = {
                        Text( text = it.label, color = if (currentRoute == it.route) Color.DarkGray else Color.LightGray )
                    }, icon = {
                        Icon(   imageVector = it.icons, contentDescription = null, tint = if (currentRoute == it.route) Color.DarkGray else Color.LightGray     )
                    },

                        onClick = {
                            if (currentRoute != it.route) {

                                navController.graph?.startDestinationRoute?.let {
                                    navController.popBackStack(it, true)

                                }

                                navController.navigate(it.route) {
                                    launchSingleTop = true
                                }

                            }

                        })

                }


            }


        }) {

        NavigationController(navController = navController)

    }

}