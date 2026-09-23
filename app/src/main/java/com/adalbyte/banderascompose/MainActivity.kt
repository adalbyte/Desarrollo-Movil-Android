package com.adalbyte.banderascompose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adalbyte.banderascompose.screens.BanderaScreen

@Composable
fun BanderaEEUU(modifier: Modifier = Modifier) {
    BanderaScreen()
}

@Preview(showBackground = true)
@Composable
fun BanderaEEUUPreview() {
    Surface {
        BanderaEEUU(modifier = Modifier.fillMaxSize())
    }
}