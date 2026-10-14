package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.isDigitsOnly
import java.lang.Integer.parseInt

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    var resultado by rememberSaveable { mutableStateOf("0") };
    Column(modifier = modifier) {
        Column(modifier = Modifier.padding(0.dp)){
            Row(modifier = Modifier.padding(12.dp)){
                TextField(modifier = Modifier.weight(1f).border(1.dp, Color(0xFF000000)), value = resultado, onValueChange = {it -> if(it.isDigitsOnly()) resultado = it}, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            }
            Row(modifier = Modifier.padding(12.dp)){
                Button(modifier= Modifier.fillMaxWidth(), onClick = {}) {
                    Text("Calcular")
                }
            }

            for (i in 1..parseInt(resultado)){
                Text(text = "A")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        InicioScreen(modifier = Modifier.fillMaxSize())
    }
}