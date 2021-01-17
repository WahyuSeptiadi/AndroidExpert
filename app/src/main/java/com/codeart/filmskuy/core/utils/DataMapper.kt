package com.codeart.filmskuy.core.utils

import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.domain.model.CatalogueModel

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResultResponse>): List<MovieEntity> {
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

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<CatalogueModel> =
        input.map {
            CatalogueModel(
                id = it.id,
                posterPath = it.posterPath,
                title = it.title,
                overview = it.overview,
                voteAverage = it.voteAverage,
                releaseDate = it.releaseDate
            )
        }
}