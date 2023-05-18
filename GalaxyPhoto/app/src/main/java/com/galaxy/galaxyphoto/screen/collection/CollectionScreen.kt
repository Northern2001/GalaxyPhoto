package com.galaxy.galaxyphoto.screen.collection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.base.BaseTextField
import com.galaxy.galaxyphoto.nav.DestinationName
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.ui.theme.Shapes25dp
import com.galaxy.galaxyphoto.viewmodel.CollectionViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun CollectionScreen(collectionViewModel: CollectionViewModel = getViewModel()) {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    var searchValue by remember { mutableStateOf("") }

    BaseBackground {
        Row(
            modifier = Modifier.padding(vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BaseTextField(
                value = searchValue,
                onChangeValue = {
                    searchValue = it
                },
                modifier = Modifier
                    .clip(Shapes25dp.large)
                    .fillMaxWidth(0.9f)
                    .height(50.dp)
                    .background(Color.White.copy(0.1f)),
                placeholder = "Search here",
                leadingIcon = R.drawable.ic_search
            )
            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clickable {
                        navController?.navigate(
                            DestinationName().createCollection
                        )
                    }
            )
        }

        ItemCollection(collectionViewModel.collectionModel)

    }

}


