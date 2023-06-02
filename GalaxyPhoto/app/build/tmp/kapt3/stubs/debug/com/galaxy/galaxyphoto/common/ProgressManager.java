package com.galaxy.galaxyphoto.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R+\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/galaxy/galaxyphoto/common/ProgressManager;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "contentNotify", "getContentNotify", "()Ljava/lang/String;", "setContentNotify", "(Ljava/lang/String;)V", "contentNotify$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "()Z", "setLoading", "(Z)V", "isLoading$delegate", "isShowNotify", "setShowNotify", "isShowNotify$delegate", "isSuccess", "setSuccess", "isSuccess$delegate", "dismissLoading", "", "dismissShowNotify", "loading", "onRefresh", "showNotify", "content", "Companion", "app_debug"})
public final class ProgressManager extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState isShowNotify$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState isLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState contentNotify$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState isSuccess$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.galaxy.galaxyphoto.common.ProgressManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.galaxy.galaxyphoto.common.ProgressManager current = null;
    
    public ProgressManager() {
        super();
    }
    
    public final boolean isShowNotify() {
        return false;
    }
    
    public final void setShowNotify(boolean p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentNotify() {
        return null;
    }
    
    public final void setContentNotify(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    public final void showNotify(@org.jetbrains.annotations.NotNull()
    java.lang.String content, boolean isSuccess) {
    }
    
    public final void dismissShowNotify() {
    }
    
    public final void dismissLoading() {
    }
    
    public final void loading() {
    }
    
    public final void onRefresh() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/galaxy/galaxyphoto/common/ProgressManager$Companion;", "", "()V", "current", "Lcom/galaxy/galaxyphoto/common/ProgressManager;", "getCurrent", "()Lcom/galaxy/galaxyphoto/common/ProgressManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.galaxy.galaxyphoto.common.ProgressManager getCurrent() {
            return null;
        }
    }
}