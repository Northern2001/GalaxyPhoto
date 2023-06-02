package com.galaxy.galaxyphoto.domain.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J<\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\'J2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u0006H\'J<\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\'J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\'J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\'\u00a8\u0006\u0019"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/service/HomeService;", "", "downLoadPhoto", "Lio/reactivex/rxjava3/core/Single;", "Lcom/galaxy/galaxyphoto/reponse/photo/UrlsResponse;", "id", "", "getCollections", "", "Lcom/galaxy/galaxyphoto/reponse/photo/PhotoResponse;", "userName", "key", "page", "", "perPage", "getPhoto", "getPhotoDetail", "photoId", "getPhotoWithTopic", "slug", "getTopics", "Lcom/galaxy/galaxyphoto/reponse/topic/TopicsResponse;", "searchPhotos", "Lcom/galaxy/galaxyphoto/reponse/photo/PhotoResponseData;", "query", "app_debug"})
public abstract interface HomeService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "photos/")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.reponse.photo.PhotoResponse>> getPhoto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "photos/{id}")
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.photo.PhotoResponse> getPhotoDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String photoId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "topics/")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.reponse.topic.TopicsResponse>> getTopics(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "topics/{id_or_slug}/photos")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.reponse.photo.PhotoResponse>> getPhotoWithTopic(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id_or_slug")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/photos")
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.photo.PhotoResponseData> searchPhotos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{username}/photos")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.reponse.photo.PhotoResponse>> getCollections(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String key, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "photos/{id}/download")
    public abstract io.reactivex.rxjava3.core.Single<com.galaxy.galaxyphoto.reponse.photo.UrlsResponse> downLoadPhoto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}