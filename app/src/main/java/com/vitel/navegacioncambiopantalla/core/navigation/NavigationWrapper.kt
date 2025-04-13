package com.vitel.navegacioncambiopantalla.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.vitel.navegacioncambiopantalla.DetailScreen
import com.vitel.navegacioncambiopantalla.HomeScreen
import com.vitel.navegacioncambiopantalla.LoginScreen
import com.vitel.navegacioncambiopantalla.SettingsScreen
import com.vitel.navegacioncambiopantalla.core.navigation.type.createNavType
import com.vitel.navegacioncambiopantalla.core.navigation.type.settingsInfoType
import kotlin.reflect.typeOf

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login>{
            LoginScreen{navController.navigate(Home)}
        }
        composable<Home>{
            HomeScreen{navController.navigate(Detail(it))}
        }

        composable<Detail> { backStackEntry ->
            val detail: Detail = backStackEntry.toRoute()
            DetailScreen(name = detail.name,
                navigateBack = {navController.navigateUp()},
                navigateToSettings = {navController.navigate(Settings(it))})
        }
        composable<Settings>(typeMap = mapOf(typeOf<Settingsinfo>() to createNavType<Settingsinfo>())){ backStackEntry ->
            val settings: Settings = backStackEntry.toRoute()
            SettingsScreen(settings.info)

        }
    }
}