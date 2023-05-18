package com.galaxy.galaxyphoto.screen.collection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.galaxy.galaxyphoto.R
import com.galaxy.galaxyphoto.base.BaseBackground
import com.galaxy.galaxyphoto.common.SwitchButton
import com.galaxy.galaxyphoto.nav.RouterManager
import com.galaxy.galaxyphoto.viewmodel.CollectionViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun CreateCollectionScreen(collectionViewModel: CollectionViewModel = getViewModel()) {
    val context = LocalContext.current
    val navController = RouterManager.current.navController
    var name by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var isCheck by remember { mutableStateOf(false) }

    BaseBackground(Modifier) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(top = 12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_close),
                    contentDescription = "",
                    modifier = Modifier.clickable { navController?.popBackStack() }
                )
                Text(
                    text = "Create table",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Text(
                    text = "Create",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier.clickable {
                        collectionViewModel.createCollections(
                            context,
                            title = name,
                            description = description,
                            isCheck
                        )
                    }
                )
            }

            GroupInput(
                title = "Name table",
                value = name,
                hint = "name...",
                onValueChange = {
                    name = it
                }
            )

            GroupInput(
                title = "Description table",
                value = description,
                hint = "description...",
                onValueChange = {
                    description = it
                }

            )
            GroupInput(
                title = "Privacy",
                onValueChange = {},
                isPrivacy = true,
                isCheck = isCheck,
                onCheckSwitch = {
                    isCheck = it
                }
            )
        }
    }
}

@Composable
fun GroupInput(
    title: String = "",
    hint: String = "",
    value: String = "",
    onValueChange: (String) -> Unit,
    onCheckSwitch: ((Boolean) -> Unit)? = null,
    isPrivacy: Boolean = false,
    isCheck: Boolean = false
) {

    Text(
        text = title,
        fontSize = 16.sp,
        color = Color.White,
        modifier = Modifier.padding(top = 20.dp, end = 12.dp, start = 14.dp)
    )
    if (isPrivacy) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Set this table to private",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(top = 12.dp, start = 14.dp)
            )
            SwitchButton(isCheck) {
                onCheckSwitch?.invoke(it)
            }

        }
        Text(
            text = "Just only you can see this table",
            fontSize = 15.sp,
            color = Color.White.copy(0.5f),
            modifier = Modifier.padding(start = 12.dp)
        )
    } else {
        TextField(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            modifier = Modifier.background(Color.Black),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.White,
                disabledTextColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text = hint,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White.copy(0.5f)
                )
            }
        )
    }


}
