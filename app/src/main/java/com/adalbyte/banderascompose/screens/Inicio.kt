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
    var resultado by rememberSaveable { mutableStateOf(0) };
    var numero1 by rememberSaveable { mutableStateOf("0") };
    var numero2 by rememberSaveable { mutableStateOf("0") };
    Column(modifier = modifier) {
        Text(modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, text = resultado.toString(), fontSize = 50.sp)

        Column(modifier = Modifier.padding(0.dp)){
            Row(modifier = Modifier.padding(12.dp)){
                TextField(modifier = Modifier.weight(1f).border(1.dp, Color(0xFF000000)), value = numero1, onValueChange = {it -> if(it.isDigitsOnly()) numero1 = it}, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
                Spacer(modifier = Modifier.padding(12.dp))
                TextField(modifier = Modifier.weight(1f).border(1.dp, Color(0xFF000000)), value = numero2, onValueChange = {it -> if(it.isDigitsOnly()) numero2 = it}, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            }
            Row(modifier = Modifier.padding(12.dp)){
                Button(modifier= Modifier.fillMaxWidth(), onClick = {resultado = parseInt(numero1) + parseInt(numero2)}) {
                    Text("Calcular")
                }
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