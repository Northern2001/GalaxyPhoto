package com.galaxy.galaxyphoto.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.domain.Contains
import com.galaxy.galaxyphoto.nav.DestinationName
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.viewmodel.AuthViewModel
import kotlinx.coroutines.delay
import org.koin.androidx.compose.getViewModel

@Composable
fun SplashScreen(authViewModel: AuthViewModel = getViewModel()) {
    val navController = RouterManager.current.navController
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        authViewModel.getAccessToken(context)
//        authViewModel.createAccessToken(context){}
        delay(Contains.TIME_SEARCH)
        navController?.navigate(
            DestinationName().bottomBar
        )
    }
    BaseBackground(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = "",
            modifier = Modifier.size(175.dp)
        )

    }
}