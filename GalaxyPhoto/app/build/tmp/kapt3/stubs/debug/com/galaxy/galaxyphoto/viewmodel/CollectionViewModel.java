package com.galaxy.galaxyphoto.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/galaxy/galaxyphoto/viewmodel/CollectionViewModel;", "Lcom/galaxy/galaxyphoto/base/BaseViewModel;", "collectionRepository", "Lcom/galaxy/galaxyphoto/domain/repository/CollectionRepository;", "(Lcom/galaxy/galaxyphoto/domain/repository/CollectionRepository;)V", "<set-?>", "Lcom/galaxy/galaxyphoto/model/collection/CollectionModel;", "collectionModel", "getCollectionModel", "()Lcom/galaxy/galaxyphoto/model/collection/CollectionModel;", "setCollectionModel", "(Lcom/galaxy/galaxyphoto/model/collection/CollectionModel;)V", "collectionModel$delegate", "Landroidx/compose/runtime/MutableState;", "createCollections", "", "context", "Landroid/content/Context;", "title", "", "description", "privacy", "", "app_debug"})
public final class CollectionViewModel extends com.galaxy.galaxyphoto.base.BaseViewModel {
    private final com.galaxy.galaxyphoto.domain.repository.CollectionRepository collectionRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState collectionModel$delegate = null;
    
    public CollectionViewModel(@org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.domain.repository.CollectionRepository collectionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.galaxy.galaxyphoto.model.collection.CollectionModel getCollectionModel() {
        return null;
    }
    
    public final void setCollectionModel(@org.jetbrains.annotations.NotNull()
    com.galaxy.galaxyphoto.model.collection.CollectionModel p0) {
    }
    
    public final void createCollections(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean privacy) {
    }
}