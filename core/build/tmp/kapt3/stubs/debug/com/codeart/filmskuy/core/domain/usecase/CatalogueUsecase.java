package com.codeart.filmskuy.core.domain.usecase;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000f"}, d2 = {"Lcom/codeart/filmskuy/core/domain/usecase/CatalogueUsecase;", "", "getAllMovieCatalogue", "Lkotlinx/coroutines/flow/Flow;", "Lcom/codeart/filmskuy/core/data/source/Resource;", "", "Lcom/codeart/filmskuy/core/domain/model/CatalogueModel;", "getAllTvShowCatalogue", "getFavoriteMovie", "setFavoriteMovieCatalogue", "", "catalogueModel", "state", "", "setFavoriteTvShowCatalogue", "core_debug"})
public abstract interface CatalogueUsecase {
    
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
}