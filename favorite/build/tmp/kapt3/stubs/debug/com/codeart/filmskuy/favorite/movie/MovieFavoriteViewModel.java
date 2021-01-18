package com.codeart.filmskuy.favorite.movie;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/codeart/filmskuy/favorite/movie/MovieFavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "catalogueUseCase", "Lcom/codeart/filmskuy/core/domain/usecase/CatalogueUsecase;", "(Lcom/codeart/filmskuy/core/domain/usecase/CatalogueUsecase;)V", "movieFavorite", "Landroidx/lifecycle/LiveData;", "", "Lcom/codeart/filmskuy/core/domain/model/CatalogueModel;", "getMovieFavorite", "()Landroidx/lifecycle/LiveData;", "favorite_debug"})
public final class MovieFavoriteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>> movieFavorite = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.codeart.filmskuy.core.domain.model.CatalogueModel>> getMovieFavorite() {
        return null;
    }
    
    public MovieFavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase catalogueUseCase) {
        super();
    }
}