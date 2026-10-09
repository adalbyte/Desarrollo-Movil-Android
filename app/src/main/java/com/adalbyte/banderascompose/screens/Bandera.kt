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
import com.adalbyte.banderascompose.R
import kotlin.math.cos
import kotlin.math.sin

fun estrellaPath(
    cx: Float,
    cy: Float,
    rExterior: Float,
    rInterior: Float = rExterior * 0.382f,
    puntas: Int = 5,
    rotacionGrados: Float = -90f
): Path {
    val path = Path()
    val vertices = puntas * 2
    for (i in 0 until vertices) {
        val radio = if (i % 2 == 0) rExterior else rInterior
        val angulo = Math.toRadians((rotacionGrados + i * 360f / vertices).toDouble())
        val x = cx + radio * cos(angulo).toFloat()
        val y = cy + radio * sin(angulo).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = Color(0xFFE30A17)) // fondo rojo
        val cy = size.height / 2f
        val rOut = size.height * 0.30f
        drawCircle(color = Color.White, radius = rOut,
            center = Offset(size.width * 0.38f, cy))
        drawCircle(color = Color(0xFFE30A17), radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy))
        drawPath(estrellaPath(size.height / 1.5f, size.height / 2f, rExterior = 200f),Color(0xFFFFFFFF))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}