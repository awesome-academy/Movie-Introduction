package com.sunasterisk.movieintroduction.data.model

data class Movie(
    val id: Int,
    val title: String,
    val releaseDate: String,
    val voteCount: Int?,
    val voteAverage: Int?,
    val backdropPath: String?,
    val posterPath: String?,
    val idGenres: List<Int>,
    val overview: String?,
    val videoPath: String?,
    val cast: List<Int>,
    val crew: List<Int>,
    val similarMovie: List<Int>
)
