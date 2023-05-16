package com.galaxy.galaxyphoto.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.galaxy.galaxyphoto.tabhome.BottomBarNavigate
import com.galaxy.galaxyphoto.tabhome.DashBoardRouter
import com.galaxy.galaxyphoto.tabhome.ListBottomBar


@Composable
fun BottomBarScreen() {
    Scaffold(
        bottomBar = {
            Box(modifier = Modifier.navigationBarsPadding()) {
                BottomBarNavigate(ListBottomBar.listBottomBar)
            }
        }) {
        Box(
            modifier = Modifier.padding(it)
        ) {
            DashBoardRouter()
        }
    }
}