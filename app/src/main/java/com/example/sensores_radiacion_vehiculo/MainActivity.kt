package com.example.sensores_radiacion_vehiculo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun ScreenOne(){    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(240.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderScreenOne()
        ScreenOneWithButtonAndImage(modifier = Modifier)
    }

    //Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally) {

    //}
}

@Composable
fun HeaderScreenOne() {
    Surface(color= MaterialTheme.colors.primary) {
        Text(
            stringResource(R.string.Beacon_Simulator_Text),
            color = MaterialTheme.colors.onPrimary,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun ScreenOneWithButtonAndImage(modifier : Modifier = Modifier){
    val image = painterResource(R.drawable.bluetooth_icon)
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(200.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary
            ),
            shape = RoundedCornerShape(15)
        ) {
            Text(
                stringResource(R.string.Search),
                fontSize = 24.sp,
                modifier = Modifier.padding(4.dp)
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Sensores_radiacion_vehiculoTheme {
        ScreenOne()
    }
}