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
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalbyte.banderascompose.R
import kotlin.math.cos
import kotlin.math.sin
import kotlin.times

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

fun avePath(cx: Float, cy: Float, s: Float): Path {
    fun x(v: Float) = cx + v * s
    fun y(v: Float) = cy + v * s
    return Path().apply {
        moveTo(x(-0.90f), y(-0.10f))
        lineTo(x(-0.60f), y(-0.25f))
        lineTo(x(-0.35f), y(-0.20f))
        lineTo(x(-0.20f), y(-0.50f))
        lineTo(x(0.10f), y(-0.25f))
        lineTo(x(0.35f), y(-0.45f))
        lineTo(x(0.45f), y(-0.10f))
        quadraticBezierTo(x(0.80f), y(0.10f), x(1.00f), y(0.55f))
        quadraticBezierTo(x(0.70f), y(0.35f), x(0.30f), y(0.25f))
        quadraticBezierTo(x(0.45f), y(0.70f), x(0.20f), y(0.90f))
        quadraticBezierTo(x(0.00f), y(0.55f), x(-0.15f), y(0.30f))
        lineTo(x(-0.40f), y(0.25f))
        lineTo(x(-0.55f), y(0.05f))
        close()
    }
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        Canvas(Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height
            val trianguloRojo = Path().apply {
                moveTo(0f, 0f)
                lineTo(w, 0f)
                lineTo(w, h)
                close()
            }
            drawPath(path = trianguloRojo, color = Color(0xFFCE1126))
            drawPath(
                path = avePath(cx = w * 0.25f, cy = h * 0.30f, s = h * 0.20f),
                color = Color(0xFFFCD116)
            )

            val centro = Offset(size.width * 0.60f, h * 0.70f)
            drawPath(path = estrellaPath(cx = centro.x + 0 * h, cy = centro.y + 0 * h, rExterior = 0.05f * h), color = Color.White)
            drawPath(path = estrellaPath(cx = centro.x + 0.25f * h, cy = centro.y - 0.10f * h, rExterior = 0.05f * h), color = Color.White)
            drawPath(path = estrellaPath(cx = centro.x + 0.50f * h, cy = centro.y - 0.20f * h, rExterior = 0.05f * h), color = Color.White)
            drawPath(path = estrellaPath(cx = centro.x + 0.75f * h, cy = centro.y - 0.30f * h, rExterior = 0.05f * h), color = Color.White)
            drawPath(path = estrellaPath(cx = centro.x + 0.60f * h, cy = centro.y - 0.40f * h, rExterior = 0.05f * h), color = Color.White)
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