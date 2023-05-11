package com.galaxy.galaxyphoto

import android.app.Application
import com.galaxy.galaxyphoto.di.diModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GalaxyPhotoApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        //LRU cache : 32mb
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@GalaxyPhotoApplication)
            modules(diModules)
        }
    }


}