package com.galaxy.galaxyphoto.screen.searchphoto

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseScrollview
import com.galaxy.galaxyphoto.base.BaseTextField
import com.galaxy.galaxyphoto.domain.Contains
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.screen.photodetail.ItemContentDetail
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import com.google.accompanist.flowlayout.FlowRow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import org.koin.androidx.compose.getViewModel

@Composable
fun SearchPhotoScreen(homeViewModel: HomeViewModel = getViewModel()) {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    var searchValue by remember { mutableStateOf("") }
    var isSearch by remember { mutableStateOf(false) }
    val uiScope = CoroutineScope(Dispatchers.Main)

    fun searchPhoto() {
        homeViewModel.searchPhotos(context, query = searchValue) {
            homeViewModel.listPhotoSearch = it.results
        }
    }

    LaunchedEffect(searchValue) {
        if (isSearch) {
            delay(Contains.TIME_SEARCH)
            searchPhoto()
        }
    }

    BaseBackground(Modifier) {
        BaseScrollview() {
            BaseTextField(
                value = searchValue,
                onChangeValue = {
                    isSearch = true
                    searchValue = it
                },
                placeholder = "Search here",
                leadingIcon = R.drawable.ic_search
            )

            FlowRow(Modifier.padding(horizontal = 6.dp, vertical = 12.dp)) {
                homeViewModel.listPhotoSearch.forEach {
                    ItemContentDetail(it, onLongPress = {}) { modelSelect ->
                        navController?.navigate(
                            DestinationNameWithParam.getPhotoDetail(modelSelect.id)
                        )
                    }
                }
            }
        }
    }
}