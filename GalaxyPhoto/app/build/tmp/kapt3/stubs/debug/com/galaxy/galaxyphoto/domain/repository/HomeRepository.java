package com.galaxy.galaxyphoto.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u000f\u001a\u00020\u0006H&J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&\u00a8\u0006\u0018"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/repository/HomeRepository;", "", "downLoadPhoto", "Lio/reactivex/rxjava3/core/Single;", "Lcom/galaxy/galaxyphoto/model/photo/UrlsModel;", "id", "", "getCollections", "", "Lcom/galaxy/galaxyphoto/model/photo/PhotoModel;", "useName", "page", "", "perPage", "getPhotoDetail", "photoId", "getPhotoList", "getPhotoWithTopic", "slug", "getTopics", "Lcom/galaxy/galaxyphoto/model/topic/TopicsModel;", "searchPhotos", "Lcom/galaxy/galaxyphoto/reponse/photo/PhotoModelData;", "query", "app_debug"})
public abstract interface HomeRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>> getPhotoList(int page, int perPage);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.model.photo.PhotoModel> getPhotoDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String photoId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.topic.TopicsModel>> getTopics(int page, int perPage);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>> getPhotoWithTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String slug, int page, int perPage);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.photo.PhotoModelData> searchPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int perPage);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>> getCollections(@org.jetbrains.annotations.NotNull()
    java.lang.String useName, int page, int perPage);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.model.photo.UrlsModel> downLoadPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}