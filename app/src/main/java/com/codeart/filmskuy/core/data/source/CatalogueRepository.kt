package com.codeart.filmskuy.core.data.source

import com.codeart.filmskuy.core.data.source.local.LocalDataSource
import com.codeart.filmskuy.core.data.source.remote.RemoteDataSource
import com.codeart.filmskuy.core.data.source.remote.network.ApiResponse
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository
import com.codeart.filmskuy.core.utils.AppExecutors
import com.codeart.filmskuy.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class CatalogueRepository(
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

    override fun getAllMovieCatalogue(): Flow<Resource<List<CatalogueModel>>> =
        object :
            NetworkBoundResource<List<CatalogueModel>, List<MovieResultResponse>>(appExecutors) {
            override fun loadFromDB(): Flow<List<CatalogueModel>> {
                return localDataSource.getAllMovie().map { DataMapper.mapMovieEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<CatalogueModel>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<MovieResultResponse>>> =
                remoteDataSource.getAllMovie()

            override suspend fun saveCallResult(data: List<MovieResultResponse>) {
                val movieList = DataMapper.mapMovieResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }
        }.asFlow()

    override fun getAllTvShowCatalogue(): Flow<Resource<List<CatalogueModel>>> =
        object :
            NetworkBoundResource<List<CatalogueModel>, List<TvShowResultResponse>>(appExecutors) {
            override fun loadFromDB(): Flow<List<CatalogueModel>> {
                return localDataSource.getAllTvShow()
                    .map { DataMapper.mapTvShowEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<CatalogueModel>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<TvShowResultResponse>>> =
                remoteDataSource.getAllTvShow()

            override suspend fun saveCallResult(data: List<TvShowResultResponse>) {
                val tvShowList = DataMapper.mapTvShowResponsesToEntities(data)
                localDataSource.insertTvShow(tvShowList)
            }
        }.asFlow()

    override fun setFavoriteMovieCatalogue(catalogueModel: CatalogueModel, state: Boolean) {
        val movieEntity = DataMapper.mapMovieDomainToEntity(catalogueModel)
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movieEntity, state) }
    }

    override fun setFavoriteTvShowCatalogue(catalogueModel: CatalogueModel, state: Boolean) {
        val tvShowEntity = DataMapper.mapTvShowDomainToEntity(catalogueModel)
        appExecutors.diskIO().execute { localDataSource.setFavoriteTvShow(tvShowEntity, state) }
    }

    override fun getFavoriteMovie(): Flow<List<CatalogueModel>> {
        return localDataSource.getFavoriteMovie().map { DataMapper.mapMovieEntitiesToDomain(it) }
    }
}