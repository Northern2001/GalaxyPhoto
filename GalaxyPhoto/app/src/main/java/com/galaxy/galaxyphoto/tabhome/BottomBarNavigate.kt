package com.galaxy.galaxyphoto.tabhome

import androidx.compose.foundation.Image
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.common.BottomBarManager
import com.galaxy.galaxyphoto.common.BottomBarModel

@Composable
fun BottomBarNavigate(tabs: List<BottomBarModel>) {
    BottomNavigation(
        backgroundColor = Color.Black,
        elevation = 0.dp
    ) {
        tabs.forEach { tab ->
            BottomNavigationItem(selected = false, onClick = {
                BottomBarManager.current.onSelectedTabBar(tab.tabName)
            }, icon = {
                Image(
                    painter = painterResource(id = tab.icon),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(
                        Color.White.copy(
                            if (BottomBarManager.current.tabSelected == tab.tabName)
                                1f
                            else
                                0.5f
                        )
                    )
                )
            })
        }
    }
}