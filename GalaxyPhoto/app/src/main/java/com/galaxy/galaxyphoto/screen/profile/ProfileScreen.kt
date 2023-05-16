package com.galaxy.galaxyphoto.screen.profile

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseScrollview
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.user.UserModel
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.screen.photodetail.ItemContentDetail
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import com.google.accompanist.flowlayout.FlowRow
import org.koin.androidx.compose.getViewModel

@Composable
fun ProfileScreen(
    userModel: UserModel = UserModel(),
    homeViewModel: HomeViewModel = getViewModel()
) {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    var listCollections by remember { mutableStateOf(listOf<PhotoModel>()) }

    LaunchedEffect(Unit) {
        homeViewModel.getCollections(
            context = context,
            useName = userModel.username
        ) {
            listCollections = it
        }
    }


    BaseBackground(modifier = Modifier) {
        BaseScrollview() {
            GroupInfo(
                userModel,
                if (listCollections.isNotEmpty()) listCollections[0].urls.small else ""
            )
            FlowRow(Modifier.padding(horizontal = 6.dp, vertical = 12.dp)) {
                listCollections.forEach {
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