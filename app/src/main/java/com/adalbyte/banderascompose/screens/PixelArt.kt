package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PixelArtScreen(modifier: Modifier = Modifier) {
    val pixel = 16.dp
    val Blanco = Color(0xFFFFFFFF)
    val Contorno = Color(0xFF0E0040)
    val Sombras = Color(0xFFD6D8ff)
    val SombraFuerte = Color(0xFF8C92FF)
    val BocaDentro = Color(0xFFD80029)
    val Lengua = Color(0xFFF15666)

    Column() {
        Row() {
            Box(modifier = Modifier.width(pixel*6).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*4).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*4).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*7).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*10).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(SombraFuerte)){}
            Box(modifier = Modifier.width(pixel*13).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(SombraFuerte)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(SombraFuerte)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(SombraFuerte)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(SombraFuerte)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(SombraFuerte)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*4).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*13).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(BocaDentro)){}
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(BocaDentro)){}
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(BocaDentro)){}
            Box(modifier = Modifier.width(pixel*6).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(BocaDentro)){}
            Box(modifier = Modifier.width(pixel*7).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.size(pixel).background(BocaDentro)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Sombras)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.width(pixel*4).height(pixel).background(Sombras)){}
            Box(modifier = Modifier.width(pixel*2).height(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.width(pixel*4).height(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*4).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Lengua)){}
            Box(modifier = Modifier.size(pixel).background(Contorno)){}
        }
        Row() {
            Box(modifier = Modifier.width(pixel*5).height(pixel).background(Blanco)){}
            Box(modifier = Modifier.width(pixel*3).height(pixel).background(Contorno)){}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PixelArtScreenPreview() {
    Surface {
        PixelArtScreen(modifier = Modifier.fillMaxSize())
    }
}