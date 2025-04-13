package com.vitel.navegacioncambiopantalla.core.navigation.type

import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.navigation.NavType
import com.vitel.navegacioncambiopantalla.core.navigation.Settingsinfo
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

val settingsInfoType = object : NavType<Settingsinfo>(isNullableAllowed = true) {
    override fun get(bundle: Bundle, key: String): Settingsinfo? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            bundle.getParcelable(key, Settingsinfo::class.java)
        } else {
            bundle.getParcelable(key)
        }
    }

    override fun parseValue(value: String): Settingsinfo {
        return Json.decodeFromString<Settingsinfo>(value)
    }

    override fun serializeAsValue(value: Settingsinfo): String {
        return Uri.encode(Json.encodeToString(value))
    }


    override fun put(bundle: Bundle, key: String, value: Settingsinfo) {
        bundle.putParcelable(key, value)
    }

}