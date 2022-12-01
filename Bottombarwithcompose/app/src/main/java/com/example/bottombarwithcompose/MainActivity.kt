package com.example.bottombarwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.bottombarwithcompose.ui.theme.BottomBarwithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarwithComposeTheme {
                Navigation()
            }
        }
    }
}

