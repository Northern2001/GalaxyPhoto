package com.galaxy.galaxyphoto.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.ext.InfiniteListHandler
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.screen.photodetail.ItemContentDetail
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import org.koin.androidx.compose.getViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(homeViewModel: HomeViewModel = getViewModel()) {

    val context = LocalContext.current
    var pagePhotoTopic by remember { mutableStateOf(1) }
    var pageTopic by remember { mutableStateOf(1) }
    val listState = rememberLazyGridState()
    val listStateRow = rememberLazyListState()
    val navController = RouterManager.current.navController
    var isReload by rememberSaveable { mutableStateOf(true) }

    fun getListPhoto(isLoadMore: Boolean = false) {
        homeViewModel.getListPhoto(context, isLoadMore = isLoadMore)
    }

    fun getPhotoWithTopic(isLoadMore: Boolean = false, slug: String = "") {
        pagePhotoTopic = if (isLoadMore) pagePhotoTopic else 1
        homeViewModel.getPhotoWithTopic(
            context,
            slug = slug,
            page = pagePhotoTopic,
            perPage = 10,
        ) { res ->
            homeViewModel.listPhoto =
                if (isLoadMore) homeViewModel.listPhoto.toMutableList().also { newData ->
                    newData.addAll(res)
                } else {
                    res
                }
            homeViewModel.reloadListPhoto()
        }
    }

    fun getTopics(isLoadMore: Boolean = false) {
        homeViewModel.getTopics(context,isLoadMore)
    }

    fun onRefresh() {
        getListPhoto()
        getTopics()
    }

    LaunchedEffect(Unit) {
        if (isReload) {
            onRefresh()
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            isReload = false
        }
    }

    BaseBackground(Modifier, onRefresh = { onRefresh() }) {
        if (homeViewModel.listTopics.isNotEmpty()) {
            LazyRow(
                state = listStateRow, modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                items(homeViewModel.listTopics) {
                    ItemTagPhoto(model = it) { modelSelected ->
                        homeViewModel.listTopics.find { it.isSelected }?.isSelected = false
                        it.isSelected = true
                        if (it.title == "For You") {
                            getListPhoto()
                        } else {
                            getPhotoWithTopic(slug = modelSelected.slug)
                        }
                        homeViewModel.reloadListTopic()
                    }
                }
            }
        }
        LazyVerticalGrid(state = listState, columns = GridCells.Fixed(2), content = {
            items(homeViewModel.listPhoto) {
                ItemContentDetail(model = it, onLongPress = {}, onClick = {
                    navController?.navigate(
                        DestinationNameWithParam.getPhotoDetail(it.id)
                    )
                })
            }
        })
    }

    listStateRow.InfiniteListHandler {
        pageTopic++
        getTopics(true)
    }

    listState.InfiniteListHandler {
        homeViewModel.pagePhoto++
        getListPhoto(true)
    }
}
