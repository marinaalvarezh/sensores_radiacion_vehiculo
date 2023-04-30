package com.example.sensores_radiacion_vehiculo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sensores_radiacion_vehiculo.screens.ScreenOne
import com.example.sensores_radiacion_vehiculo.screens.ScreenTwo


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.ScreenOne.route){
        composable(route = AppScreens.ScreenOne.route){
            ScreenOne(navController)
        }
        composable(route = AppScreens.ScreenTwo.route){
            ScreenTwo(navController)
        }
    }
}