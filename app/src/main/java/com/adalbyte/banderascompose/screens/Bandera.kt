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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.widget.ConstraintLayout
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
    ConstraintLayout(modifier = modifier.fillMaxSize().background(Color.White)) {
        val (franja1, franja2, franja3, franja4, franja5, dibujo) = createRefs()

        val guia20 = createGuidelineFromTop(0.20f)
        val guia40 = createGuidelineFromTop(0.40f)
        val guia60 = createGuidelineFromTop(0.60f)
        val guia80 = createGuidelineFromTop(0.80f)

        Box(Modifier.background(Color(0xFF002A8F)).constrainAs(franja1) {
                    top.linkTo(parent.top)
                    bottom.linkTo(guia20)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
        })

        Box(Modifier.background(Color.White).constrainAs(franja2) {
                    top.linkTo(guia20)
                    bottom.linkTo(guia40)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
        })

        Box(Modifier.background(Color(0xFF002A8F)).constrainAs(franja3) {
                    top.linkTo(guia40)
                    bottom.linkTo(guia60)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
        })

        Box(
            Modifier.background(Color.White).constrainAs(franja4) {
                    top.linkTo(guia60)
                    bottom.linkTo(guia80)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
        })

        Box(Modifier.background(Color(0xFF002A8F)).constrainAs(franja5) {
                    top.linkTo(guia80)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
        })

        Canvas(modifier = Modifier.fillMaxSize().constrainAs(dibujo) {
                    centerTo(parent)
        }) {
            val h = size.height
            val anchoTriangulo = h / 2f

            val triangulo = Path().apply {
                moveTo(0f, 0f)
                lineTo(anchoTriangulo, h / 2f)
                lineTo(0f, h)
                close()
            }
 
            drawPath(path = triangulo, color = Color(0xFFCF142B))
            drawPath(path = estrellaPath(cx = anchoTriangulo / 3f, cy = h / 2f, rExterior = h * 0.17f), color = Color.White)
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