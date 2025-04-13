package com.vitel.navegacioncambiopantalla.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vitel.navegacioncambiopantalla.HomeScreen
import com.vitel.navegacioncambiopantalla.LoginScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login>{
            LoginScreen{navController.navigate(Home)}
        }
        composable<Home>{
            HomeScreen()
        }

    }
}