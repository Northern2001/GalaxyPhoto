package com.galaxy.galaxyphoto.screen

import android.util.Log
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.model.ImageModel
import com.galaxy.galaxyphoto.ui.theme.StyleImage
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = getViewModel()) {

    val context = LocalContext.current
    var model by remember { mutableStateOf(ImageModel()) }

    LaunchedEffect(Unit) {
        homeViewModel.getListPhoto(context, onError = {
            Log.e("onError HomeScreen", it)
        }) {
            model = it
        }
    }

    BaseBackground {

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp)
        ) {
            items(model.hits) {
                BaseResourceUrl(
                    url = it.previewURL, modifier = Modifier, styleImage = StyleImage(150, 100)
                )
            }
        }
    }

}