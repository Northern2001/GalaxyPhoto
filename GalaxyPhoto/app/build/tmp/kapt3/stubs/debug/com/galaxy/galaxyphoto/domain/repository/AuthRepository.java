package com.galaxy.galaxyphoto.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/repository/AuthRepository;", "", "createAccessToken", "Lio/reactivex/rxjava3/core/Single;", "Lcom/galaxy/galaxyphoto/reponse/auth/AuthModel;", "getAccessToken", "Lio/reactivex/rxjava3/disposables/Disposable;", "app_debug"})
public abstract interface AuthRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.disposables.Disposable getAccessToken();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.auth.AuthModel> createAccessToken();
}