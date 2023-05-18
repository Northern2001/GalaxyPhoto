package com.galaxy.galaxyphoto.screen.collection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.ui.theme.Shapes20dp

@Composable
fun ItemCollection(model: CollectionModel) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp

    Row(
        Modifier
            .padding(vertical = 12.dp)
            .clip(Shapes20dp.large)
            .width((screenWidth - 12.dp) / 2)
            .height(screenWidth / 3)
            .background(Color.White.copy(0.1f))
    ) {
        BaseResourceUrl(
            url = "", modifier = Modifier.fillMaxWidth(0.7f)
        )
        Spacer(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Black)
                .width(1.dp)
        )

        Column() {
            BaseResourceUrl(
                url = "", modifier = Modifier.fillMaxHeight(0.5f)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .height(1.dp)
            )
            BaseResourceUrl(
                url = "", modifier = Modifier.fillMaxHeight(0.5f)
            )
        }
    }
    Text(
        text = model.title,
        color = Color.White,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    )
}