package com.galaxy.galaxyphoto.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.ui.theme.Shapes25dp

@Composable
fun BaseTextField(
    value: String,
    modifier: Modifier = Modifier
        .padding(12.dp)
        .clip(Shapes25dp.large)
        .fillMaxWidth()
        .height(50.dp)
        .background(Color.White.copy(0.1f)),
    onChangeValue: (String) -> Unit,
    placeholder: String = "",
    leadingIcon: Int? = null
) {
    TextField(
        value = value,
        onValueChange = {
            onChangeValue(it)

        },
        singleLine = true,
        maxLines = 1,
        modifier = modifier,
        leadingIcon = {
            leadingIcon?.let {
                Image(
                    painter = painterResource(id = it),
                    contentDescription = "",
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }

        },
        placeholder = {
            Text(
                text = placeholder,
                color = Color.White.copy(0.5f),
                textAlign = TextAlign.Center
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.White,
            disabledTextColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        )
    )
}