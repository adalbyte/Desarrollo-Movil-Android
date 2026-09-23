package com.adalbyte.banderascompose

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalbyte.banderascompose.screens.BanderaScreen

@Composable
fun BanderaJapon(modifier: Modifier = Modifier) {
    BanderaScreen()
}

@Preview(showBackground = true)
@Composable
fun BanderaJaponPreview() {
    Surface {
        BanderaJapon(modifier = Modifier.fillMaxSize())
    }
}