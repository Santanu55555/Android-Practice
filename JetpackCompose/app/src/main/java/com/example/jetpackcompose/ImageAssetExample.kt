package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageAssetExample(){
   Box(){
       Image(
           painter = painterResource(id = R.drawable.shradha),
           contentDescription = "Profile Image",
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .border(5.5.dp, Color.Red, CircleShape)
               .size(300.dp)
               .clip(shape = CircleShape)
       )
   }
}