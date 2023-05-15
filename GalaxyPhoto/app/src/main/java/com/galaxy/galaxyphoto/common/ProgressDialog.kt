package com.galaxy.galaxyphoto.common

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.common.ProgressManager
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
            Text(
                text = ProgressManager.current.contentNotify,
                color = Color.White,
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 12.dp)
                    .clip(Shapes20dp.large)
                    .background(Color.White.copy(0.2f)),
                textAlign = TextAlign.Center
            )
        }
    }

}