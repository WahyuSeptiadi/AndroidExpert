package com.codeart.filmskuy.core.data.source.local.entity;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@androidx.room.Entity(tableName = "movie_favorite")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003Ju\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\bH\u00d6\u0001J\t\u0010.\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006/"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/local/entity/MovieEntity;", "", "popular", "", "isFavorite", "idSimilar", "", "id", "", "overview", "backdropPath", "posterPath", "releaseDate", "title", "voteAverage", "", "(ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getBackdropPath", "()Ljava/lang/String;", "getId", "()I", "getIdSimilar", "()Z", "setFavorite", "(Z)V", "getOverview", "getPopular", "getPosterPath", "getReleaseDate", "getTitle", "getVoteAverage", "()D", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "core_debug"})
public final class MovieEntity {
    private final boolean popular = false;
    private boolean isFavorite;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idSimilar = null;
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "backdrop_path")
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "poster_path")
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "release_date")
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "vote_average")
    private final double voteAverage = 0.0;
    
    public final boolean getPopular() {
        return false;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdSimilar() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public MovieEntity(boolean popular, boolean isFavorite, @org.jetbrains.annotations.Nullable()
    java.lang.String idSimilar, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String title, double voteAverage) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    /**
     * Created by wahyu_septiadi on 17, January 2021.
     * Visit My GitHub --> https://github.com/WahyuSeptiadi
     */
    @org.jetbrains.annotations.NotNull()
    public final com.codeart.filmskuy.core.data.source.local.entity.MovieEntity copy(boolean popular, boolean isFavorite, @org.jetbrains.annotations.Nullable()
    java.lang.String idSimilar, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String title, double voteAverage) {
        return null;
    }
    
    /**
     * Created by wahyu_septiadi on 17, January 2021.
     * Visit My GitHub --> https://github.com/WahyuSeptiadi
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by wahyu_septiadi on 17, January 2021.
     * Visit My GitHub --> https://github.com/WahyuSeptiadi
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by wahyu_septiadi on 17, January 2021.
     * Visit My GitHub --> https://github.com/WahyuSeptiadi
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}