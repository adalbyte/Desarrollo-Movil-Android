package com.adalbyte.banderascompose

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color(0xFFAA151B)))
        Row(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()
            .background(Color(0xFFF1BF00)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Image(painter = painterResource(id = R.drawable.escudo_espa_a), contentDescription = "Escudo de España")
        }
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color(0xFFAA151B)))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    Surface {
        BanderaEspana(modifier = Modifier.fillMaxSize())
    }
}
