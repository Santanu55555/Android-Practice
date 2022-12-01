package com.example.basicnavigations

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController

@Composable
fun Profile(navController: NavController){
   Column{
       Text(text = "Profile")
       Button(onClick = {
           navController.navigate("friendslist"){
               popUpTo("home")
           }

       }) {
           Text(text="Lets go the friends page")
       }
       Button(onClick = {
           navController.navigate("home")
       }) {
           Text(text = "Home")
       }
   }
}
