package com.example.jetpackcompose

import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun SelectableText() {
    SelectionContainer {
        Text(text = "You can select the text", fontSize = 30.sp)
    }

}