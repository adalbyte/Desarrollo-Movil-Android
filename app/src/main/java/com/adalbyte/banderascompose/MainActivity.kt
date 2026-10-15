package com.adalbyte.banderascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adalbyte.banderascompose.screens.InicioScreen
import com.adalbyte.banderascompose.ui.theme.PracticaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val ListaElementos = rememberSaveable { mutableStateListOf<String>("Ana", "Luis", "Carlos", "María") }
                    InicioScreen(modifier = Modifier.fillMaxSize().padding(innerPadding), ListaElementos)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioPreview() {
    Surface {
        val ListaElementos = rememberSaveable { mutableStateListOf<String>("Ana", "Luis", "Carlos", "María") }
        InicioScreen(modifier = Modifier.fillMaxSize(), ListaElementos)
    }
}   