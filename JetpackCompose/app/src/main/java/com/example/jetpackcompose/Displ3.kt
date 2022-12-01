package com.example.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Displ3() {
    Column {
        Text(text = "Hello Vasanth Sir", fontSize = 30.sp)
        Text(text = "Hello Puneet", fontSize = 30.sp)
        Text(text = "Hello Ratnesh", fontSize = 30.sp)
    }
}