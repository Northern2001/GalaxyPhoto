package com.galaxy.galaxyphoto.screen.home

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.ui.theme.Shapes20dp

@Composable
fun ItemContentHome(
    model: PhotoModel,
    onLongPress: (PhotoModel) -> Unit,
    onClick: (PhotoModel) -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(end = 12.dp, bottom = 12.dp)
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