package com.galaxy.galaxyphoto

import android.os.Bundle

import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.fragment.app.FragmentActivity
import coil.annotation.ExperimentalCoilApi
import com.galaxy.galaxyphoto.common.ProgressDialog
import com.galaxy.galaxyphoto.common.RootRouter
import com.galaxy.galaxyphoto.common.requestRxPermissions
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : FragmentActivity() {
    @OptIn(
        ExperimentalAnimationApi::class, ExperimentalMaterialApi::class,
        ExperimentalFoundationApi::class, InternalCoroutinesApi::class,
        ExperimentalComposeUiApi::class, ExperimentalCoilApi::class,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootRouter()
            ProgressDialog()
        }
    }
}