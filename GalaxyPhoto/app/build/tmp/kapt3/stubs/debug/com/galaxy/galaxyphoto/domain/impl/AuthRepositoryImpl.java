package com.galaxy.galaxyphoto.domain.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/impl/AuthRepositoryImpl;", "Lcom/galaxy/galaxyphoto/domain/repository/AuthRepository;", "context", "Landroid/content/Context;", "authService", "Lcom/galaxy/galaxyphoto/domain/service/AuthService;", "(Landroid/content/Context;Lcom/galaxy/galaxyphoto/domain/service/AuthService;)V", "createAccessToken", "Lio/reactivex/rxjava3/core/Single;", "Lcom/galaxy/galaxyphoto/reponse/auth/AuthModel;", "getAccessToken", "Lio/reactivex/rxjava3/disposables/Disposable;", "app_debug"})
public final class AuthRepositoryImpl implements com.galaxy.galaxyphoto.domain.repository.AuthRepository {
    private final android.content.Context context = null;
    private final com.galaxy.galaxyphoto.domain.service.AuthService authService = null;
    
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.domain.service.AuthService authService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.disposables.Disposable getAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.auth.AuthModel> createAccessToken() {
        return null;
    }
}