package com.galaxy.galaxyphoto.base

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BaseButton(title: String, color: Color = Color.White, onClick: () -> Unit) {
    Text(
        text = title, modifier = Modifier
            .clip(RoundedCornerShape(24.dp))
            .background(color = color)
            .padding(vertical = 10.dp, horizontal = 20.dp)
            .clickable {
                onClick()
            }
    )
}