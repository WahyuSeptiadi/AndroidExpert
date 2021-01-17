package com.codeart.filmskuy.core.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codeart.filmskuy.core.di.Injection
import com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase
import com.codeart.filmskuy.movie.MovieViewModel
import com.codeart.filmskuy.tvshow.TvShowViewModel

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class ViewModelFactory private constructor(private val catalogueUseCase: CatalogueUsecase) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(
                    Injection.provideCatalogueUseCase(context)
                )
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                MovieViewModel(catalogueUseCase) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                TvShowViewModel(catalogueUseCase) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
}