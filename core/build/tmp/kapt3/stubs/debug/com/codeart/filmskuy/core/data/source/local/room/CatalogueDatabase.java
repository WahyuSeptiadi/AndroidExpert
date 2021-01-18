package com.codeart.filmskuy.core.data.source.local.room;

import java.lang.System;

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */
@androidx.room.Database(entities = {com.codeart.filmskuy.core.data.source.local.entity.MovieEntity.class, com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/codeart/filmskuy/core/data/source/local/room/CatalogueDatabase;", "Landroidx/room/RoomDatabase;", "()V", "catalogueDao", "Lcom/codeart/filmskuy/core/data/source/local/room/CatalogueDao;", "core_debug"})
public abstract class CatalogueDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codeart.filmskuy.core.data.source.local.room.CatalogueDao catalogueDao();
    
    public CatalogueDatabase() {
        super();
    }
}