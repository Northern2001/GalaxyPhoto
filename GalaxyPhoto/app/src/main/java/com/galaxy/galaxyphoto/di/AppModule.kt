package com.galaxy.galaxyphoto.di

import com.galaxy.galaxyphoto.GalaxyPhotoApplication
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModules = module {
    single { androidApplication() as GalaxyPhotoApplication }
}

val viewModelModule = module {
    factory { HomeViewModel(get()) }
}

val diModules = listOf(
    apisModule, viewModelModule, apisModule, appModules
)