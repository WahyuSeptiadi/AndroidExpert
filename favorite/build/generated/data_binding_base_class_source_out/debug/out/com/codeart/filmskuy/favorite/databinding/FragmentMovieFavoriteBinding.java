// Generated by view binder compiler. Do not edit!
package com.codeart.filmskuy.favorite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.codeart.filmskuy.favorite.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMovieFavoriteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView movieFavoriteNotFound;

  @NonNull
  public final ProgressBar progressMovieFavorite;

  @NonNull
  public final RecyclerView rvFavMovie;

  private FragmentMovieFavoriteBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView movieFavoriteNotFound, @NonNull ProgressBar progressMovieFavorite,
      @NonNull RecyclerView rvFavMovie) {
    this.rootView = rootView;
    this.movieFavoriteNotFound = movieFavoriteNotFound;
    this.progressMovieFavorite = progressMovieFavorite;
    this.rvFavMovie = rvFavMovie;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movie_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.movieFavoriteNotFound;
      TextView movieFavoriteNotFound = rootView.findViewById(id);
      if (movieFavoriteNotFound == null) {
        break missingId;
      }

      id = R.id.progressMovieFavorite;
      ProgressBar progressMovieFavorite = rootView.findViewById(id);
      if (progressMovieFavorite == null) {
        break missingId;
      }

      id = R.id.rvFavMovie;
      RecyclerView rvFavMovie = rootView.findViewById(id);
      if (rvFavMovie == null) {
        break missingId;
      }

      return new FragmentMovieFavoriteBinding((RelativeLayout) rootView, movieFavoriteNotFound,
          progressMovieFavorite, rvFavMovie);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
