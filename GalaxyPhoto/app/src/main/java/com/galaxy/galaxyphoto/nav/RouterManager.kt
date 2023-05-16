package com.galaxy.galaxyphoto.nav

import androidx.navigation.NavController

class RouterManager {
    var navController: NavController? = null
    companion object{
        val current = RouterManager()
    }
}