package com.codeart.filmskuy.core.domain.usecase

import androidx.lifecycle.LiveData
import com.codeart.filmskuy.core.data.source.Resource
import com.codeart.filmskuy.core.domain.model.CatalogueModel

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

interface CatalogueUsecase {
    fun getAllMovieCatalogue(): LiveData<Resource<List<CatalogueModel>>>
    fun getAllTvShowCatalogue(): LiveData<Resource<List<CatalogueModel>>>
}