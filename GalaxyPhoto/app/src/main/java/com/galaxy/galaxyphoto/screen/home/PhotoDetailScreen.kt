package com.galaxy.galaxyphoto.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.*
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.ui.theme.Shapes25dpBottom
import com.galaxy.galaxyphoto.ui.theme.Shapes25dpTop
import com.galaxy.galaxyphoto.viewmodel.HomeViewModel
import org.koin.androidx.compose.getViewModel


@Composable
fun PhotoDetailScreen(homeViewModel: HomeViewModel = getViewModel()) {
    val context = LocalContext.current
    var model by remember { mutableStateOf(PhotoModel()) }


    LaunchedEffect(Unit) {
        homeViewModel.getPhotoDetail(context, "xCMbK6qSiXI") {
            model = it
        }
    }

    BaseBackground(modifier = Modifier) {
        BaseScrollview {
            ItemPhoto(model)
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
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
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

                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    BaseButton(
                        title = "Save",
                        background = Color.Red
                    ) {

                    }
                }
            }


        }
        LazyColumn(content = {
            item {
            }
        })
    }
}

@Composable
fun ItemPhoto(model: PhotoModel) {
    Box(
        Modifier
            .height(400.dp)
            .padding(top = 12.dp)
            .clip(Shapes25dpTop.large)
    ) {
        BaseResourceUrl(
            url = model.urls.full, modifier = Modifier
        )
        Image(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "",
            modifier = Modifier.padding(20.dp),
            alignment = Alignment.TopStart
        )
    }
}