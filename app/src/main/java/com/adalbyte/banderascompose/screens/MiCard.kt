package com.adalbyte.banderascompose.screens

import android.widget.Space
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MiCard(modifier: Modifier, nombre: String){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(70.dp)
        .border(1.dp, color = Color(0xFF000000), shape = RoundedCornerShape(12.dp))
        , contentAlignment = Alignment.Center){
        Row(){
            Text(nombre, modifier = Modifier.fillMaxWidth(0.7f))
        }
    }
    Spacer(modifier = Modifier.padding(10.dp))

}

@Preview(showBackground = true)
@Composable
fun MiCardPreview(){
    MiCard(Modifier.fillMaxSize(), "Hola")
}