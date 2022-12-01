package com.example.logincompose

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavController

@Composable
fun LoginUIState(context: Context, navController: NavController) {
    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    LoginUI(context, name = name, email = email, password = password, onNameChange = { name = it }, onEmailChange = { email = it }, onPasswordChange = { password = it }, navController = navController)

}