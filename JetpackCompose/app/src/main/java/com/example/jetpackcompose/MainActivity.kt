package com.example.jetpackcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {

//                Displ()
//                Disp1("Santanu")
//                Displ3()
//                Displ4()
//                designedText()
//                RepeatText()
//                SelectableText()
//                RowExample()
//                ColumnExample()
//                lazyRowExample()
//                BoxExample()
                MaterialUIApp()
            }
        }
    }
}

