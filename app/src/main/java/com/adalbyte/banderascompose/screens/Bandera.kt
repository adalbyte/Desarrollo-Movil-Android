package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalbyte.banderascompose.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        // drawRect(...), drawPath(...), drawCircle(...), etc.
    }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Box(modifier = Modifier
            .aspectRatio(1f)
            .background(Color(0xFFFF0000))){
            Box(modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.2f)
                .fillMaxHeight(0.6f)
                .background(Color.White)
            )
            Box(modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.6f)
                .fillMaxHeight(0.2f)
                .background(Color.White)
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