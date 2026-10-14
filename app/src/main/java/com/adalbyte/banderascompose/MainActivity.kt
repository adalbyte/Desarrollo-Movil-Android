package com.adalbyte.banderascompose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adalbyte.banderascompose.screens.InicioScreen

@Composable
fun Inicio(modifier: Modifier = Modifier) {
    InicioScreen(modifier)
}

@Preview(showBackground = true)
@Composable
fun PruebasPreview() {
    Surface {
        Inicio(modifier = Modifier.fillMaxSize())
    }
}   