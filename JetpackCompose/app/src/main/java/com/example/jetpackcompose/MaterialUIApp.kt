package com.example.jetpackcompose

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MaterialUIApp() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Material App")
        }, actions = {
            IconButton(onClick = {
                Log.d(
                    "ButtonClicked", "Search Button Clicked"
                )
            }) {
                Icon(Icons.Filled.Search, contentDescription = null)
            }
        }

        )

    }

    ) {
        Column(
            modifier = Modifier
                .background(color = Color.LightGray)
//       .fillMaxHeight()
//       .fillMaxWidth()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ImageAssetExample()

            Row(
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                    )
                    .background(color = Color.LightGray)
//       .fillMaxHeight()
                    .fillMaxWidth()
//       .fillMaxSize()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ExtendedFloatingActionButton(onClick = { /* ... */ }, icon = {
                    Icon(
                        Icons.Filled.Favorite, contentDescription = "Favorite"
                    )
                }, text = { Text("Like") })
                Button(
                    onClick = { /* ... */ },
                    // Uses ButtonDefaults.ContentPadding by default
                    contentPadding = PaddingValues(
                        start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp
                    )
                ) {
                    // Inner content including an icon and a text label
                    Icon(
                        Icons.Filled.Share,
                        contentDescription = "Favorite",
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text("Share")
                }

            }
        }


    }
}