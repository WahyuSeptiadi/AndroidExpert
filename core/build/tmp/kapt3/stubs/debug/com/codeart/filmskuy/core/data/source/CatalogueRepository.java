package com.codeart.filmskuy.core.data.source;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0016J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/CatalogueRepository;", "Lcom/codeart/filmskuy/core/domain/repository/ICatalogueRepository;", "remoteDataSource", "Lcom/codeart/filmskuy/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/codeart/filmskuy/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/codeart/filmskuy/core/utils/AppExecutors;", "(Lcom/codeart/filmskuy/core/data/source/remote/RemoteDataSource;Lcom/codeart/filmskuy/core/data/source/local/LocalDataSource;Lcom/codeart/filmskuy/core/utils/AppExecutors;)V", "getRemoteDataSource", "()Lcom/codeart/filmskuy/core/data/source/remote/RemoteDataSource;", "getAllMovieCatalogue", "Lkotlinx/coroutines/flow/Flow;", "Lcom/codeart/filmskuy/core/data/source/Resource;", "", "Lcom/codeart/filmskuy/core/domain/model/CatalogueModel;", "getAllTvShowCatalogue", "getFavoriteMovie", "setFavoriteMovieCatalogue", "", "catalogueModel", "state", "", "setFavoriteTvShowCatalogue", "core_debug"})
public final class CatalogueRepository implements com.codeart.filmskuy.core.domain.repository.ICatalogueRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.codeart.filmskuy.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.codeart.filmskuy.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.codeart.filmskuy.core.utils.AppExecutors appExecutors = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getAllMovieCatalogue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getAllTvShowCatalogue() {
        return null;
    }
    
    @java.lang.Override()
    public void setFavoriteMovieCatalogue(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.domain.model.CatalogueModel catalogueModel, boolean state) {
    }
    
    @java.lang.Override()
    public void setFavoriteTvShowCatalogue(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.domain.model.CatalogueModel catalogueModel, boolean state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codeart.filmskuy.core.data.source.remote.RemoteDataSource getRemoteDataSource() {
        return null;
    }
    
    public CatalogueRepository(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.utils.AppExecutors appExecutors) {
        super();
    }
}