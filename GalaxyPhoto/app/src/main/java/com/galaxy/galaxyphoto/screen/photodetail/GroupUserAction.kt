package com.galaxy.galaxyphoto.screen.photodetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.MainActivity
import com.galaxy.galaxyphoto.base.BaseButton
import com.galaxy.galaxyphoto.base.CircleImage
import com.galaxy.galaxyphoto.common.downloadFileFromUrl
import com.galaxy.galaxyphoto.common.getRandomString
import com.galaxy.galaxyphoto.common.requestRxPermissions
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.ui.theme.Shapes25dpBottom

@Composable
fun GroupUserAction(
    model: PhotoModel,
    onSeeProfile: () -> Unit,
    onSeePicture: () -> Unit,
    saveImage: () -> Unit
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .clip(Shapes25dpBottom.large)
            .background(Color.White.copy(0.1f))
            .padding(horizontal = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircleImage(
                url = model.user.profileImage.large,
                size = 36,
            ) {}
            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = model.user.name,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
                Text(text = "${model.user.totalPhotos} Photos", color = Color.White)
            }
            Spacer(modifier = Modifier.weight(1f))
            BaseButton(title = "See Profile", background = Color.White.copy(0.3f)) {
                onSeeProfile()
            }
        }
        Text(
            text = model.user.bio,
            color = Color.White,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            BaseButton(
                title = "See Picture",
                background = Color.White.copy(0.3f),
            ) {
                onSeePicture()
            }
            Spacer(modifier = Modifier.width(10.dp))
            BaseButton(
                title = "Save",
                background = Color.Red
            ) {
                saveImage()
            }
        }
    }
}