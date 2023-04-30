package com.example.sensores_radiacion_vehiculo.navigation

sealed class AppScreens(val route: String){
    object ScreenOne: AppScreens("screen_one")
    object ScreenTwo: AppScreens("screen_two")
}