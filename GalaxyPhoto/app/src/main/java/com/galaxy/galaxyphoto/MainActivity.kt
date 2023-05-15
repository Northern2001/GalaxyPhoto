package com.galaxy.galaxyphoto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.galaxy.galaxyphoto.screen.BottomBarScreen
import com.galaxy.galaxyphoto.common.ProgressDialog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarScreen()
            ProgressDialog()
        }
    }
}