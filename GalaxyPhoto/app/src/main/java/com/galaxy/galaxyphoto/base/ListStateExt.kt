package com.galaxy.galaxyphoto.base

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.material.Button
import androidx.compose.material.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyListState.InfiniteListHandler(
    buffer: Int = 4,
    onItemVisible: ((Int) -> Unit)? = null,
    onItemFirstVisible: ((Int) -> Unit)? = null,
    onLoadMore: () -> Unit,
) {
    require(buffer >= 0)
    val loadMore = remember {
        derivedStateOf {
            // get last visible item
            val lastVisibleItem = layoutInfo.visibleItemsInfo.lastOrNull()
                ?:
                // list is empty
                // return false here if loadMore should not be invoked if the list is empty
                return@derivedStateOf false
            if (lastVisibleItem.index < 1) return@derivedStateOf false
            // Check if last visible item is the last item in the list
            lastVisibleItem.index >= layoutInfo.totalItemsCount - 1 - buffer

        }
    }
    val firstIndexVisible by remember {
        derivedStateOf {
            layoutInfo.visibleItemsInfo.firstOrNull()?.index ?: -1
        }
    }
    val indexVisible by remember {
        derivedStateOf {
            layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
        }
    }

    LaunchedEffect(loadMore) {
        snapshotFlow { loadMore.value }
            .collect {
                // if should load more, then invoke loadMore
                if (it) onLoadMore()
            }
    }
    LaunchedEffect(key1 = indexVisible, block = {
        snapshotFlow { indexVisible }
            .collect {
                onItemVisible?.invoke(it)
            }

    })
    var index by remember { mutableStateOf(-1) }
    LaunchedEffect(key1 = firstIndexVisible, block = {
        snapshotFlow { firstIndexVisible }
            .collect {
                if (index != it) {
                    index = it
                } else {
                    return@collect
                }
                if (index == 0) {
                    onItemFirstVisible?.invoke(it)
                }
            }
    })
}

@Composable
fun LazyListState.OnBottomReached(
    // tells how many items before we reach the bottom of the list
    // to call onLoadMore function
    buffer: Int = 0,
    onLoadMore: () -> Unit
) {
    // Buffer must be positive.
    // Or our list will never reach the bottom.
    require(buffer >= 0) { "buffer cannot be negative, but was $buffer" }

    val shouldLoadMore = remember {
        derivedStateOf {
            val lastVisibleItem = layoutInfo.visibleItemsInfo.lastOrNull()
                ?: return@derivedStateOf true

            // subtract buffer from the total items
            lastVisibleItem.index >= layoutInfo.totalItemsCount - 1 - buffer
        }
    }

    LaunchedEffect(shouldLoadMore) {
        snapshotFlow { shouldLoadMore.value }
            .collect { if (it) onLoadMore() }
    }
}

@ExperimentalFoundationApi
@Composable
fun LazyGridState.InfiniteListHandler(
    buffer: Int = 4,
    onItemVisible: ((Int) -> Unit)? = null,
    onLoadMore: () -> Unit,
) {
    require(buffer >= 0)
    val loadMore = remember {
        derivedStateOf {
            // get last visible item
            val lastVisibleItem = layoutInfo.visibleItemsInfo.lastOrNull()
                ?:
                // list is empty
                // return false here if loadMore should not be invoked if the list is empty
                return@derivedStateOf true
            // Check if last visible item is the last item in the list
            lastVisibleItem.index >= layoutInfo.totalItemsCount - 1 - buffer
        }
    }
    val indexVisible by remember {
        derivedStateOf {
            layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
        }
    }

    LaunchedEffect(loadMore) {
        snapshotFlow { loadMore.value }
            .collect {
                // if should load more, then invoke loadMore
                if (it) onLoadMore()
            }
    }
//    LaunchedEffect(key1 = indexVisible, block = {
//        snapshotFlow { indexVisible }
//            .collect {
//                onItemVisible?.invoke(it)
//            }
//
//    })
}

fun LazyGridState.isScrolledToTheEnd() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1

@Composable
fun showNotify(context: Context, mess: String) {
    Toast.makeText(context, mess, Toast.LENGTH_SHORT).show()
//    Snackbar(
//
//        action = {
//            Button(onClick = {}) {
//                Text("MyAction")
//            }
//        },
//        modifier = Modifier.padding(8.dp)
//    ) { Text(text = "This is a snackbar!") }
}
//    Snackbar(modifier = Modifier) {
//
//        Text(text = mess)
//    }
//}



