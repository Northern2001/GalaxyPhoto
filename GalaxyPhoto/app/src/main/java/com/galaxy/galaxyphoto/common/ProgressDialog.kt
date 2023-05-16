package com.galaxy.galaxyphoto.common

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.ui.theme.Shapes20dp
import kotlinx.coroutines.delay

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ProgressDialog() {
    val keyboardController = LocalSoftwareKeyboardController.current

    LaunchedEffect(ProgressManager.current.isShowNotify) {
        if (ProgressManager.current.isShowNotify) {
            keyboardController?.hide()
        }
        delay(2000)
        ProgressManager.current.dismissShowNotify()
    }

    AnimatedVisibility(
        visible = ProgressManager.current.isShowNotify
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
            Row(
                modifier = Modifier
                    .clip(Shapes20dp.large)
                    .background(Color.White.copy(0.1f))
                    .padding(vertical = 10.dp, horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(
                        id = if (ProgressManager.current.isSuccess)
                            R.drawable.ic__success else R.drawable.ic_error
                    ),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(
                        if (ProgressManager.current.isSuccess)
                            Color.Green else Color.Red
                    ),
                    modifier = Modifier
                        .size(32.dp)
                        .padding(end = 10.dp)
                )
                Text(
                    text = ProgressManager.current.contentNotify,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}