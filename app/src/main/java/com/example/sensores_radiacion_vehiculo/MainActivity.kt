package com.example.sensores_radiacion_vehiculo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sensores_radiacion_vehiculo.navigation.AppNavigation
import com.example.sensores_radiacion_vehiculo.ui.theme.Sensores_radiacion_vehiculoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sensores_radiacion_vehiculoTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Sensores_radiacion_vehiculoTheme {
        AppNavigation()
    }
}