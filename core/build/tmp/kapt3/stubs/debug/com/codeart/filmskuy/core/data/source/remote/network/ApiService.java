package com.codeart.filmskuy.core.data.source.remote.network;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/remote/network/ApiService;", "", "getMovies", "Lcom/codeart/filmskuy/core/data/source/remote/response/MovieListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSimilarMovie", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSimilarTvShow", "Lcom/codeart/filmskuy/core/data/source/remote/response/TvShowListResponse;", "tvId", "getTvShows", "searchMovie", "title", "searchTvShow", "name", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "discover/movie/?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US/")
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "discover/tv/?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US/")
    public abstract java.lang.Object getTvShows(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/movie?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US&")
    public abstract java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/tv?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US&")
    public abstract java.lang.Object searchTvShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{movie_id}/similar?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US/")
    public abstract java.lang.Object getSimilarMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/{tv_id}/similar?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US/")
    public abstract java.lang.Object getSimilarTvShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "tv_id")
    java.lang.String tvId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse> p1);
}