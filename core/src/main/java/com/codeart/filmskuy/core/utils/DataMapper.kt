package com.codeart.filmskuy.core.utils

import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse
import com.codeart.filmskuy.core.domain.model.CatalogueModel

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

object DataMapper {
    fun mapMovieResponsesToEntities(input: List<MovieResultResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                popular = true,
                isFavorite = false,
                idSimilar = "null",
                id = it.id,
                overview = it.overview,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                title = it.title,
                voteAverage = it.voteAverage
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapMovieEntitiesToDomain(input: List<MovieEntity>): List<CatalogueModel> =
        input.map {
            CatalogueModel(
                popular = it.popular,
                isFavorite = it.isFavorite,
                idSimilar = it.idSimilar,
                id = it.id,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                entry = it.title,
                overview = it.overview,
                voteAverage = it.voteAverage,
                date = it.releaseDate
            )
        }

    fun mapTvShowResponsesToEntities(input: List<TvShowResultResponse>): List<TvShowEntity> {
        val tvShowList = ArrayList<TvShowEntity>()
        input.map {
            val tvShow = TvShowEntity(
                popular = true,
                isFavorite = false,
                id = it.id,
                overview = it.overview,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                firstAirDate = it.firstAirDate,
                name = it.name,
                voteAverage = it.voteAverage
            )
            tvShowList.add(tvShow)
        }
        return tvShowList
    }

    fun mapTvShowEntitiesToDomain(input: List<TvShowEntity>): List<CatalogueModel> =
        input.map {
            CatalogueModel(
                popular = it.popular,
                isFavorite = it.isFavorite,
                id = it.id,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                entry = it.name,
                overview = it.overview,
                voteAverage = it.voteAverage,
                date = it.firstAirDate
            )
        }

    fun mapMovieDomainToEntity(input: CatalogueModel) = MovieEntity(
        popular = input.popular,
        isFavorite = input.isFavorite,
        idSimilar = input.idSimilar,
        id = input.id,
        overview = input.overview.toString(),
        backdropPath = input.backdropPath,
        posterPath = input.posterPath,
        releaseDate = input.date,
        title = input.entry.toString(),
        voteAverage = input.voteAverage
    )

    fun mapTvShowDomainToEntity(input: CatalogueModel) = TvShowEntity(
        popular = input.popular,
        isFavorite = input.isFavorite,
        id = input.id,
        overview = input.overview.toString(),
        backdropPath = input.backdropPath,
        posterPath = input.posterPath,
        firstAirDate = input.date,
        name = input.entry.toString(),
        voteAverage = input.voteAverage
    )

    fun mapSearchMovieResponsesToEntities(input: List<MovieResultResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                popular = false,
                isFavorite = false,
                idSimilar = "null",
                id = it.id,
                overview = it.overview,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                title = it.title,
                voteAverage = it.voteAverage
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapSearchTvShowResponsesToEntities(input: List<TvShowResultResponse>): List<TvShowEntity> {
        val tvShowList = ArrayList<TvShowEntity>()
        input.map {
            val tvShow = TvShowEntity(
                popular = false,
                isFavorite = false,
                id = it.id,
                overview = it.overview,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                firstAirDate = it.firstAirDate,
                name = it.name,
                voteAverage = it.voteAverage
            )
            tvShowList.add(tvShow)
        }
        return tvShowList
    }

    fun mapSimilarMovieResponsesToEntities(
        idSelected: String,
        input: List<MovieResultResponse>
    ): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                popular = false,
                isFavorite = false,
                idSimilar = idSelected,
                id = it.id,
                overview = it.overview,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                title = it.title,
                voteAverage = it.voteAverage
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapTvShowResponseToDomain(input: TvShowResultResponse) = CatalogueModel(
        popular = false,
        isFavorite = false,
        id = input.id,
        overview = input.overview,
        backdropPath = input.backdropPath,
        date = input.firstAirDate,
        posterPath = input.posterPath,
        entry = input.name,
        voteAverage = input.voteAverage,
    )
}