package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun lazyRowExample() {
    LazyRow(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically,
        contentPadding = PaddingValues(28.dp),
        horizontalArrangement = Arrangement.spacedBy(28.dp)

    ) {
//        item{Text(text="First Item", fontSize = 30.sp)}
        items(50) { i -> Text(text = "Item $i ", fontSize = 30.sp) }

    }
}