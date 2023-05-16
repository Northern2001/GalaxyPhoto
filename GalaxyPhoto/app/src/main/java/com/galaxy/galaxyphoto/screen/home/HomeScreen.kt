package com.galaxy.galaxyphoto.screen.home

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseScrollview
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.screen.photodetail.ItemContentDetail
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import com.google.accompanist.flowlayout.FlowRow
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = getViewModel()) {

    val context = LocalContext.current
    var page by remember { mutableStateOf(1) }
    var pagePhotoTopic by remember { mutableStateOf(1) }
    var pageTopic by remember { mutableStateOf(1) }
    val listState = rememberLazyGridState()
    val listStateRow = rememberLazyListState()
    val navController = RouterManager.current.navController
    var isReload by rememberSaveable { mutableStateOf(true) }

//    var slug by remember { mutableStateOf("") }



    fun getListPhoto(isLoadMore: Boolean = false) {
        page = if (isLoadMore) page else 1
        homeViewModel.getListPhoto(context, page = page, onError = {
            Log.e("onError HomeScreen", it)
        }) { res ->
            homeViewModel.listPhoto = if (isLoadMore) homeViewModel.listPhoto.toMutableList().also { newData ->
                newData.addAll(res)
            } else {
                res
            }
            homeViewModel.reloadListPhoto()
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
            homeViewModel.listPhoto = if (isLoadMore) homeViewModel.listPhoto.toMutableList().also { newData ->
                newData.addAll(res)
            } else {
                res
            }
            homeViewModel.reloadListPhoto()
        }
    }

    fun getTopics(isLoadMore: Boolean = false) {
        pageTopic = if (isLoadMore) pageTopic else 1
        homeViewModel.getTopics(
            context,
            page = pageTopic,
        ) { res ->
            homeViewModel.listTopics = if (isLoadMore) homeViewModel.listTopics.toMutableList().also { newData ->
                newData.addAll(res)
            } else {
                res
            }
            homeViewModel.reloadListTopic()
        }
    }

    LaunchedEffect(Unit) {
        if (isReload){
            getListPhoto()
            getTopics()
        }
    }

    DisposableEffect(Unit){
        onDispose {
            isReload = false
        }
    }
    BaseBackground (Modifier){
        BaseScrollview(){
            if (homeViewModel.listTopics.isNotEmpty()) {
                LazyRow(
                    state = listStateRow,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    items(homeViewModel.listTopics) {
                        ItemTagPhoto(model = it) { modelSelected ->
                            homeViewModel.listTopics.find { it.isSelected }?.isSelected = false
                            it.isSelected = true
                            getPhotoWithTopic(slug = modelSelected.slug)
                            homeViewModel.reloadListTopic()
                        }
                    }
                }
            }
            AnimatedVisibility(visible = homeViewModel.listPhoto.isNotEmpty()) {
                FlowRow(Modifier.padding(horizontal = 6.dp, vertical = 12.dp)) {
                    homeViewModel.listPhoto.forEach {
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
}
