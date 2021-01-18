package com.codeart.filmskuy.favorite.di

import com.codeart.filmskuy.favorite.movie.MovieFavoriteViewModel
import com.codeart.filmskuy.favorite.tvshow.TvShowFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

val favoriteModule = module {
    viewModel { MovieFavoriteViewModel(get()) }
    viewModel { TvShowFavoriteViewModel(get()) }
}