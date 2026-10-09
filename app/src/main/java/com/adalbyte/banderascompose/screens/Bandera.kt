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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.adalbyte.banderascompose.R
import kotlin.math.PI
import kotlin.math.sin

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    @Composable
    fun BanderaButan(modifier: Modifier = Modifier) {
        val ButanOrange = Color(0xFFffd520)
        val ButanYellow = Color(0xFFff4e12)
        ConstraintLayout(modifier = modifier) {
            val (fondoCanvas, dragonImage) = createRefs()

            Canvas(modifier = Modifier.fillMaxSize().constrainAs(fondoCanvas) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }) {
                val width = size.width
                val height = size.height

                val pathYellow = Path().apply {
                    moveTo(0f, 0f)
                    lineTo(width, 0f)
                    lineTo(0f, height)
                    close()
                }
                drawPath(path = pathYellow, color = ButanYellow)

                val pathOrange = Path().apply {
                    moveTo(width, 0f)
                    lineTo(width, height)
                    lineTo(0f, height)
                    close()
                }
                drawPath(path = pathOrange, color = ButanOrange)
            }

            Image(painter = painterResource(id = R.drawable.dragon_butan),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(0.6f)
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