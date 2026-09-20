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
fun BanderaColombia(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()
            .background(Color(0xFFFFFF00)))
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color(0xFF0000FF)))
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color(0xFFFF0000)))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    Surface {
        BanderaColombia(modifier = Modifier.fillMaxSize())
    }
}
