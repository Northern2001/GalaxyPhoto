package com.galaxy.galaxyphoto.screen.searchphoto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseScrollview
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.screen.photodetail.ItemContentDetail
import com.galaxy.galaxyphoto.ui.theme.Shapes25dp
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
        if (isSearch){
            delay(2000)
            searchPhoto()
        }
    }

    BaseBackground(Modifier) {
        BaseScrollview() {
            TextField(
                value = searchValue,
                onValueChange = {
                    isSearch = true
                    searchValue = it
                },
                modifier = Modifier
                    .padding(12.dp)
                    .clip(Shapes25dp.large)
                    .fillMaxWidth()
                    .background(Color.White.copy(0.1f)),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = ""
                    )
                },
                placeholder = {
                    Text(text = "Search here", color = Color.White.copy(0.5f))
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
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