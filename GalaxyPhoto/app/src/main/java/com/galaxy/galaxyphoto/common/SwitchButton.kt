package com.galaxy.galaxyphoto.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.ui.theme.Shapes60dp

@Composable
fun SwitchButton(isChecked: Boolean, onCheckChange: (Boolean) -> Unit) {
    Switch(
        checked = isChecked,
        modifier = Modifier
            .clip(Shapes60dp.large)
            .height(28.dp)
            .background(
                if (isChecked) Color.White.copy(0.9f) else Color.White.copy(0.5f)
            ),
        colors = SwitchDefaults.colors(
            checkedThumbColor = White,
            uncheckedThumbColor = White,
            checkedTrackAlpha = 0f,
            uncheckedTrackAlpha = 0f,
        ),
        onCheckedChange = {
            onCheckChange(it)
        })
}