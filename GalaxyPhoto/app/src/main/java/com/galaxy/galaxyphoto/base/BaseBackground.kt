package com.galaxy.galaxyphoto.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.galaxy.galaxyphoto.common.ProgressManager
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshIndicator
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState

@Composable
fun BaseBackground(
    modifier: Modifier = Modifier.padding(horizontal = 12.dp),
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    onRefresh: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    val swipeRefreshState =
        rememberSwipeRefreshState(isRefreshing = ProgressManager.current.isLoading)

    SwipeRefresh(
        state = swipeRefreshState,
        indicator = { state, refreshTrigger ->
            SwipeRefreshIndicator(
                state = state,
                refreshTriggerDistance = refreshTrigger,
                arrowEnabled = false,
                contentColor = Color.Transparent,
                backgroundColor = Color.Transparent,
            )

        },
        onRefresh = { onRefresh?.invoke() }) {
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .fillMaxSize()
                .then(modifier),
            verticalArrangement = verticalArrangement,
            horizontalAlignment = horizontalAlignment
        ) {
            content()
        }
    }


}