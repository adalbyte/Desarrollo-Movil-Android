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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.adalbyte.banderascompose.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    val redColor = Color(0xFFdc143c)
    val blueColor = Color(0xFF001e60)

    ConstraintLayout(
        modifier = modifier
    ) {
        val (fondoCanvas) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(fondoCanvas) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val width = size.width
            val height = size.height

            val pathBordeAzul = Path().apply {
                moveTo(width * 0.1f, height * 0.05f)
                lineTo(width * 0.75f, height * 0.05f)
                lineTo(width * 0.35f, height * 0.52f)
                lineTo(width * 0.85f, height * 0.52f)
                lineTo(width * 0.1f, height * 0.95f)
                close()
            }
            drawPath(
                path = pathBordeAzul,
                color = blueColor
            )

            val pathRojo = Path().apply {
                moveTo(width * 0.13f, height * 0.08f)
                lineTo(width * 0.68f, height * 0.08f)
                lineTo(width * 0.32f, height * 0.50f)
                lineTo(width * 0.76f, height * 0.50f)
                lineTo(width * 0.13f, height * 0.90f)
                close()
            }
            drawPath(
                path = pathRojo,
                color = redColor
            )
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