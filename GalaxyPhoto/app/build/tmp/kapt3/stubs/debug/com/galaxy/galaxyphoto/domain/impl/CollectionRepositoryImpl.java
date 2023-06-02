package com.galaxy.galaxyphoto.domain.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/impl/CollectionRepositoryImpl;", "Lcom/galaxy/galaxyphoto/domain/repository/CollectionRepository;", "context", "Landroid/content/Context;", "collectionService", "Lcom/galaxy/galaxyphoto/domain/service/CollectionService;", "(Landroid/content/Context;Lcom/galaxy/galaxyphoto/domain/service/CollectionService;)V", "createCollection", "Lio/reactivex/rxjava3/core/Single;", "", "Lcom/galaxy/galaxyphoto/model/collection/CollectionModel;", "title", "", "description", "privacy", "", "app_debug"})
public final class CollectionRepositoryImpl implements com.galaxy.galaxyphoto.domain.repository.CollectionRepository {
    private final android.content.Context context = null;
    private final com.galaxy.galaxyphoto.domain.service.CollectionService collectionService = null;
    
    public CollectionRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.domain.service.CollectionService collectionService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.collection.CollectionModel>> createCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean privacy) {
        return null;
    }
}