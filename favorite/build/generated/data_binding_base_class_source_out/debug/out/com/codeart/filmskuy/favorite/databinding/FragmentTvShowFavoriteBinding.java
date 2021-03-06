// Generated by view binder compiler. Do not edit!
package com.codeart.filmskuy.favorite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.codeart.filmskuy.favorite.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTvShowFavoriteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ProgressBar progressTvShowFavorite;

  @NonNull
  public final RecyclerView rvFavTvShow;

  @NonNull
  public final LottieAnimationView tvFavoriteEmpty;

  @NonNull
  public final RelativeLayout tvShowFragment;

  private FragmentTvShowFavoriteBinding(@NonNull RelativeLayout rootView,
      @NonNull ProgressBar progressTvShowFavorite, @NonNull RecyclerView rvFavTvShow,
      @NonNull LottieAnimationView tvFavoriteEmpty, @NonNull RelativeLayout tvShowFragment) {
    this.rootView = rootView;
    this.progressTvShowFavorite = progressTvShowFavorite;
    this.rvFavTvShow = rvFavTvShow;
    this.tvFavoriteEmpty = tvFavoriteEmpty;
    this.tvShowFragment = tvShowFragment;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTvShowFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTvShowFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_tv_show_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTvShowFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressTvShowFavorite;
      ProgressBar progressTvShowFavorite = rootView.findViewById(id);
      if (progressTvShowFavorite == null) {
        break missingId;
      }

      id = R.id.rvFavTvShow;
      RecyclerView rvFavTvShow = rootView.findViewById(id);
      if (rvFavTvShow == null) {
        break missingId;
      }

      id = R.id.tvFavoriteEmpty;
      LottieAnimationView tvFavoriteEmpty = rootView.findViewById(id);
      if (tvFavoriteEmpty == null) {
        break missingId;
      }

      RelativeLayout tvShowFragment = (RelativeLayout) rootView;

      return new FragmentTvShowFavoriteBinding((RelativeLayout) rootView, progressTvShowFavorite,
          rvFavTvShow, tvFavoriteEmpty, tvShowFragment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
