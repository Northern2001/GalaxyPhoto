package com.galaxy.galaxyphoto.tabhome

import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.common.BottomBarModel

object ListBottomBar {
    val listBottomBar = listOf(
        BottomBarModel(icon = R.drawable.ic_home,TabName.TAB_HOME),
        BottomBarModel(icon = R.drawable.ic_person,TabName.TAB_PROFILE),
        BottomBarModel(icon = R.drawable.ic_search,TabName.TAB_SEARCH),
        BottomBarModel(icon = R.drawable.ic_collection,TabName.TAB_COLLECTION)
    )
}