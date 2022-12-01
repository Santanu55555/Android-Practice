package com.example.basicnavigations

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 50.dp)
    ) {
        Text(text = "Homepage")
        Row(modifier=Modifier
            .fillMaxWidth()
            .height(45.dp)
            .padding(top = 10.dp)
            , verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center){
            Button(onClick = {
                navController.navigate("friendslist")
            }) {
                Text(text="friends page")
            }
            Button(onClick = {
                navController.navigate("profile")
            }) {
                Text(text = "profile page")
            }
        }
        Button(onClick = {
            navController.navigate("home")
        }) {
            Text(text = "Home")
        }
    }
}