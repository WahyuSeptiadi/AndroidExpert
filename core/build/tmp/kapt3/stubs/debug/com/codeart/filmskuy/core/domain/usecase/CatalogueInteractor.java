package com.codeart.filmskuy.core.domain.usecase;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/codeart/filmskuy/core/domain/usecase/CatalogueInteractor;", "Lcom/codeart/filmskuy/core/domain/usecase/CatalogueUsecase;", "iCatalogueRepository", "Lcom/codeart/filmskuy/core/domain/repository/ICatalogueRepository;", "(Lcom/codeart/filmskuy/core/domain/repository/ICatalogueRepository;)V", "getAllMovieCatalogue", "Lkotlinx/coroutines/flow/Flow;", "Lcom/codeart/filmskuy/core/data/source/Resource;", "", "Lcom/codeart/filmskuy/core/domain/model/CatalogueModel;", "getAllTvShowCatalogue", "getFavoriteMovie", "getFavoriteTvShow", "getSearchMovieByTitle", "title", "", "getSearchTvShowByName", "name", "getSimilarMovieList", "id", "setFavoriteMovieCatalogue", "", "catalogueModel", "state", "", "setFavoriteTvShowCatalogue", "core_debug"})
public final class CatalogueInteractor implements com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase {
    private final com.codeart.filmskuy.core.domain.repository.ICatalogueRepository iCatalogueRepository = null;
    
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
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>> getFavoriteTvShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSearchMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSearchTvShowByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSimilarMovieList(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public CatalogueInteractor(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.domain.repository.ICatalogueRepository iCatalogueRepository) {
        super();
    }
}