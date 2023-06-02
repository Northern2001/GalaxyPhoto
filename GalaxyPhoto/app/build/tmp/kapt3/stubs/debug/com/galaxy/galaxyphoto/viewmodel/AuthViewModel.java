package com.galaxy.galaxyphoto.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/galaxy/galaxyphoto/viewmodel/AuthViewModel;", "Lcom/galaxy/galaxyphoto/base/BaseViewModel;", "authRepository", "Lcom/galaxy/galaxyphoto/domain/repository/AuthRepository;", "(Lcom/galaxy/galaxyphoto/domain/repository/AuthRepository;)V", "createAccessToken", "", "context", "Landroid/content/Context;", "onFinish", "Lkotlin/Function1;", "Lcom/galaxy/galaxyphoto/reponse/auth/AuthModel;", "getAccessToken", "app_debug"})
public final class AuthViewModel extends com.galaxy.galaxyphoto.base.BaseViewModel {
    private final com.galaxy.galaxyphoto.domain.repository.AuthRepository authRepository = null;
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.domain.repository.AuthRepository authRepository) {
        super();
    }
    
    public final void getAccessToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void createAccessToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.galaxy.galaxyphoto.reponse.auth.AuthModel, kotlin.Unit> onFinish) {
    }
}