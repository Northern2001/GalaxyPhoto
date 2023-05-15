package com.galaxy.galaxyphoto.base

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BaseScrollview(
    list: List<Any> = arrayListOf(),
    modifier: Modifier = Modifier,
    isColumn: Boolean = true,
    contentLoadMore: ((Any) -> Unit)? = null,
    content: (@Composable LazyItemScope.() -> Unit)? = null,

    ) {

    if (isColumn) {
        LazyColumn(
            modifier = modifier,
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