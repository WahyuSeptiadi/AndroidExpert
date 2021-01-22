package com.codeart.filmskuy.core.data.source.remote;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 08, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/codeart/filmskuy/core/data/source/remote/network/ApiService;", "(Lcom/codeart/filmskuy/core/data/source/remote/network/ApiService;)V", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/codeart/filmskuy/core/data/source/remote/network/ApiResponse;", "", "Lcom/codeart/filmskuy/core/data/source/remote/response/MovieResultResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTvShow", "Lcom/codeart/filmskuy/core/data/source/remote/response/TvShowResultResponse;", "getSearchMovie", "title", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchTvShow", "name", "getSimilarMovie", "id", "core_debug"})
public final class RemoteDataSource {
    private final com.codeart.filmskuy.core.data.source.remote.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllMovie(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.codeart.filmskuy.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllTvShow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.codeart.filmskuy.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.codeart.filmskuy.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchTvShow(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.codeart.filmskuy.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.codeart.filmskuy.core.data.source.remote.network.ApiResponse<java.util.List<com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse>>> getSimilarMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.codeart.filmskuy.core.data.source.remote.network.ApiService apiService) {
        super();
    }
}