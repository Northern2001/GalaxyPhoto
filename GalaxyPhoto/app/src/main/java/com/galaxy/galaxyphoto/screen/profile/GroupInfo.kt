package com.galaxy.galaxyphoto.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseResourceUrl
import com.galaxy.galaxyphoto.base.CircleImage
import com.galaxy.galaxyphoto.model.user.SocialModel
import com.galaxy.galaxyphoto.model.user.UserModel
import com.galaxy.galaxyphoto.nav.RouterManager

@Composable
fun GroupInfo(model: UserModel, coverPhoto: String) {
    val navController = RouterManager.current.navController

    fun getSocial(model: SocialModel): String {
        return if (model.instagram.isNotEmpty())
            "IG: " + model.instagram else "" +
                if (model.twitter.isNotEmpty())
                    "Twitter: " + model.twitter else "" +
                        if (model.email.isNotEmpty())
                            "Email: " + model.email else "" +
                                if (model.portfolio.isNotEmpty())
                                    "Portfolio: " + model.portfolio else ""
    }

    Box {
        BaseResourceUrl(
            url = coverPhoto, modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "",
            modifier = Modifier
                .padding(12.dp)
                .clickable { navController?.popBackStack() }
        )
        Spacer(modifier = Modifier.background(Color.White).height(375.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 75.dp)
                .align(Alignment.BottomCenter)
        ) {
            CircleImage(
                url = model.profileImage.large,
                size = 150,
            ) {

            }
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp, horizontal = 12.dp),
    ) {
        Text(
            text = model.name,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Text(
            text = getSocial(model.social),
            color = Color.White,
            modifier = Modifier
        )
        Text(
            text = "Likes: " + model.totalLikes + "   Photos: " + model.totalPhotos,
            color = Color.White,
            fontSize = 15.sp, modifier = Modifier,
            fontWeight = FontWeight.SemiBold
        )
    }

}