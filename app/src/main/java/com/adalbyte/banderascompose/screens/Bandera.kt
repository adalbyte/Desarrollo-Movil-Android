package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.adalbyte.banderascompose.R
import kotlin.div
import kotlin.times
import kotlin.unaryMinus

fun DrawScope.mediaDiagonal(
    color: Color,
    esquina: Offset,
    centro: Offset,
    desplazamiento: Offset,
    grosor: Float
) {
    val dir = centro - esquina
    val unitario = dir / dir.getDistance()
    drawLine(
        color = color,
        start = esquina - unitario * (grosor * 2f) + desplazamiento,
        end = centro + desplazamiento,
        strokeWidth = grosor
    )
}

@Composable
fun CruzCentrada(color: Color, grosor: Float) {
    Column(Modifier.fillMaxSize()) {
        Spacer(Modifier.weight((30f - grosor) / 2f))
        Box(Modifier.weight(grosor).fillMaxWidth().background(color))
        Spacer(Modifier.weight((30f - grosor) / 2f))
    }
    Row(Modifier.fillMaxSize()) {
        Spacer(Modifier.weight((60f - grosor) / 2f))
        Box(Modifier.weight(grosor).fillMaxHeight().background(color))
        Spacer(Modifier.weight((60f - grosor) / 2f))
    }
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize().background(Color(0xFF012169))) {
        val (diagonales, cruzBlanca, cruzRoja) = createRefs()

        Canvas(modifier = Modifier.fillMaxSize().constrainAs(diagonales) {
                    centerTo(parent)
                }
        ) {
            val w = size.width
            val h = size.height
            val u = h / 30f
            val rojo = Color(0xFFC8102E)
            val largo = Offset(w, h).getDistance()
            val normalArribaDerecha = Offset(h, -w) / largo
            val normalArribaIzquierda = Offset(-h, -w) / largo
            val centro = Offset(w / 2f, h / 2f)

            clipRect {
                drawLine(Color.White, Offset(-2f * u, -2f * u * h / w), Offset(w + 2f * u, h + 2f * u * h / w), strokeWidth = 6f * u)
                drawLine(Color.White, Offset(w + 2f * u, -2f * u * h / w), Offset(-2f * u, h + 2f * u * h / w), strokeWidth = 6f * u)

                mediaDiagonal(rojo, Offset(0f, 0f), centro, normalArribaDerecha * (-u), 2f * u)
                mediaDiagonal(rojo, Offset(w, h), centro, normalArribaDerecha * u, 2f * u)
                mediaDiagonal(rojo, Offset(w, 0f), centro, normalArribaIzquierda * u, 2f * u)
                mediaDiagonal(rojo, Offset(0f, h), centro, normalArribaIzquierda * (-u), 2f * u)
            }
        }
        CruzCentrada(color = Color.White, grosor = 10f)
        CruzCentrada(color = Color(0xFFC8102E), grosor = 6f)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}