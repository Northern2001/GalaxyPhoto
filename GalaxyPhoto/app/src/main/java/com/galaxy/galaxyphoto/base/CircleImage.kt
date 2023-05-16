package com.galaxy.galaxyphoto.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CircleImage(
    icon: Int? = null,
    url: String = "",
    size: Int = 56,
    onclick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(size.dp)
            .clip(CircleShape)
            .background(color = Color.Black)
            .clickable { onclick() }
    ) {
        if (url.isNotEmpty()) {
            BaseResourceUrl(
                url = url, modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
        icon?.let {
            Image(
                painter = painterResource(id = it),
                contentDescription = "",
                modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
    }
}