package com.example.logincompose

sealed class NextScreenPlease(val route: String) {
    object LoginUIState : NextScreenPlease("main_screen")
    object namePage : NextScreenPlease("detail")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}