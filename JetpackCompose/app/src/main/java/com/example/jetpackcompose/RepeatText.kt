package com.example.jetpackcompose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun RepeatText() {
    Text(text = "I am Real no ".repeat(10), fontSize = 30.sp, maxLines = 2)
}