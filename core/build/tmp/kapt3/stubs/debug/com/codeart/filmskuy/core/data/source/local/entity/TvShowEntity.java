package com.codeart.filmskuy.core.data.source.local.entity;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@androidx.room.Entity(tableName = "tv_show_favorite")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003Ji\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0006H\u00d6\u0001J\t\u0010+\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/local/entity/TvShowEntity;", "", "popular", "", "isFavorite", "id", "", "overview", "", "backdropPath", "posterPath", "firstAirDate", "name", "voteAverage", "", "(ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getBackdropPath", "()Ljava/lang/String;", "getFirstAirDate", "getId", "()I", "()Z", "setFavorite", "(Z)V", "getName", "getOverview", "getPopular", "getPosterPath", "getVoteAverage", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "core_debug"})
public final class TvShowEntity {
    private final boolean popular = false;
    private boolean isFavorite;
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
    @androidx.room.ColumnInfo(name = "first_air_date")
    private final java.lang.String firstAirDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
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
    public final java.lang.String getFirstAirDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public TvShowEntity(boolean popular, boolean isFavorite, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String firstAirDate, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double voteAverage) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    /**
     * Created by wahyu_septiadi on 17, January 2021.
     * Visit My GitHub --> https://github.com/WahyuSeptiadi
     */
    @org.jetbrains.annotations.NotNull()
    public final com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity copy(boolean popular, boolean isFavorite, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String firstAirDate, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double voteAverage) {
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