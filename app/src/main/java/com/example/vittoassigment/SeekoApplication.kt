package com.example.vittoassigment

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class VittoApplication : Application() {

    companion object{
        @JvmStatic
        var instance :VittoApplication?= null
    }

    override fun onCreate() {
        super.onCreate()
        instance=this
    }

}