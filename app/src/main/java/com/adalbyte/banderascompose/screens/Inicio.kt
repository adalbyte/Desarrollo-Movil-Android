package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    val ListaElementos = rememberSaveable { mutableStateListOf<String>("Ana", "Luis", "Carlos", "María") }
    LazyColumn(modifier = Modifier.fillMaxWidth().padding(24.dp)) {

        items(ListaElementos){ nombre ->
            MiCard(modifier = modifier, nombre)
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