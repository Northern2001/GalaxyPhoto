package com.galaxy.galaxyphoto.screen.searchphoto

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseTextField
import com.galaxy.galaxyphoto.domain.Contains
import com.galaxy.galaxyphoto.ext.InfiniteListHandler
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.screen.photodetail.ItemContentDetail
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import org.koin.androidx.compose.getViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SearchPhotoScreen(homeViewModel: HomeViewModel = getViewModel()) {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    var searchValue by remember { mutableStateOf("") }
    var isSearch by remember { mutableStateOf(false) }
    val uiScope = CoroutineScope(Dispatchers.Main)
    val listState = rememberLazyGridState()
    var page by remember { mutableStateOf(1) }


    fun searchPhoto(isLoadMore: Boolean = false) {
        page = if (isLoadMore) page else 1
        homeViewModel.searchPhotos(context, query = searchValue, page = page) {
            homeViewModel.listPhotoSearch =
                if (isLoadMore)
                    homeViewModel.listPhotoSearch.toMutableList().also { newData ->
                        newData.addAll(it.results)
                    }
                else
                    it.results
        }
    }

    LaunchedEffect(searchValue) {
        if (isSearch) {
            delay(Contains.TIME_SEARCH)
            searchPhoto()
        }
    }

    BaseBackground(Modifier, onRefresh = {searchPhoto()}) {
        BaseTextField(
            value = searchValue,
            onChangeValue = {
                isSearch = true
                searchValue = it
            },
            placeholder = "Search here",
            leadingIcon = R.drawable.ic_search
        )

        LazyVerticalGrid(state = listState, columns = GridCells.Fixed(2), content = {
            items(homeViewModel.listPhotoSearch) {
                ItemContentDetail(model = it, onLongPress = {}, onClick = {
                    navController?.navigate(
                        DestinationNameWithParam.getPhotoDetail(it.id)
                    )
                })

            }
        })
    }

    listState.InfiniteListHandler {
        page++
        searchPhoto(true)
    }
}