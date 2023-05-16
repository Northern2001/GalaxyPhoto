package com.galaxy.galaxyphoto.screen.home

import android.util.Log
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.common.ProgressManager
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = getViewModel()) {

    val context = LocalContext.current
    var listPhoto by remember { mutableStateOf(listOf<PhotoModel>()) }
    var listTopic by remember { mutableStateOf(listOf<TopicsModel>()) }
    var page by remember { mutableStateOf(1) }
    var pagePhotoTopic by remember { mutableStateOf(1) }
    var pageTopic by remember { mutableStateOf(1) }
    val listState = rememberLazyGridState()
    val listStateRow = rememberLazyListState()
    val navController = RouterManager.current.navController
//    var slug by remember { mutableStateOf("") }

    fun reloadList() {
        val dummy = listPhoto
        listPhoto = arrayListOf()
        listPhoto = dummy
    }

    fun reloadListTopic() {
        val dummy = listTopic
        listTopic = arrayListOf()
        listTopic = dummy
    }

    fun getListPhoto(isLoadMore: Boolean = false) {
        page = if (isLoadMore) page else 1
        homeViewModel.getListPhoto(context, page = page, onError = {
            Log.e("onError HomeScreen", it)
        }) { res ->
            listPhoto = if (isLoadMore) listPhoto.toMutableList().also { newData ->
                newData.addAll(res)
            } else {
                res
            }
            reloadList()
        }
    }

    fun getPhotoWithTopic(isLoadMore: Boolean = false, slug: String) {
        pagePhotoTopic = if (isLoadMore) pagePhotoTopic else 1
        homeViewModel.getPhotoWithTopic(
            context,
            slug = slug,
            page = pagePhotoTopic,
            perPage = 10,
        ) { res ->
            listPhoto = if (isLoadMore) listPhoto.toMutableList().also { newData ->
                newData.addAll(res)
            } else {
                res
            }
            reloadList()
        }
    }

    fun getTopics(isLoadMore: Boolean = false) {
        pageTopic = if (isLoadMore) pageTopic else 1
        homeViewModel.getTopics(
            context,
            page = pageTopic,
        ) { res ->
            listTopic = if (isLoadMore) listTopic.toMutableList().also { newData ->
                newData.addAll(res)
            } else {
                res
            }
            reloadListTopic()
        }
    }

    LaunchedEffect(Unit) {
        getListPhoto()
        getTopics()
    }

    BaseBackground {
        LazyRow(
            state = listStateRow,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
        ) {
            items(listTopic) {
                ItemTagPhoto(model = it) { modelSelected ->
                    listTopic.find { it.isSelected }?.isSelected = false
                    it.isSelected = true
                    getPhotoWithTopic(slug = modelSelected.slug)
                    reloadListTopic()
                }
            }
        }

        LazyVerticalGrid(
            state = listState,
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxHeight()
        ) {
            items(listPhoto) {
                ItemContentHome(it, onLongPress = {}) {modelSelect->
                    navController?.navigate(
                        DestinationNameWithParam.getPhotoDetail(it.id)
                    )
                }
            }
        }
    }
}
