package com.codeart.filmskuy.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity;
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CatalogueDao_Impl implements CatalogueDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityInsertionAdapter<TvShowEntity> __insertionAdapterOfTvShowEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __updateAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<TvShowEntity> __updateAdapterOfTvShowEntity;

  public CatalogueDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `movie_favorite` (`popular`,`isFavorite`,`idSimilar`,`id`,`overview`,`backdrop_path`,`poster_path`,`release_date`,`title`,`vote_average`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        final int _tmp;
        _tmp = value.getPopular() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(2, _tmp_1);
        if (value.getIdSimilar() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdSimilar());
        }
        stmt.bindLong(4, value.getId());
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBackdropPath());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReleaseDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        stmt.bindDouble(10, value.getVoteAverage());
      }
    };
    this.__insertionAdapterOfTvShowEntity = new EntityInsertionAdapter<TvShowEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tv_show_favorite` (`popular`,`isFavorite`,`idSimilar`,`id`,`overview`,`backdrop_path`,`poster_path`,`first_air_date`,`name`,`vote_average`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvShowEntity value) {
        final int _tmp;
        _tmp = value.getPopular() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(2, _tmp_1);
        if (value.getIdSimilar() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdSimilar());
        }
        stmt.bindLong(4, value.getId());
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBackdropPath());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFirstAirDate());
        }
        if (value.getName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getName());
        }
        stmt.bindDouble(10, value.getVoteAverage());
      }
    };
    this.__updateAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `movie_favorite` SET `popular` = ?,`isFavorite` = ?,`idSimilar` = ?,`id` = ?,`overview` = ?,`backdrop_path` = ?,`poster_path` = ?,`release_date` = ?,`title` = ?,`vote_average` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        final int _tmp;
        _tmp = value.getPopular() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(2, _tmp_1);
        if (value.getIdSimilar() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdSimilar());
        }
        stmt.bindLong(4, value.getId());
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBackdropPath());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReleaseDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        stmt.bindDouble(10, value.getVoteAverage());
        stmt.bindLong(11, value.getId());
      }
    };
    this.__updateAdapterOfTvShowEntity = new EntityDeletionOrUpdateAdapter<TvShowEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tv_show_favorite` SET `popular` = ?,`isFavorite` = ?,`idSimilar` = ?,`id` = ?,`overview` = ?,`backdrop_path` = ?,`poster_path` = ?,`first_air_date` = ?,`name` = ?,`vote_average` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvShowEntity value) {
        final int _tmp;
        _tmp = value.getPopular() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(2, _tmp_1);
        if (value.getIdSimilar() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdSimilar());
        }
        stmt.bindLong(4, value.getId());
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBackdropPath());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFirstAirDate());
        }
        if (value.getName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getName());
        }
        stmt.bindDouble(10, value.getVoteAverage());
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public Object insertMovie(final List<MovieEntity> movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertTvShow(final List<TvShowEntity> tvShow, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTvShowEntity.insert(tvShow);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void updateFavoriteMovie(final MovieEntity movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMovieEntity.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateFavoriteTvShow(final TvShowEntity tvShow) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTvShowEntity.handle(tvShow);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<MovieEntity>> getAllMoviePopular() {
    final String _sql = "SELECT * FROM movie_favorite WHERE popular = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie_favorite"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new MovieEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getFavoriteMovie() {
    final String _sql = "SELECT * FROM movie_favorite WHERE isFavorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie_favorite"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new MovieEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getMovieSimilar(final String id) {
    final String _sql = "SELECT * FROM movie_favorite WHERE popular = 0 AND idSimilar = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie_favorite"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new MovieEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getSearchMovieByTitle(final String title) {
    final String _sql = "SELECT * FROM movie_favorite WHERE title LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie_favorite"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new MovieEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TvShowEntity>> getAllTvShowPopular() {
    final String _sql = "SELECT * FROM tv_show_favorite WHERE popular = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv_show_favorite"}, new Callable<List<TvShowEntity>>() {
      @Override
      public List<TvShowEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<TvShowEntity> _result = new ArrayList<TvShowEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvShowEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new TvShowEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TvShowEntity>> getFavoriteTvShow() {
    final String _sql = "SELECT * FROM tv_show_favorite WHERE isFavorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv_show_favorite"}, new Callable<List<TvShowEntity>>() {
      @Override
      public List<TvShowEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<TvShowEntity> _result = new ArrayList<TvShowEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvShowEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new TvShowEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TvShowEntity>> getTvShowSimilar(final String id) {
    final String _sql = "SELECT * FROM tv_show_favorite WHERE popular = 0 AND idSimilar = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv_show_favorite"}, new Callable<List<TvShowEntity>>() {
      @Override
      public List<TvShowEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<TvShowEntity> _result = new ArrayList<TvShowEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvShowEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new TvShowEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TvShowEntity>> getSearchTvShowByName(final String name) {
    final String _sql = "SELECT * FROM tv_show_favorite WHERE name LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv_show_favorite"}, new Callable<List<TvShowEntity>>() {
      @Override
      public List<TvShowEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfIdSimilar = CursorUtil.getColumnIndexOrThrow(_cursor, "idSimilar");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final List<TvShowEntity> _result = new ArrayList<TvShowEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvShowEntity _item;
            final boolean _tmpPopular;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPopular);
            _tmpPopular = _tmp != 0;
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final String _tmpIdSimilar;
            _tmpIdSimilar = _cursor.getString(_cursorIndexOfIdSimilar);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item = new TvShowEntity(_tmpPopular,_tmpIsFavorite,_tmpIdSimilar,_tmpId,_tmpOverview,_tmpBackdropPath,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
