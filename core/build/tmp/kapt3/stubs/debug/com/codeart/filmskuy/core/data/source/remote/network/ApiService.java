package com.codeart.filmskuy.core.data.source.remote.network;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/remote/network/ApiService;", "", "getMovies", "Lcom/codeart/filmskuy/core/data/source/remote/response/MovieListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTvShows", "Lcom/codeart/filmskuy/core/data/source/remote/response/TvShowListResponse;", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3/discover/movie/?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US/")
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3/discover/tv/?api_key=99eba79685cf74de1c83d8e4c8885cd1&language=en-US/")
    public abstract java.lang.Object getTvShows(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse> p0);
}