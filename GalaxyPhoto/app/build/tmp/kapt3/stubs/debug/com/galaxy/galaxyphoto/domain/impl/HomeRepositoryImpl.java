package com.galaxy.galaxyphoto.domain.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J,\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\r0\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/impl/HomeRepositoryImpl;", "Lcom/galaxy/galaxyphoto/domain/repository/HomeRepository;", "context", "Landroid/content/Context;", "homeService", "Lcom/galaxy/galaxyphoto/domain/service/HomeService;", "(Landroid/content/Context;Lcom/galaxy/galaxyphoto/domain/service/HomeService;)V", "downLoadPhoto", "Lio/reactivex/rxjava3/core/Single;", "Lcom/galaxy/galaxyphoto/model/photo/UrlsModel;", "id", "", "getCollections", "", "Lcom/galaxy/galaxyphoto/model/photo/PhotoModel;", "useName", "page", "", "perPage", "getPhotoDetail", "photoId", "getPhotoList", "getPhotoWithTopic", "slug", "getTopics", "Lcom/galaxy/galaxyphoto/model/topic/TopicsModel;", "searchPhotos", "Lcom/galaxy/galaxyphoto/reponse/photo/PhotoModelData;", "query", "app_debug"})
public final class HomeRepositoryImpl implements com.galaxy.galaxyphoto.domain.repository.HomeRepository {
    private final android.content.Context context = null;
    private final com.galaxy.galaxyphoto.domain.service.HomeService homeService = null;
    
    public HomeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.domain.service.HomeService homeService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>> getPhotoList(int page, int perPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.model.photo.PhotoModel> getPhotoDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String photoId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.topic.TopicsModel>> getTopics(int page, int perPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>> getPhotoWithTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String slug, int page, int perPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.photo.PhotoModelData> searchPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int perPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>> getCollections(@org.jetbrains.annotations.NotNull()
    java.lang.String useName, int page, int perPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.model.photo.UrlsModel> downLoadPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}