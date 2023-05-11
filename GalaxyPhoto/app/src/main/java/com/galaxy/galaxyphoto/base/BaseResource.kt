package com.galaxy.galaxyphoto.base


import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.galaxy.galaxyphoto.ui.theme.StyleImage
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun BaseResourceUrl(
    url: String,
    modifier: Modifier,
    styleImage: StyleImage,
    contentScale: ContentScale = ContentScale.Crop,
    onLongClick: (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
) {

    val focusManager = LocalFocusManager.current
    Box(
        modifier
            .width(styleImage.width.dp)
            .height(styleImage.height.dp)
    )
    {
        if (url.contains(".svg")) {
            Image(
                painter = rememberAsyncImagePainter(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(url)
                        .networkCachePolicy(CachePolicy.ENABLED).build(),
                ),
                contentDescription = "", modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(url) {
                        detectTapGestures(
                            onLongPress = {
                                onLongClick?.invoke()
                            }, onTap = {
                                focusManager.clearFocus()
                                onClick?.invoke()
                            })
                    },
                contentScale = contentScale
            )
        } else {
            GlideImage(
                imageModel = url,
                requestOptions = {
                    RequestOptions()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .override(styleImage.width, styleImage.height).transform(
                        )
                },
                contentScale = contentScale
            )
        }
    }
}