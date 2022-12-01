package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .background(color = Color.Yellow)
            .fillMaxSize(.5f)
    ) {
        Text(text = "This is outer box")
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .fillMaxSize(.5f)
        ) {
            Text(text = "This is inner Box", fontSize = 30.sp, modifier = Modifier.align(Alignment.Center))
        }

    }
}