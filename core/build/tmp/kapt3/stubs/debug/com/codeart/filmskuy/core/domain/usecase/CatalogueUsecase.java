package com.codeart.filmskuy.core.domain.usecase;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u000e\u001a\u00020\fH&J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0010\u001a\u00020\fH&J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0010\u001a\u00020\fH&J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&\u00a8\u0006\u0018"}, d2 = {"Lcom/codeart/filmskuy/core/domain/usecase/CatalogueUseCase;", "", "getAllMovieCatalogue", "Lkotlinx/coroutines/flow/Flow;", "Lcom/codeart/filmskuy/core/data/source/Resource;", "", "Lcom/codeart/filmskuy/core/domain/model/CatalogueModel;", "getAllTvShowCatalogue", "getFavoriteMovie", "getFavoriteTvShow", "getSearchMovieByTitle", "title", "", "getSearchTvShowByName", "name", "getSimilarMovieList", "id", "getSimilarTvShowList", "setFavoriteMovieCatalogue", "", "catalogueModel", "state", "", "setFavoriteTvShowCatalogue", "core_debug"})
public abstract interface CatalogueUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getAllMovieCatalogue();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getAllTvShowCatalogue();
    
    public abstract void setFavoriteMovieCatalogue(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.domain.model.CatalogueModel catalogueModel, boolean state);
    
    public abstract void setFavoriteTvShowCatalogue(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.domain.model.CatalogueModel catalogueModel, boolean state);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>> getFavoriteTvShow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSearchMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSearchTvShowByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSimilarMovieList(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.Resource<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>>> getSimilarTvShowList(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}