package com.galaxy.galaxyphoto.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001aT\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a<\u0010\u0006\u001a\u00020\u0001*\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u000f\u00a8\u0006\u0013"}, d2 = {"showNotify", "", "context", "Landroid/content/Context;", "mess", "", "InfiniteListHandler", "Landroidx/compose/foundation/lazy/LazyListState;", "buffer", "", "onItemVisible", "Lkotlin/Function1;", "onItemFirstVisible", "onLoadMore", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "OnBottomReached", "isScrolledToTheEnd", "", "app_debug"})
public final class ListStateExtKt {
    
    @androidx.compose.runtime.Composable()
    public static final void InfiniteListHandler(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListState $this$InfiniteListHandler, int buffer, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemVisible, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemFirstVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void OnBottomReached(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListState $this$OnBottomReached, int buffer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void InfiniteListHandler(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.grid.LazyGridState $this$InfiniteListHandler, int buffer, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    public static final boolean isScrolledToTheEnd(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.grid.LazyGridState $this$isScrolledToTheEnd) {
        return false;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void showNotify(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String mess) {
    }
}