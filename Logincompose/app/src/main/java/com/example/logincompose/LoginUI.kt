package com.example.logincompose

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginUI(context: Context, name: String, email: String, password: String, onEmailChange: (String) -> Unit, onNameChange: (String) -> Unit, onPasswordChange: (String) -> Unit, navController: NavController) {
    Column {
        Text(text = "Login", fontFamily = FontFamily.Cursive, fontSize = 35.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(top = 50.dp, bottom = 20.dp))
        OutlinedTextField(value = name, onValueChange = onNameChange, label = { Text("Enter your name") }, leadingIcon = { Icon(Icons.Default.Person, contentDescription = "name") }, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp))
        OutlinedTextField(value = email, onValueChange = onEmailChange, label = { Text("Enter your email") }, leadingIcon = { Icon(Icons.Default.Email, contentDescription = "person") }, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp))
        OutlinedTextField(value = password, onValueChange = onPasswordChange, label = { Text("Enter your password") }, leadingIcon = { Icon(Icons.Default.Warning, contentDescription = "password") }, modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp), visualTransformation = PasswordVisualTransformation(), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))
        OutlinedButton(onClick = { if (verifyUser(name, email, password, context)) navController.navigate(NextScreenPlease.namePage.withArgs(name)) }, modifier = Modifier.align(alignment = Alignment.CenterHorizontally).width(150.dp).height(70.dp).padding(top = 10.dp, bottom = 10.dp)) {
            Text("Login", textAlign = TextAlign.Center)
        }
    }
}
