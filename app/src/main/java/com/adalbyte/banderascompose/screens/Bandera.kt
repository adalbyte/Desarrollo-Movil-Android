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

        val lineaGuia1 = createGuidelineFromTop(0.25f)
        val lineaGuia2 = createGuidelineFromTop(0.75f)

        val (cajaRoja1, cajaAmarilla, cajaRoja2, bandera) = createRefs()

        Box(modifier = Modifier.background(Color(0xFFAA151B)).constrainAs(ref = cajaRoja1){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaGuia1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color(0xFFF1BF00)).constrainAs(ref = cajaAmarilla){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaGuia1)
            bottom.linkTo(lineaGuia2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Image(painter = painterResource(id = R.drawable.escudo_espa_a), contentDescription = "Escudo de España",
            modifier = Modifier.size(180.dp).constrainAs(ref = bandera){
            start.linkTo(cajaAmarilla.start)
            end.linkTo(cajaAmarilla.end)
            top.linkTo(cajaAmarilla.top)
            bottom.linkTo(cajaAmarilla.bottom)
            horizontalBias = 0.25f
        })

        Box(modifier = Modifier.background(Color(0xFFAA151B)).constrainAs(ref = cajaRoja2){
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