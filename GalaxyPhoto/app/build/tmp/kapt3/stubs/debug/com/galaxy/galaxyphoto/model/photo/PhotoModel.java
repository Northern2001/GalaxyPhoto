package com.galaxy.galaxyphoto.model.photo;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0010H\u00c6\u0003J\t\u0010/\u001a\u00020\u0012H\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u000bH\u00c6\u0003J\t\u00108\u001a\u00020\bH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u009b\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0001J\t\u0010;\u001a\u00020\bH\u00d6\u0001J\u0013\u0010<\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020\bH\u00d6\u0001J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001e\u00a8\u0006F"}, d2 = {"Lcom/galaxy/galaxyphoto/model/photo/PhotoModel;", "Landroid/os/Parcelable;", "altDescription", "", "blurHash", "color", "createdAt", "height", "", "id", "likedByUser", "", "likes", "slug", "updatedAt", "urls", "Lcom/galaxy/galaxyphoto/model/photo/UrlsModel;", "user", "Lcom/galaxy/galaxyphoto/model/user/UserModel;", "width", "tags", "", "Lcom/galaxy/galaxyphoto/model/photo/TagsModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Lcom/galaxy/galaxyphoto/model/photo/UrlsModel;Lcom/galaxy/galaxyphoto/model/user/UserModel;ILjava/util/List;)V", "getAltDescription", "()Ljava/lang/String;", "getBlurHash", "getColor", "getCreatedAt", "getHeight", "()I", "getId", "getLikedByUser", "()Z", "getLikes", "getSlug", "getTags", "()Ljava/util/List;", "getUpdatedAt", "getUrls", "()Lcom/galaxy/galaxyphoto/model/photo/UrlsModel;", "getUser", "()Lcom/galaxy/galaxyphoto/model/user/UserModel;", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class PhotoModel implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String altDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String blurHash = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String color = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    private final int height = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final boolean likedByUser = false;
    private final int likes = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final com.galaxy.galaxyphoto.model.photo.UrlsModel urls = null;
    @org.jetbrains.annotations.NotNull()
    private final com.galaxy.galaxyphoto.model.user.UserModel user = null;
    private final int width = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.galaxy.galaxyphoto.model.photo.TagsModel> tags = null;
    public static final android.os.Parcelable.Creator<com.galaxy.galaxyphoto.model.photo.PhotoModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.photo.PhotoModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String altDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String blurHash, @org.jetbrains.annotations.NotNull()
    java.lang.String color, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean likedByUser, int likes, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.photo.UrlsModel urls, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.user.UserModel user, int width, @org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.photo.TagsModel> tags) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PhotoModel() {
        super();
    }
    
    public PhotoModel(@org.jetbrains.annotations.NotNull()
    java.lang.String altDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String blurHash, @org.jetbrains.annotations.NotNull()
    java.lang.String color, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean likedByUser, int likes, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.photo.UrlsModel urls, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.user.UserModel user, int width, @org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.model.photo.TagsModel> tags) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAltDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlurHash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getLikedByUser() {
        return false;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getLikes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.photo.UrlsModel component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.photo.UrlsModel getUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.user.UserModel component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.user.UserModel getUser() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.photo.TagsModel> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.model.photo.TagsModel> getTags() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.galaxy.galaxyphoto.model.photo.PhotoModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.galaxy.galaxyphoto.model.photo.PhotoModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.galaxy.galaxyphoto.model.photo.PhotoModel[] newArray(int size) {
            return null;
        }
    }
}