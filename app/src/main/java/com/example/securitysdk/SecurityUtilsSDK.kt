package com.example.securitysdk

import android.view.Window
import com.example.securitysdk.utils.AntiScreenshot
import com.example.securitysdk.utils.DataObfuscation
import com.example.securitysdk.utils.RootChecker

object SecurityUtilsSDK {
    fun preventScreenshots(window: Window) {
        AntiScreenshot.preventScreenshots(window)
    }

    suspend fun isDeviceRooted(): Boolean {
        return RootChecker.isDeviceRooted()
    }

    fun obfuscateData(data: String): String {
        return DataObfuscation.obfuscateData(data)
    }

    fun deobfuscateData(obfuscatedData: String): String {
        return DataObfuscation.deobfuscateData(obfuscatedData)
    }
}