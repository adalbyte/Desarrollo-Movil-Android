package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import java.lang.Integer.parseInt

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    var resultado by rememberSaveable { mutableStateOf(0) };
    Column(modifier = modifier) {
        Text(modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, text = resultado.toString(), fontSize = 50.sp)
        Button(modifier= Modifier.fillMaxWidth(), onClick = {resultado++}) {
            Text("Presioname")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioScreenPreview() {
    Surface {
        InicioScreen(modifier = Modifier.fillMaxSize())
    }
}