package com.galaxy.galaxyphoto.domain.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0004H\'\u00a8\u0006\n"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/service/CollectionService;", "", "createCollection", "Lio/reactivex/rxjava3/core/Single;", "", "key", "", "title", "description", "privacy", "app_debug"})
public abstract interface CollectionService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "collections")
    public abstract io.reactivex.rxjava3.core.Single<java.lang.Boolean> createCollection(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "title")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "description")
    java.lang.String description, @retrofit2.http.Query(value = "private")
    boolean privacy);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}