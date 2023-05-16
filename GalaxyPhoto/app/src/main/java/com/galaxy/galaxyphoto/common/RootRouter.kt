package com.galaxy.galaxyphoto.common

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import coil.annotation.ExperimentalCoilApi
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.nav.authGraph
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import kotlinx.coroutines.InternalCoroutinesApi

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@ExperimentalCoilApi
@InternalCoroutinesApi
@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@Composable
fun RootRouter() {
    val navController = rememberAnimatedNavController()
    RouterManager.current.navController = navController
    AnimatedNavHost(navController, startDestination = "HOME") {
        authGraph()
    }
}
