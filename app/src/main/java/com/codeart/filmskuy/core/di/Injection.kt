package com.codeart.filmskuy.core.di

import android.content.Context
import com.codeart.filmskuy.core.data.source.CatalogueRepository
import com.codeart.filmskuy.core.data.source.local.LocalDataSource
import com.codeart.filmskuy.core.data.source.local.room.CatalogueDatabase
import com.codeart.filmskuy.core.data.source.remote.RemoteDataSource
import com.codeart.filmskuy.core.data.source.remote.network.ApiConfig
import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository
import com.codeart.filmskuy.core.domain.usecase.CatalogueInteractor
import com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase
import com.codeart.filmskuy.core.utils.AppExecutors

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

object Injection {
    private fun provideRepository(context: Context): ICatalogueRepository {
        val database = CatalogueDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.catalogueDao())
        val appExecutors = AppExecutors()

        return CatalogueRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideCatalogueUseCase(context: Context): CatalogueUsecase {
        val repository = provideRepository(context)
        return CatalogueInteractor(repository)
    }
}