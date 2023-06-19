package com.galaxy.galaxyphoto.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010;\u001a\u00020<J\u001e\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020 2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@H\u0002J*\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020<0GJF\u0010I\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010J\u001a\u00020E2\b\b\u0002\u0010K\u001a\u00020 2\b\b\u0002\u0010L\u001a\u00020 2\u0018\u0010F\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020<0GJ\u0018\u0010\t\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010M\u001a\u00020NJ*\u0010O\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\u0006\u0010P\u001a\u00020E2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020<0GJF\u0010Q\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010R\u001a\u00020E2\b\b\u0002\u0010K\u001a\u00020 2\b\b\u0002\u0010L\u001a\u00020 2\u0018\u0010F\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020<0GJ\u0018\u0010S\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010M\u001a\u00020NJ\u0006\u0010T\u001a\u00020<J\u0006\u0010U\u001a\u00020<J,\u0010V\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010W\u001a\u00020E2\b\b\u0002\u0010M\u001a\u00020N2\b\b\u0002\u0010L\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR+\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\u000e\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010\'\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b*\u0010\u000e\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R+\u0010+\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R+\u0010/\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00078F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\u000e\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u00105\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010\u000e\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u00a8\u0006X"}, d2 = {"Lcom/galaxy/galaxyphoto/viewmodel/HomeViewModel;", "Lcom/galaxy/galaxyphoto/base/BaseViewModel;", "homeRepository", "Lcom/galaxy/galaxyphoto/domain/repository/HomeRepository;", "(Lcom/galaxy/galaxyphoto/domain/repository/HomeRepository;)V", "<set-?>", "", "Lcom/galaxy/galaxyphoto/model/photo/PhotoModel;", "listPhoto", "getListPhoto", "()Ljava/util/List;", "setListPhoto", "(Ljava/util/List;)V", "listPhoto$delegate", "Landroidx/compose/runtime/MutableState;", "listPhotoDetail", "getListPhotoDetail", "setListPhotoDetail", "listPhotoDetail$delegate", "listPhotoSearch", "getListPhotoSearch", "setListPhotoSearch", "listPhotoSearch$delegate", "listPhotoWithTopic", "getListPhotoWithTopic", "setListPhotoWithTopic", "listPhotoWithTopic$delegate", "Lcom/galaxy/galaxyphoto/model/topic/TopicsModel;", "listTopics", "getListTopics", "setListTopics", "listTopics$delegate", "", "pagePhoto", "getPagePhoto", "()I", "setPagePhoto", "(I)V", "pagePhoto$delegate", "pageSearch", "getPageSearch", "setPageSearch", "pageSearch$delegate", "pageTopic", "getPageTopic", "setPageTopic", "pageTopic$delegate", "photoModelDetail", "getPhotoModelDetail", "()Lcom/galaxy/galaxyphoto/model/photo/PhotoModel;", "setPhotoModelDetail", "(Lcom/galaxy/galaxyphoto/model/photo/PhotoModel;)V", "photoModelDetail$delegate", "topicModel", "getTopicModel", "()Lcom/galaxy/galaxyphoto/model/topic/TopicsModel;", "setTopicModel", "(Lcom/galaxy/galaxyphoto/model/topic/TopicsModel;)V", "topicModel$delegate", "addFistTopic", "", "checkData", "sizeList", "onHasData", "Lkotlin/Function0;", "downLoadPhoto", "context", "Landroid/content/Context;", "id", "", "onFinish", "Lkotlin/Function1;", "Lcom/galaxy/galaxyphoto/model/photo/UrlsModel;", "getCollections", "useName", "page", "perPage", "isLoadMore", "", "getPhotoDetail", "photoId", "getPhotoWithTopic", "slug", "getTopics", "reloadListPhoto", "reloadListTopic", "searchPhotos", "query", "app_debug"})
public final class HomeViewModel extends com.galaxy.galaxyphoto.base.BaseViewModel {
    private final com.galaxy.galaxyphoto.domain.repository.HomeRepository homeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState listPhoto$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState listPhotoWithTopic$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState listPhotoSearch$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState listPhotoDetail$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState photoModelDetail$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState listTopics$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState topicModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState pageTopic$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState pagePhoto$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState pageSearch$delegate = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.domain.repository.HomeRepository homeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> getListPhoto() {
        return null;
    }
    
    public final void setListPhoto(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> getListPhotoWithTopic() {
        return null;
    }
    
    public final void setListPhotoWithTopic(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> getListPhotoSearch() {
        return null;
    }
    
    public final void setListPhotoSearch(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> getListPhotoDetail() {
        return null;
    }
    
    public final void setListPhotoDetail(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.photo.PhotoModel getPhotoModelDetail() {
        return null;
    }
    
    public final void setPhotoModelDetail(@org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.photo.PhotoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.topic.TopicsModel> getListTopics() {
        return null;
    }
    
    public final void setListTopics(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.topic.TopicsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.topic.TopicsModel getTopicModel() {
        return null;
    }
    
    public final void setTopicModel(@org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.topic.TopicsModel p0) {
    }
    
    public final int getPageTopic() {
        return 0;
    }
    
    public final void setPageTopic(int p0) {
    }
    
    public final int getPagePhoto() {
        return 0;
    }
    
    public final void setPagePhoto(int p0) {
    }
    
    public final int getPageSearch() {
        return 0;
    }
    
    public final void setPageSearch(int p0) {
    }
    
    public final void addFistTopic() {
    }
    
    public final void reloadListPhoto() {
    }
    
    public final void reloadListTopic() {
    }
    
    public final void getListPhoto(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isLoadMore) {
    }
    
    public final void getPhotoDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String photoId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.galaxy.galaxyphoto.model.photo.PhotoModel, kotlin.Unit> onFinish) {
    }
    
    public final void getTopics(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isLoadMore) {
    }
    
    public final void getPhotoWithTopic(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, int page, int perPage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>, kotlin.Unit> onFinish) {
    }
    
    public final void searchPhotos(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String query, boolean isLoadMore, int perPage) {
    }
    
    public final void getCollections(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String useName, int page, int perPage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.galaxy.galaxyphoto.model.photo.PhotoModel>, kotlin.Unit> onFinish) {
    }
    
    public final void downLoadPhoto(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.galaxy.galaxyphoto.model.photo.UrlsModel, kotlin.Unit> onFinish) {
    }
    
    private final void checkData(int sizeList, kotlin.jvm.functions.Function0<kotlin.Unit> onHasData) {
    }
}