package com.galaxy.galaxyphoto.nav

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.galaxy.galaxyphoto.common.BottomBarScreen
import com.galaxy.galaxyphoto.model.user.UserModel
import com.galaxy.galaxyphoto.screen.collection.CollectionScreen
import com.galaxy.galaxyphoto.screen.collection.CreateCollectionScreen
import com.galaxy.galaxyphoto.screen.home.SplashScreen
import com.galaxy.galaxyphoto.screen.photodetail.PhotoDetailScreen
import com.galaxy.galaxyphoto.screen.profile.ProfileScreen
import com.google.accompanist.navigation.animation.composable
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException

@ExperimentalAnimationApi
@ExperimentalMaterialApi
fun NavGraphBuilder.authGraph() {
    navigation(
        startDestination = DestinationName(true).splashScreen,
        route = "HOME"
    ) {
        composable(DestinationName(true).splashScreen) {
            SplashScreen()
        }
        composable(DestinationName(true).bottomBar) {
            BottomBarScreen()
        }

        composable(DestinationName(true).photoDetail) {
            PhotoDetailScreen(it.arguments?.getString(ParamName.ID_PHOTO) ?: "")
        }

        composable(DestinationName(true).profileScreen) {
            ProfileScreen(
                try {
                    Gson().fromJson(
                        it.arguments?.getString(ParamName.USER_MODEL) ?: "",
                        UserModel::class.java
                    ) ?: UserModel()
                } catch (e: JsonSyntaxException) {
                    UserModel()
                }
            )
        }

        composable(DestinationName(true).createCollection) {
            CreateCollectionScreen()
        }
    }
}