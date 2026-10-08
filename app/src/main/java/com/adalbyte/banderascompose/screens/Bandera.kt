package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.vector.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalbyte.banderascompose.R
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

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
    Box(modifier.fillMaxSize()) {
        Column(modifier.fillMaxSize()) {
            for (i in 0 until 5) {
                Box(
                    Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(if (i % 2 == 0) Color(0xFF002A8F) else Color.White)
                )
            }
        }
        Canvas(modifier.fillMaxSize()) {
            val h = size.height
            val anchoTriangulo = h/2f
            val triangulo = Path().apply {
                moveTo(0f, 0f)
                lineTo(anchoTriangulo, h / 2f)
                lineTo(0f, h)
                close()
            }
            drawPath(triangulo, color = Color(0xFFCF142B))
            // Centroide en x = anchoTriangulo / 3, y = h / 2 por simetría
            drawPath(
                path = estrellaPath(cx = anchoTriangulo / 3f, cy = h / 2f, rExterior = h * 0.17f),
                color = Color.White)
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