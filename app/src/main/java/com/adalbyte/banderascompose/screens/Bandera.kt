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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalbyte.banderascompose.R
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

fun trianguloAsta(h: Float, apiceX: Float, theta: Float, d: Float): Path {
    val yBase = d / cos(theta)
    val xPunta = apiceX - d / sin(theta)
    return Path().apply {
        moveTo(0f, yBase)
        lineTo(xPunta, h / 2f)
        lineTo(0f, h - yBase)
        close()
    }
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xff001489)))
            Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFFFB81C)))
        }
        Canvas(Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height

            clipRect {
                val apice = Offset(w * 0.36f, h / 2f)
                val theta = atan2(h / 2f, apice.x)

                val grosorVerde = h / 5f
                val grosorBlanco = grosorVerde + 2f * (h / 15f)

                drawLine(Color.White, Offset(0f, 0f), apice, size.height * 0.30f)
                drawLine(Color.White, Offset(0f, size.height), apice, size.height * 0.30f)
                drawLine(Color.White, apice, Offset(size.width, size.height * 0.14f), size.height * 0.30f)
                drawLine(Color.White, apice, Offset(size.width, size.height * 0.86f), size.height * 0.30f)

                drawLine(Color(0xFF007a3d), Offset(0f, 0f), apice, size.height * 0.20f)
                drawLine(Color(0xFF007a3d), Offset(0f, size.height), apice, size.height * 0.20f)
                drawLine(Color(0xFF007a3d), apice, Offset(size.width, size.height * 0.14f), size.height * 0.20f)
                drawLine(Color(0xFF007a3d), apice, Offset(size.width, size.height * 0.86f), size.height * 0.20f)



                val mitadVerde = grosorVerde / 2f
                drawPath(trianguloAsta(h, apice.x, theta, mitadVerde + h / 15f), Color.Black)
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