package com.codeart.filmskuy.core.data.source.local;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fJ\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fJ\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0019\u001a\u00020\bJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u001b\u001a\u00020\bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\u001d\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/codeart/filmskuy/core/data/source/local/LocalDataSource;", "", "catalogueDao", "Lcom/codeart/filmskuy/core/data/source/local/room/CatalogueDao;", "(Lcom/codeart/filmskuy/core/data/source/local/room/CatalogueDao;)V", "deleteAllUnFavoriteMovie", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllUnFavoriteTvShow", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/codeart/filmskuy/core/data/source/local/entity/MovieEntity;", "getAllTvShow", "Lcom/codeart/filmskuy/core/data/source/local/entity/TvShowEntity;", "getCountMovie", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountTvShow", "getFavoriteMovie", "getFavoriteTvShow", "getMovieSimilar", "getSearchMovie", "title", "getSearchTvShow", "name", "getTvShowSimilar", "insertMovie", "movieList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvShow", "tvShowList", "setFavoriteMovie", "movie", "newState", "", "setFavoriteTvShow", "tvShow", "core_debug"})
public final class LocalDataSource {
    private final com.codeart.filmskuy.core.data.source.local.room.CatalogueDao catalogueDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getAllMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getAllTvShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity> movieList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTvShow(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity> tvShowList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.entity.MovieEntity movie, boolean newState) {
    }
    
    public final void setFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity tvShow, boolean newState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getFavoriteTvShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getSearchTvShow(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getMovieSimilar(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getTvShowSimilar(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllUnFavoriteMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllUnFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCountMovie(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCountTvShow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.room.CatalogueDao catalogueDao) {
        super();
    }
}