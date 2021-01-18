package com.codeart.filmskuy.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/**
 * Created by wahyu_septiadi on 08, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Parcelize
class CatalogueModel(
    val popular: Boolean,
    val isFavorite: Boolean,
    val id: Int,
    val overview: String? = null,
    val posterPath: String? = null,
    val date: String? = null,
    val entry: String? = null,
    val voteAverage: Double
) : Parcelable