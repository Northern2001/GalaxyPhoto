package com.galaxy.galaxyphoto.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.CircleImage
import com.galaxy.galaxyphoto.nav.DestinationName
import com.galaxy.galaxyphoto.nav.DestinationNameWithParam
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.ui.theme.red

@Composable
fun LoginScreen() {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    val url ="https://unsplash.com/oauth/authorize?client_id=_iqBL9niuq522850mGnzK4x82TH1Mt52BzmQRke0NNE&redirect_uri=urn%3Aietf%3Awg%3Aoauth%3A2.0%3Aoob&response_type=code&scope=public"


    BaseBackground(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(120.dp))
        CircleImage(icon = R.drawable.app_logo, size = 130) {

        }
        Text(
            "Welcome to Galaxy Photo",
            color = Color.White,
            fontSize = 23.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 15.dp, bottom = 35.dp)
        )

        Text(
            text = "Continue",
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .clip(RoundedCornerShape(20.dp))
                .background(color = red)
                .padding(vertical = 10.dp)
                .clickable {
                    navController?.navigate(
                        DestinationNameWithParam.getLoginWebView(url)
                    )

                },
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
        )

    }

}