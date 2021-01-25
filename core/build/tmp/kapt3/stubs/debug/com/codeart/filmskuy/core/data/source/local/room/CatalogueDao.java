package com.codeart.filmskuy.core.data.source.local.room;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\tH\'J\u0011\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\tH\'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0016\u001a\u00020\u0005H\'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\u0018\u001a\u00020\u0005H\'J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001f\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000bH\'J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\rH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/local/room/CatalogueDao;", "", "deleteAllUnFavoriteMovie", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllUnFavoriteTvShow", "getAllMoviePopular", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/codeart/filmskuy/core/data/source/local/entity/MovieEntity;", "getAllTvShowPopular", "Lcom/codeart/filmskuy/core/data/source/local/entity/TvShowEntity;", "getCountMovie", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountTvShow", "getFavoriteMovie", "getFavoriteTvShow", "getMovieSimilar", "getSearchMovieByTitle", "title", "getSearchTvShowByName", "name", "getTvShowSimilar", "insertMovie", "movie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvShow", "tvShow", "updateFavoriteMovie", "updateFavoriteTvShow", "core_debug"})
public abstract interface CatalogueDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE popular = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getAllMoviePopular();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE isFavorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE popular = 0 AND idSimilar = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getMovieSimilar(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_favorite WHERE title LIKE :title")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.MovieEntity>> getSearchMovieByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
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
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tv_show_favorite WHERE popular = 0 AND idSimilar = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getTvShowSimilar(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tv_show_favorite WHERE name LIKE :name")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity>> getSearchTvShowByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertTvShow(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity> tvShow, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity tvShow);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM movie_favorite WHERE popular = 0 AND isFavorite = 0 AND idSimilar != :id")
    public abstract java.lang.Object deleteAllUnFavoriteMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM tv_show_favorite WHERE popular = 0 AND isFavorite = 0 AND idSimilar != :id")
    public abstract java.lang.Object deleteAllUnFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(id) FROM movie_favorite")
    public abstract java.lang.Object getCountMovie(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(id) FROM tv_show_favorite")
    public abstract java.lang.Object getCountTvShow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
}