package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

        val lineaGuia1 = createGuidelineFromTop(0.33f)
        val lineaGuia2 = createGuidelineFromTop(0.66f)

        val (caja1, caja2, caja3, escudo) = createRefs()

        Box(modifier = Modifier.background(Color(0xFF74ACDF)).constrainAs(ref = caja1){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaGuia1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color(0xFFFFFF)).constrainAs(ref = caja2){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaGuia1)
            bottom.linkTo(lineaGuia2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.size(75.dp).clip(CircleShape).background(Color(0xFFF6B40E))
            .constrainAs(ref = escudo){
            start.linkTo(caja2.start)
            end.linkTo(caja2.end)
            top.linkTo(caja2.top)
            bottom.linkTo(caja2.bottom)
        })

        Box(modifier = Modifier.background(Color(0xFF74ACDF)).constrainAs(ref = caja3){
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