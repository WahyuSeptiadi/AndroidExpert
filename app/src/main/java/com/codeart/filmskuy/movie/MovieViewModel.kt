package com.codeart.filmskuy.movie

import androidx.lifecycle.ViewModel
import com.codeart.filmskuy.core.domain.usecase.MovieUsecase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class MovieViewModel(movieUseCase: MovieUsecase) : ViewModel() {
    val movie = movieUseCase.getAllMovie()
}