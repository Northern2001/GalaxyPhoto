package com.galaxy.galaxyphoto.tabhome

import androidx.compose.runtime.Composable
import com.galaxy.galaxyphoto.common.BottomBarManager
import com.galaxy.galaxyphoto.screen.home.HomeScreen
import com.galaxy.galaxyphoto.screen.profile.ProfileScreen

@Composable
fun DashBoardRouter() {
    when (BottomBarManager.current.tabSelected) {
        TabName.TAB_HOME -> {
            HomeScreen()

        }

        TabName.TAB_PROFILE -> {
            ProfileScreen()
        }
    }
}