package com.galaxy.galaxyphoto.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.model.HitModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.ui.theme.Shapes20dp

@Composable
fun ItemTagPhoto(model: TopicsModel, onClick: (TopicsModel) -> Unit) {

    Text(
        text = model.title,
        color = if (model.isSelected) Color.Black else Color.White,
        modifier = Modifier
            .padding(end = 12.dp)
            .clip(Shapes20dp.large)
            .background(if (model.isSelected) Color.White else Color.Black)
            .padding(vertical = 10.dp, horizontal = 20.dp)
            .clickable { onClick(model) }
    )
}