package com.vitel.navegacioncambiopantalla.core.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detail(val name: String)

@Serializable
data class Settings(val info:Settingsinfo)

@Parcelize
@Serializable
data class Settingsinfo(val name:String, val id:Int, val darkmode:Boolean, val suscribete: Boolean ) :
    Parcelable