package com.galaxy.galaxyphoto.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/galaxy/galaxyphoto/domain/repository/CollectionRepository;", "", "createCollection", "Lio/reactivex/rxjava3/core/Single;", "", "Lcom/galaxy/galaxyphoto/model/collection/CollectionModel;", "title", "", "description", "privacy", "", "app_debug"})
public abstract interface CollectionRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.galaxy.galaxyphoto.model.collection.CollectionModel>> createCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean privacy);
}