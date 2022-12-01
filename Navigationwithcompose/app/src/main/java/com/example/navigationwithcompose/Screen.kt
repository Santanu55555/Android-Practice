package com.example.navigationwithcompose

sealed class Screen(val route:String) {
      object MainScreen:Screen("main_screen")
      object DetailedScreen:Screen("detail")

        fun withArgs(vararg args:String):String{
            return buildString {
                append(route)
                args.forEach { arg ->
                    append("/$arg")
                }
            }
        }
}