package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "B0vxuONhq3lZW2oD"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}

/**
 * Remember to add the following code to the AndroidManifest.xml file
 * <application
 *    android:name=".SunnyWeatherApplication"
 *    ...>
 */