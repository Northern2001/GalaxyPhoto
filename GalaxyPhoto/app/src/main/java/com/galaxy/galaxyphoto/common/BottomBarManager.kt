package com.galaxy.galaxyphoto.common

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.galaxy.galaxyphoto.tabhome.TabName

class BottomBarManager : ViewModel() {
    var tabSelected by mutableStateOf(TabName.TAB_HOME)

    companion object {
        val current = BottomBarManager()
    }


    fun onSelectedTabBar(tab: String) {
        current.tabSelected = tab
    }
}