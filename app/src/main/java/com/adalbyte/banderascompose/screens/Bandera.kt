package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.adalbyte.banderascompose.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize().background(Color.White)) {
        val (bandera) = createRefs()

        Canvas(modifier = Modifier.fillMaxSize().constrainAs(bandera) {
                    centerTo(parent)
        }) {
            val w = size.width
            val h = size.height

            val origen = Offset(0f, h)

            val puntosBorde = listOf(
                Offset(0f, 0f),
                Offset(w / 3f, 0f),
                Offset(2f * w / 3f, 0f),
                Offset(w, 0f),
                Offset(w, h / 3f),
                Offset(w, h)
            )

            val colores = listOf(
                Color(0xFF003F87), // Azul
                Color(0xFFFCD856), // Amarillo
                Color(0xFFD62828), // Rojo
                Color.White,       // Blanco
                Color(0xFF007A3D)  // Verde
            )

            for (i in colores.indices) {
                val franja = Path().apply {
                    moveTo(origen.x, origen.y)
                    lineTo(puntosBorde[i].x, puntosBorde[i].y)
                    lineTo(puntosBorde[i + 1].x, puntosBorde[i + 1].y)
                    close()
                }

                drawPath(path = franja, color = colores[i])
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}