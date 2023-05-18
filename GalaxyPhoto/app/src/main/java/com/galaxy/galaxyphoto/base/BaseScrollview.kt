package com.galaxy.galaxyphoto.base

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BaseScrollview(
    list: List<Any> = arrayListOf(),
    state: LazyListState = rememberLazyListState(),
    modifier: Modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
    isColumn: Boolean = true,
    contentLoadMore: ((Any) -> Unit)? = null,
    content: (@Composable LazyItemScope.() -> Unit)? = null,

    ) {

    if (isColumn) {
        LazyColumn(
            modifier = modifier,
            state = state,
            content = {
                content?.let {
                    item {
                        it()
                    }
                }
                items(list) {
                    contentLoadMore?.invoke(it)
                }
            }
        )

    } else {
        LazyRow(
            modifier = modifier,
            state = state,
            content = {
                content?.let {
                    item {
                        it()
                    }
                }
                items(list) {
                    contentLoadMore?.invoke(it)
                }
            })
    }


}