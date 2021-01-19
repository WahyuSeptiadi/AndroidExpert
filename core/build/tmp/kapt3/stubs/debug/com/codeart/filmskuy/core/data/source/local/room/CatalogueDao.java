package com.codeart.filmskuy.core.data.source.local.room;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\'J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/local/room/CatalogueDao;", "", "getAllMoviePopular", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/codeart/filmskuy/core/data/source/local/entity/MovieEntity;", "getAllTvShowPopular", "Lcom/codeart/filmskuy/core/data/source/local/entity/TvShowEntity;", "getFavoriteMovie", "getFavoriteTvShow", "getSearchMovieByTitle", "title", "", "insertMovie", "", "movie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvShow", "tvShow", "updateFavoriteMovie", "updateFavoriteTvShow", "core_debug"})
public abstract interface CatalogueDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE popular = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getAllMoviePopular();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE isFavorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE title LIKE :title")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getSearchMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.entity.MovieEntity movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tv_show_favorite WHERE popular = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getAllTvShowPopular();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tv_show_favorite WHERE isFavorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getFavoriteTvShow();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTvShow(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity> tvShow, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity tvShow);
}