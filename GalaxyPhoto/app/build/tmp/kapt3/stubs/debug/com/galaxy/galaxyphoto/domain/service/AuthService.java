package com.galaxy.galaxyphoto.domain.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H\'J<\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/service/AuthService;", "", "createAccessToken", "Lio/reactivex/rxjava3/core/Single;", "Lcom/galaxy/galaxyphoto/reponse/auth/AuthResponse;", "access", "", "key", "redirectUri", "responseType", "scope", "getAccessToken", "Lretrofit2/Response;", "app_debug"})
public abstract interface AuthService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "oauth/authorize")
    public abstract io.reactivex.rxjava3.core.Single<retrofit2.Response<java.lang.Object>> getAccessToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "redirect_uri")
    java.lang.String redirectUri, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "response_type")
    java.lang.String responseType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "scope")
    java.lang.String scope);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "oauth/token")
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.auth.AuthResponse> createAccessToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String access, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_secret")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "redirect_uri")
    java.lang.String redirectUri, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "code")
    java.lang.String responseType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "grant_type")
    java.lang.String scope);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}