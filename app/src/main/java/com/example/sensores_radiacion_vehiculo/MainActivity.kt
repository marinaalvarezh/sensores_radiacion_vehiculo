package com.example.sensores_radiacion_vehiculo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensores_radiacion_vehiculo.ui.theme.Sensores_radiacion_vehiculoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sensores_radiacion_vehiculoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ScreenOne()
                }
            }
        }
    }
}

@Composable
fun ScreenOne(){
    HeaderScreenOne(name = stringResource(R.string.Beacon_Simulator_Text))
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally) {
        ImageBluetoothScreenOne()
    }
}

@Composable
fun HeaderScreenOne(name: String) {
    Surface(color= Color.Blue) {
        Text(
            text = "$name",
            color = Color.White,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun ImageBluetoothScreenOne(){
    val image = painterResource(R.drawable.bluetooth_icon)
    Image(
        painter = image,
        contentDescription = null,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Sensores_radiacion_vehiculoTheme {
        ScreenOne()
    }
}