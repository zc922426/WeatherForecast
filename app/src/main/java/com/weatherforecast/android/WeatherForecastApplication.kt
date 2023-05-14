package com.weatherforecast.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WeatherForecastApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "PuM62VOucxs4TMOF"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}