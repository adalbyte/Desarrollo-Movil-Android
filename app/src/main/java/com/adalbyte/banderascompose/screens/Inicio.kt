package com.adalbyte.banderascompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        InicioScreen(modifier = Modifier.fillMaxSize())
    }
}