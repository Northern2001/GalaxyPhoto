package com.galaxy.galaxyphoto.reponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/galaxy/galaxyphoto/reponse/ImageResponse;", "", "hits", "", "Lcom/galaxy/galaxyphoto/reponse/HitResponse;", "total", "", "totalHits", "(Ljava/util/List;II)V", "getHits", "()Ljava/util/List;", "getTotal", "()I", "getTotalHits", "component1", "component2", "component3", "convertToModel", "Lcom/galaxy/galaxyphoto/model/ImageModel;", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class ImageResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hits")
    private final java.util.List<com.galaxy.galaxyphoto.reponse.HitResponse> hits = null;
    @com.google.gson.annotations.SerializedName(value = "total")
    private final int total = 0;
    @com.google.gson.annotations.SerializedName(value = "totalHits")
    private final int totalHits = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.reponse.ImageResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.reponse.HitResponse> hits, int total, int totalHits) {
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
    
    public ImageResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.galaxy.galaxyphoto.reponse.HitResponse> hits, int total, int totalHits) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.reponse.HitResponse> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.galaxy.galaxyphoto.reponse.HitResponse> getHits() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalHits() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.ImageModel convertToModel() {
        return null;
    }
}