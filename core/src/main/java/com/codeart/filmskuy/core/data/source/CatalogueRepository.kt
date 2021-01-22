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
import kotlinx.coroutines.flow.*

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class CatalogueRepository(
    val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : ICatalogueRepository {

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

    override fun getFavoriteTvShow(): Flow<List<CatalogueModel>> {
        return localDataSource.getFavoriteTvShow().map { DataMapper.mapTvShowEntitiesToDomain(it) }
    }

    override fun getSearchMovieByTitle(title: String): Flow<Resource<List<CatalogueModel>>> =
        object :
            NetworkBoundResource<List<CatalogueModel>, List<MovieResultResponse>>(appExecutors) {
            override fun loadFromDB(): Flow<List<CatalogueModel>> {
                return localDataSource.getSearchMovie(title)
                    .map { DataMapper.mapMovieEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<CatalogueModel>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<MovieResultResponse>>> =
                remoteDataSource.getSearchMovie(title)

            override suspend fun saveCallResult(data: List<MovieResultResponse>) {
                val movieList = DataMapper.mapSearchMovieResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }
        }.asFlow()

    override fun getSearchTvShowByName(name: String): Flow<Resource<List<CatalogueModel>>> =
        object :
            NetworkBoundResource<List<CatalogueModel>, List<TvShowResultResponse>>(appExecutors) {
            override fun loadFromDB(): Flow<List<CatalogueModel>> {
                return localDataSource.getSearchTvShow(name)
                    .map { DataMapper.mapTvShowEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<CatalogueModel>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<TvShowResultResponse>>> =
                remoteDataSource.getSearchTvShow(name)

            override suspend fun saveCallResult(data: List<TvShowResultResponse>) {
                val tvShowList = DataMapper.mapSearchTvShowResponsesToEntities(data)
                localDataSource.insertTvShow(tvShowList)
            }
        }.asFlow()

    override fun getSimilarMovieById(id: String): Flow<Resource<List<CatalogueModel>>> {
        return object : RemoteResource<List<CatalogueModel>, List<MovieResultResponse>>() {
            override fun createCall(): Flow<ApiResponse<List<MovieResultResponse>>> {
                return remoteDataSource.getSimilarMovie(id)
            }

            override fun convertCallResult(data: List<MovieResultResponse>): Flow<List<CatalogueModel>> {
                val result = data.map {
                    DataMapper.mapMovieResponseToDomain(it)
                }
                return flow { emit(result) }
            }

            override fun emptyResult(): Flow<List<CatalogueModel>> {
                return flow { emit(emptyList<CatalogueModel>()) }
            }

        }.asFlow()
    }

    override fun getSimilarTvShowById(id: String): Flow<Resource<List<CatalogueModel>>> {
        return object : RemoteResource<List<CatalogueModel>, List<TvShowResultResponse>>() {
            override fun createCall(): Flow<ApiResponse<List<TvShowResultResponse>>> {
                return remoteDataSource.getSimilarTvShow(id)
            }

            override fun convertCallResult(data: List<TvShowResultResponse>): Flow<List<CatalogueModel>> {
                val result = data.map {
                    DataMapper.mapTvShowResponseToDomain(it)
                }
                return flow { emit(result) }
            }

            override fun emptyResult(): Flow<List<CatalogueModel>> {
                return flow { emit(emptyList<CatalogueModel>()) }
            }

        }.asFlow()
    }
}