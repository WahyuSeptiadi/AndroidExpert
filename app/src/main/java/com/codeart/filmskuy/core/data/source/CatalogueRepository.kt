package com.codeart.filmskuy.core.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.codeart.filmskuy.core.data.source.local.LocalDataSource
import com.codeart.filmskuy.core.data.source.remote.RemoteDataSource
import com.codeart.filmskuy.core.data.source.remote.network.ApiResponse
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository
import com.codeart.filmskuy.core.utils.AppExecutors
import com.codeart.filmskuy.core.utils.DataMapper

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class CatalogueRepository private constructor(
    val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : ICatalogueRepository {

    companion object {
        @Volatile
        private var instance: CatalogueRepository? = null

        fun getInstance(
            remoteData: RemoteDataSource,
            localData: LocalDataSource,
            appExecutors: AppExecutors
        ): CatalogueRepository =
            instance ?: synchronized(this) {
                instance ?: CatalogueRepository(remoteData, localData, appExecutors)
            }
    }

    override fun getAllMovieCatalogue(): LiveData<Resource<List<CatalogueModel>>> =
        object :
            NetworkBoundResource<List<CatalogueModel>, List<MovieResultResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<List<CatalogueModel>> {
                return Transformations.map(localDataSource.getAllMovie()) {
                    DataMapper.mapMovieEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<CatalogueModel>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MovieResultResponse>>> =
                remoteDataSource.getAllMovie()

            override fun saveCallResult(data: List<MovieResultResponse>) {
                val movieList = DataMapper.mapMovieResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }
        }.asLiveData()

    override fun getAllTvShowCatalogue(): LiveData<Resource<List<CatalogueModel>>> =
        object :
            NetworkBoundResource<List<CatalogueModel>, List<TvShowResultResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<List<CatalogueModel>> {
                return Transformations.map(localDataSource.getAllTvShow()) {
                    DataMapper.mapTvShowEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<CatalogueModel>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvShowResultResponse>>> =
                remoteDataSource.getAllTvShow()

            override fun saveCallResult(data: List<TvShowResultResponse>) {
                val tvShowList = DataMapper.mapTvShowResponsesToEntities(data)
                localDataSource.insertTvShow(tvShowList)
            }
        }.asLiveData()

    override fun setFavoriteMovieCatalogue(catalogueModel: CatalogueModel, state: Boolean) {
        val movieEntity = DataMapper.mapMovieDomainToEntity(catalogueModel)
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movieEntity, state) }
    }
}