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
import androidx.constraintlayout.widget.ConstraintLayout
import com.adalbyte.banderascompose.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier){

        val lineaGuia1 = createGuidelineFromStart(0.3333f)
        val lineaGuia2 = createGuidelineFromStart(0.6666f)

        val (cajaVerde, cajaBlanca, cajaRoja, bandera) = createRefs()

        Box(modifier = Modifier.background(Color.Green).constrainAs(ref = cajaVerde){
            start.linkTo(parent.start)
            end.linkTo(lineaGuia1)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(ref = cajaBlanca){
            start.linkTo(lineaGuia1)
            end.linkTo(lineaGuia2)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Image(painter = painterResource(id = R.drawable.escudo_mexico),
            contentDescription = "Escudo nacional",
            modifier = Modifier.size(80.dp).constrainAs(ref = bandera){
                    start.linkTo(lineaGuia1)
                    end.linkTo(lineaGuia2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
        })

        Box(modifier = Modifier.background(Color.Red).constrainAs(ref = cajaRoja){
            start.linkTo(lineaGuia2)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
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


