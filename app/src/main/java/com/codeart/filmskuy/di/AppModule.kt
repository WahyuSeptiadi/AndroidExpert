package com.codeart.filmskuy.di

import com.codeart.filmskuy.core.domain.usecase.CatalogueInteract
import com.codeart.filmskuy.core.domain.usecase.CatalogueUseCase
import com.codeart.filmskuy.detail.DetailViewModel
import com.codeart.filmskuy.movie.MovieViewModel
import com.codeart.filmskuy.tvshow.TvShowViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

val useCaseModule = module {
    factory<CatalogueUseCase> { CatalogueInteract(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { TvShowViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}