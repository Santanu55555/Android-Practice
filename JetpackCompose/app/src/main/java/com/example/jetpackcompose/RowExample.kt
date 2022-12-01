package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .background(color = Color.LightGray)
//       .fillMaxHeight()
//       .fillMaxWidth()
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
//       Text(text="Hello, ", fontSize = 30.sp)
//       Text(text="i am ", fontSize = 30.sp)
//       Text(text="in a row ", fontSize = 30.sp)
//       Text(text="Hello, ", fontSize = 30.sp)
//       Text(text="i am ", fontSize = 30.sp)
//       Text(text="in a row ", fontSize = 30.sp)
//       Text(text="Hello, ", fontSize = 30.sp)
//       Text(text="i am ", fontSize = 30.sp)
//       Text(text="in a row ", fontSize = 30.sp)
//       Text(text="Hello, ", fontSize = 30.sp)
//       Text(text="i am ", fontSize = 30.sp)
//       Text(text="in a row ", fontSize = 30.sp)
        for (i in 0..50) {
            Text(text = "Hello, ", fontSize = 30.sp)
            Text(text = "i am ", fontSize = 30.sp)
            Text(text = "in a row ", fontSize = 30.sp)
        }
    }
}