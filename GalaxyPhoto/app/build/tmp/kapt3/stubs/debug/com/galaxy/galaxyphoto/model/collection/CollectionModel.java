package com.galaxy.galaxyphoto.model.collection;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0013H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\t\u00105\u001a\u00020\bH\u00d6\u0001J\u0013\u00106\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020\bH\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006@"}, d2 = {"Lcom/galaxy/galaxyphoto/model/collection/CollectionModel;", "Landroid/os/Parcelable;", "coverPhoto", "", "description", "featured", "", "id", "", "lastCollectedAt", "links", "Lcom/galaxy/galaxyphoto/model/collection/LinksModel;", "private", "publishedAt", "shareKey", "title", "totalPhotos", "updatedAt", "user", "Lcom/galaxy/galaxyphoto/model/user/UserModel;", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Lcom/galaxy/galaxyphoto/model/collection/LinksModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/galaxy/galaxyphoto/model/user/UserModel;)V", "getCoverPhoto", "()Ljava/lang/String;", "getDescription", "getFeatured", "()Z", "getId", "()I", "getLastCollectedAt", "getLinks", "()Lcom/galaxy/galaxyphoto/model/collection/LinksModel;", "getPrivate", "getPublishedAt", "getShareKey", "getTitle", "getTotalPhotos", "getUpdatedAt", "getUser", "()Lcom/galaxy/galaxyphoto/model/user/UserModel;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CollectionModel implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coverPhoto = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final boolean featured = false;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastCollectedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final com.galaxy.galaxyphoto.model.collection.LinksModel links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publishedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shareKey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int totalPhotos = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final com.galaxy.galaxyphoto.model.user.UserModel user = null;
    public static final android.os.Parcelable.Creator<com.galaxy.galaxyphoto.model.collection.CollectionModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.collection.CollectionModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String coverPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean featured, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String lastCollectedAt, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.collection.LinksModel links, boolean p6_1990234817, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String shareKey, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int totalPhotos, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.user.UserModel user) {
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
    
    public CollectionModel() {
        super();
    }
    
    public CollectionModel(@org.jetbrains.annotations.NotNull()
    java.lang.String coverPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean featured, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String lastCollectedAt, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.collection.LinksModel links, boolean p6_1990234817, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String shareKey, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int totalPhotos, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.user.UserModel user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getFeatured() {
        return false;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastCollectedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.collection.LinksModel component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.collection.LinksModel getLinks() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getPrivate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShareKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getTotalPhotos() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.user.UserModel component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.user.UserModel getUser() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.galaxy.galaxyphoto.model.collection.CollectionModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.galaxy.galaxyphoto.model.collection.CollectionModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.galaxy.galaxyphoto.model.collection.CollectionModel[] newArray(int size) {
            return null;
        }
    }
}