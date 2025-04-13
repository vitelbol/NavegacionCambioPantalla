package com.vitel.navegacioncambiopantalla

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.vitel.navegacioncambiopantalla.core.navigation.Settingsinfo

@Composable
fun SettingsScreen(settingsinfo: Settingsinfo) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "SETTINGS SCREEN", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Text(text = settingsinfo.name)
        Text(text = settingsinfo.id.toString())
        Text(text = settingsinfo.darkmode.toString())
        Text(text = settingsinfo.suscribete.toString())
        Spacer(modifier = Modifier.weight(1f))
    }
}