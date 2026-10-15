package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InicioScreen(modifier: Modifier = Modifier, lista: MutableList<String>) {
    var nombreTextField by rememberSaveable { mutableStateOf("") };

    Column(modifier = modifier) {
        Box(modifier = Modifier.fillMaxWidth().background(Color(0xFFCCCCCC))){
            Column(modifier = Modifier.padding(12.dp)){
                TextField(modifier = Modifier.fillMaxWidth().border(1.dp, Color(0xFF000000)), value = nombreTextField, onValueChange = {nombreTextField = it}, singleLine = true)
                Spacer(modifier = Modifier.padding(6.dp))
                Button(modifier= Modifier.fillMaxWidth(), onClick = { lista.add(nombreTextField); nombreTextField = ""}) {
                    Text("Agregar")
                }
            }
        }
        LazyColumn(modifier = Modifier.fillMaxWidth().weight(1f).padding(24.dp)) {

            items(lista){ nombre ->
                MiCard(modifier = modifier, nombre, { nombreTextField = nombre; lista.remove(nombre)}, {lista.remove(nombre)})
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioScreenPreview() {
    Surface {
        val ListaElementos = rememberSaveable { mutableStateListOf<String>("Ana", "Luis", "Carlos", "María") }
        InicioScreen(modifier = Modifier.fillMaxSize(), ListaElementos)
    }
}