package com.example.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Displ4() {
    val names = listOf<String>("HTML", "CSS", "React", "Kotlin", "Android")
    Column {
        for (name in names) {
            Text(text = "Hello $name", fontSize = 30.sp)
        }
    }
}