package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalbyte.banderascompose.R
import kotlin.math.cos
import kotlin.math.sin

fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize().background(Color.White)) {
        Column(Modifier.fillMaxSize()) {
            Spacer(Modifier.weight(15f))
            Box(Modifier.weight(25f).fillMaxWidth().background(Color(0xFF0038B8)))
            Spacer(Modifier.weight(80f))
            Box(Modifier.weight(25f).fillMaxWidth().background(Color(0xFF0038B8)))
            Spacer(Modifier.weight(15f))
        }
    }

    Canvas(modifier = modifier.fillMaxSize()) {
        val h = size.height
        val azul = Color(0xFF0038B8)
        val cx = size.width / 2f
        val cy = h / 2f
        val r = h * 30f / 160f
        val trazo = Stroke(width = h * 5.5f / 160f, join = StrokeJoin.Miter)
        drawPath(trianglePath(cx, cy, r, -90f), color = azul, style = trazo)
        drawPath(trianglePath(cx, cy, r, 90f), color = azul, style = trazo)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}