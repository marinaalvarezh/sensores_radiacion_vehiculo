package com.example.sensores_radiacion_vehiculo.screens

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sensores_radiacion_vehiculo.R
import com.example.sensores_radiacion_vehiculo.navigation.AppScreens

@Composable
fun ScreenOne(navController: NavController){
    BodyContent(navController)
}

@Composable
fun BodyContent(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(240.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderScreenOne()
        ScreenOneWithButtonAndImage(modifier = Modifier, navController)
    }
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
fun ScreenOneWithButtonAndImage(modifier : Modifier = Modifier, navController: NavController){
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
            onClick = { navController.navigate(AppScreens.ScreenTwo.route)},
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


