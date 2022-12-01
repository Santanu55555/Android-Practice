package com.example.jetpackcompose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Disp1(name: String) {
    Text(text = "Hello $name", fontSize = 30.sp)
}