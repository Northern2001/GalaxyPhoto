package com.galaxy.galaxyphoto.base


import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import coil.compose.rememberAsyncImagePainter
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun BaseResourceUrl(
    url: String,
    modifier: Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    onLongClick: (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    onSuccess: ((Boolean) -> Unit)? = null,
    onError: ((Boolean) -> Unit)? = null,
) {

    val focusManager = LocalFocusManager.current
    val context = LocalContext.current
    fun loadImage() {

        Glide.with(context)
            .load(url)
            .listener(object : RequestListener<Drawable> {
                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    onSuccess?.invoke(false)
                    return  false

                }

                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    onError?.invoke(true)
                    return  true

                }
            })
    }

    Box(modifier = modifier)
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
                    RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
                        .override(480, 360).transform()
                },
                contentScale = contentScale
            )
            loadImage()
        }
    }
}
