package com.galaxy.galaxyphoto.screen.photodetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.ui.theme.Shapes20dp
import com.galaxy.galaxyphoto.ui.theme.Shapes25dp
import com.galaxy.galaxyphoto.ui.theme.Shapes25dpBottom

@Composable
fun ItemContentDetail(
    model: PhotoModel,
    onLongPress: (PhotoModel) -> Unit,
    onClick: (PhotoModel) -> Unit,

    ) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp

    Column(
        modifier = Modifier
            .padding(bottom = 12.dp)
            .width((screenWidth - 12.dp) / 2)
            .height((screenWidth - 12.dp) / 2)
            .padding(horizontal = 6.dp)
            .pointerInput(model) {
                detectTapGestures(
                    onLongPress = {
                        onLongPress(model)
                    },
                    onTap = {
                        onClick(model)
                    }
                )
            }
    ) {
        BaseResourceUrl(
            url = model.urls.thumb,
            modifier = Modifier
                .clip(Shapes20dp.large)
        )
    }
}