package com.galaxy.galaxyphoto.screen.photodetail

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
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
import com.galaxy.galaxyphoto.MainActivity
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.base.BaseScrollview
import com.galaxy.galaxyphoto.common.downloadFileFromUrl
import com.galaxy.galaxyphoto.common.getRandomString
import com.galaxy.galaxyphoto.common.requestRxPermissions
import com.galaxy.galaxyphoto.ext.InfiniteListHandler
import com.galaxy.galaxyphoto.nav.DestinationName
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.ui.theme.Shapes25dp
import com.galaxy.galaxyphoto.ui.theme.Shapes25dpTop
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import com.google.accompanist.flowlayout.FlowRow
import com.google.gson.Gson
import org.koin.androidx.compose.getViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoDetailScreen(idPhoto: String, homeViewModel: HomeViewModel = getViewModel()) {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    var isSeePicture by remember { mutableStateOf(false) }
    var isReLoad by rememberSaveable { mutableStateOf(true) }
    var isShowAvatar by remember { mutableStateOf(false) }
    val listState = rememberLazyListState()


    fun searchPhotoTags(isLoadMore: Boolean = false) {
        if (homeViewModel.photoModelDetail.tags.isNotEmpty()) {
            homeViewModel.searchPhotos(
                context,
                query = homeViewModel.photoModelDetail.tags[0].title,
                isLoadMore = isLoadMore
            )
        }
    }


    LaunchedEffect(Unit) {
        if (isReLoad) {
            homeViewModel.getPhotoDetail(context, idPhoto) {
                homeViewModel.photoModelDetail = it
                searchPhotoTags()
            }
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            isReLoad = false
        }
    }

    BaseBackground(modifier = Modifier) {
        if (isShowAvatar) {
            showAvatarUser(homeViewModel.photoModelDetail.user.profileImage.large) {
                isShowAvatar = false
            }
        } else {
            Crossfade(targetState = isSeePicture) {
                when (it) {
                    true -> ItemPhoto(
                        homeViewModel.photoModelDetail.urls.full,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 12.dp),
                        isShowPicture = true,
                    ) {
                        isSeePicture = false
                    }

                    else ->
                        BaseScrollview(state = listState, modifier = Modifier.fillMaxHeight()) {
                            ItemPhoto(homeViewModel.photoModelDetail.urls.full)
                            GroupUserAction(homeViewModel.photoModelDetail, onSeeProfile = {
                                navController?.navigate(
                                    DestinationNameWithParam.getUserProfile(
                                        Gson().toJson(homeViewModel.photoModelDetail.user)
                                    )
                                )
                            }, onSeePicture = {
                                isSeePicture = true
                            }, onShowAvatar = {}
                            ) {
                                (context as MainActivity).requestRxPermissions(
                                    onGranted = {
                                        downloadFileFromUrl(
                                            homeViewModel.photoModelDetail.urls.full,
                                            context,
                                            getRandomString(5)
                                        )
                                    }
                                )
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
                                    homeViewModel.listPhotoDetail.forEach {
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
    listState.InfiniteListHandler {
        homeViewModel.pageSearch++
        searchPhotoTags(true)
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
            url = url,
            modifier = Modifier,
            contentScale = if (isShowPicture) ContentScale.Fit else ContentScale.Crop
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "",
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(0.9f)
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
                    .padding(top = 20.dp)
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