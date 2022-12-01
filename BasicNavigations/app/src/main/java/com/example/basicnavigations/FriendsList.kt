package com.example.basicnavigations

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun FriendsList(navController: NavController){
   Column{
       Text(text = "FriendList")
       Button(onClick = {
           navController.navigate("profile"){
               popUpTo("home")

           }
       }) {
           Text(text = "Lets go the profile page")
       }
       Button(onClick = {
           navController.navigate("home")
       }) {
           Text(text = "Home")
       }
   }
}

