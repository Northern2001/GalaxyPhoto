package com.galaxy.galaxyphoto.screen.home

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.res.painterResource
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.nav.DestinationName
import com.galaxy.galaxyphoto.nav.RouterManager
import kotlinx.coroutines.delay

@Composable
fun SplashScreen() {
    val navController = RouterManager.current.navController

    LaunchedEffect(Unit) {
        delay(2000)
        navController?.navigate(
            DestinationName().bottomBar
        )
    }
    BaseBackground {
//        Image(
//            painter = painterResource(id = R.drawable),
//            contentDescription = ""
//        )


    }
}