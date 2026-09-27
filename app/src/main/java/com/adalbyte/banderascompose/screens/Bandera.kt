package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.adalbyte.banderascompose.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier){

        val lineaGuia1 = createGuidelineFromTop(0.3333f)
        val lineaGuia2 = createGuidelineFromTop(0.6666f)

        val (cajaNegra, cajaRoja, cajaAmarilla) = createRefs()

        Box(modifier = Modifier.background(Color.Black).constrainAs(ref = cajaNegra){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaGuia1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color(0xFFDD0000)).constrainAs(ref = cajaRoja){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaGuia1)
            bottom.linkTo(lineaGuia2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color(0xFFFFCE00)).constrainAs(ref = cajaAmarilla){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaGuia2)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}