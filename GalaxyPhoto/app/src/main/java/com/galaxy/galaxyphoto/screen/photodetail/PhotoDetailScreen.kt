package com.galaxy.galaxyphoto.screen.photodetail

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.base.BaseScrollview
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.nav.DestinationName
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.ui.theme.Shapes25dp
import com.galaxy.galaxyphoto.ui.theme.Shapes25dpTop
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import com.google.accompanist.flowlayout.FlowRow
import com.google.gson.Gson
import org.koin.androidx.compose.getViewModel


@Composable
fun PhotoDetailScreen(idPhoto: String, homeViewModel: HomeViewModel = getViewModel()) {
    val context = LocalContext.current
    var model by remember { mutableStateOf(PhotoModel()) }
    var listPhotoSuggestion by remember { mutableStateOf(listOf<PhotoModel>()) }
    val navController = RouterManager.current.navController
    var isSeePicture by remember { mutableStateOf(false) }


    fun searchPhotoTags(model: PhotoModel) {
        homeViewModel.searchPhotos(context, model.tags[0].title) {
            listPhotoSuggestion = it.results
        }
    }


    LaunchedEffect(Unit) {
        homeViewModel.getPhotoDetail(context, idPhoto) {
            model = it
            searchPhotoTags(it)
        }
    }

    BaseBackground(modifier = Modifier) {
        Crossfade(targetState = isSeePicture) {
            when (it) {
                true ->
                    ItemPhoto(
                        model.urls.full,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 12.dp),
                        isShowPicture = true,
                    ) {
                        isSeePicture = false
                    }
                else ->
                    BaseScrollview(modifier = Modifier.fillMaxHeight()) {
                        ItemPhoto(model.urls.full)
                        GroupUserAction(model, onSeeProfile = {
                            navController?.navigate(
                                DestinationNameWithParam.getUserProfile(
                                    Gson().toJson(model.user)
                                )
                            )
                        }) {
                            isSeePicture = true
                        }
                        Column(
                            Modifier
                                .padding(top = 12.dp)
                                .clip(Shapes25dp.large)
                                .background(Color.White.copy(0.1f))
                                .padding(horizontal = 6.dp)
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Photo Suggestion",
                                fontWeight = FontWeight.SemiBold,
                                color = Color.White,
                                fontSize = 18.sp,
                                modifier = Modifier
                                    .padding(vertical = 15.dp)
                                    .align(Alignment.CenterHorizontally),
                            )
                            FlowRow {
                                listPhotoSuggestion.forEach {
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
    }
}

@Composable
fun ItemPhoto(
    url: String,
    modifier: Modifier = Modifier
        .height(400.dp)
        .padding(top = 12.dp)
        .clip(Shapes25dpTop.large),
    isShowPicture: Boolean = false,
    onHideImage: (() -> Unit)? = null
) {
    val navController = RouterManager.current.navController

    Box(modifier = modifier) {
        BaseResourceUrl(
            url = url, modifier = Modifier,
            contentScale = if (isShowPicture) ContentScale.Fit else ContentScale.Crop
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "",
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(0.8f)
                    .clickable {
                        if (isShowPicture) {
                            onHideImage?.invoke()
                        } else {
                            navController?.popBackStack()
                        }
                    },
                alignment = Alignment.TopStart
            )
            Image(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = "",
                modifier = Modifier
                    .padding(20.dp)
                    .clickable {
                        navController?.navigate(
                            DestinationName().bottomBar
                        )
                    },
                alignment = Alignment.TopEnd
            )
        }
    }
}