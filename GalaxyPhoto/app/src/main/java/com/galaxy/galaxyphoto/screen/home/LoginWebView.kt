package com.galaxy.galaxyphoto.screen.home

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.galaxy.galaxyphoto.viewmodel.AuthViewModel
import org.koin.androidx.compose.getViewModel


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun LoginWebView(
    url: String,
    authViewModel: AuthViewModel = getViewModel()
) {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        authViewModel.getAccessToken(context)
    }

}