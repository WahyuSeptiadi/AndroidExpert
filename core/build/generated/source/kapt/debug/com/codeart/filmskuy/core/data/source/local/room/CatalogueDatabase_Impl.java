package com.codeart.filmskuy.core.data.source.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CatalogueDatabase_Impl extends CatalogueDatabase {
  private volatile CatalogueDao _catalogueDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_favorite` (`popular` INTEGER NOT NULL, `isFavorite` INTEGER NOT NULL, `idSimilar` TEXT, `id` INTEGER NOT NULL, `overview` TEXT NOT NULL, `backdrop_path` TEXT, `poster_path` TEXT, `release_date` TEXT, `title` TEXT NOT NULL, `vote_average` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tv_show_favorite` (`popular` INTEGER NOT NULL, `isFavorite` INTEGER NOT NULL, `idSimilar` TEXT, `id` INTEGER NOT NULL, `overview` TEXT NOT NULL, `backdrop_path` TEXT, `poster_path` TEXT, `first_air_date` TEXT, `name` TEXT NOT NULL, `vote_average` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f366bbac6a7a1f42d791e1aee230f206')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie_favorite`");
        _db.execSQL("DROP TABLE IF EXISTS `tv_show_favorite`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieFavorite = new HashMap<String, TableInfo.Column>(10);
        _columnsMovieFavorite.put("popular", new TableInfo.Column("popular", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("idSimilar", new TableInfo.Column("idSimilar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieFavorite.put("vote_average", new TableInfo.Column("vote_average", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieFavorite = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieFavorite = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieFavorite = new TableInfo("movie_favorite", _columnsMovieFavorite, _foreignKeysMovieFavorite, _indicesMovieFavorite);
        final TableInfo _existingMovieFavorite = TableInfo.read(_db, "movie_favorite");
        if (! _infoMovieFavorite.equals(_existingMovieFavorite)) {
          return new RoomOpenHelper.ValidationResult(false, "movie_favorite(com.codeart.filmskuy.core.data.source.local.entity.MovieEntity).\n"
                  + " Expected:\n" + _infoMovieFavorite + "\n"
                  + " Found:\n" + _existingMovieFavorite);
        }
        final HashMap<String, TableInfo.Column> _columnsTvShowFavorite = new HashMap<String, TableInfo.Column>(10);
        _columnsTvShowFavorite.put("popular", new TableInfo.Column("popular", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("idSimilar", new TableInfo.Column("idSimilar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("first_air_date", new TableInfo.Column("first_air_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvShowFavorite.put("vote_average", new TableInfo.Column("vote_average", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTvShowFavorite = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTvShowFavorite = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTvShowFavorite = new TableInfo("tv_show_favorite", _columnsTvShowFavorite, _foreignKeysTvShowFavorite, _indicesTvShowFavorite);
        final TableInfo _existingTvShowFavorite = TableInfo.read(_db, "tv_show_favorite");
        if (! _infoTvShowFavorite.equals(_existingTvShowFavorite)) {
          return new RoomOpenHelper.ValidationResult(false, "tv_show_favorite(com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity).\n"
                  + " Expected:\n" + _infoTvShowFavorite + "\n"
                  + " Found:\n" + _existingTvShowFavorite);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f366bbac6a7a1f42d791e1aee230f206", "44864d965508297cc9c9e70e6287074e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie_favorite","tv_show_favorite");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie_favorite`");
      _db.execSQL("DELETE FROM `tv_show_favorite`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CatalogueDao catalogueDao() {
    if (_catalogueDao != null) {
      return _catalogueDao;
    } else {
      synchronized(this) {
        if(_catalogueDao == null) {
          _catalogueDao = new CatalogueDao_Impl(this);
        }
        return _catalogueDao;
      }
    }
  }
}
