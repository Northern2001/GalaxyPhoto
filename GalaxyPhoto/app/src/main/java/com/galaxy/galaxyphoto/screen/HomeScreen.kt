package com.galaxy.galaxyphoto.screen

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.model.HitModel
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.ui.theme.StyleImage
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = getViewModel()) {

    val context = LocalContext.current
    var listPhoto by remember { mutableStateOf(listOf<PhotoModel>()) }

    LaunchedEffect(Unit) {
        homeViewModel.getListPhoto(context, onError = {
            Log.e("onError HomeScreen", it)
        }) {
            listPhoto = it
        }
    }

    fun reloadList() {
        val dummy = listPhoto
        listPhoto = arrayListOf()
        listPhoto = dummy
    }


    BaseBackground {

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
        ) {

            items(listPhoto) {
                ItemTagPhoto(model = it) { modelSelected ->

                }
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp)
        ) {

            items(listPhoto) {
                BaseResourceUrl(
                    url = it.urls.thumb, modifier = Modifier, styleImage = StyleImage(150, 100)
                )
            }
        }
    }

}