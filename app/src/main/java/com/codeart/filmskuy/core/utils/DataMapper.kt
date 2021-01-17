package com.codeart.filmskuy.core.utils

import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse
import com.codeart.filmskuy.core.domain.model.MovieModel
import com.codeart.filmskuy.core.domain.model.TvShowModel

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

object DataMapper {
    fun mapMovieResponsesToEntities(input: List<MovieResultResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                popular = null,
                favorite = false,
                id = it.id,
                overview = it.overview,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                title = it.title,
                voteAverage = it.voteAverage
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapMovieEntitiesToDomain(input: List<MovieEntity>): List<MovieModel> =
        input.map {
            MovieModel(
                id = it.id,
                posterPath = it.posterPath,
                title = it.title,
                overview = it.overview,
                voteAverage = it.voteAverage,
                releaseDate = it.releaseDate
            )
        }

    fun mapTvShowResponsesToEntities(input: List<TvShowResultResponse>): List<TvShowEntity> {
        val tvShowList = ArrayList<TvShowEntity>()
        input.map {
            val tvShow = TvShowEntity(
                popular = null,
                favorite = false,
                id = it.id,
                overview = it.overview,
                posterPath = it.posterPath,
                firstAirDate = it.firstAirDate,
                name = it.name,
                voteAverage = it.voteAverage
            )
            tvShowList.add(tvShow)
        }
        return tvShowList
    }

    fun mapTvShowEntitiesToDomain(input: List<TvShowEntity>): List<TvShowModel> =
        input.map {
            TvShowModel(
                id = it.id,
                posterPath = it.posterPath,
                name = it.name,
                overview = it.overview,
                voteAverage = it.voteAverage,
                firstAirDate = it.firstAirDate
            )
        }
}