package com.sunasterisk.movieintroduction.data.remote

import com.sunasterisk.movieintroduction.BuildConfig
import com.sunasterisk.movieintroduction.data.model.Genres
import com.sunasterisk.movieintroduction.data.model.Movie
import com.sunasterisk.movieintroduction.data.source.MovieDataSource

class MovieRepository private constructor(
    private var remoteGenre: MovieDataSource.Remote
) : MovieDataSource.Remote {
    override fun getAllGenres(): List<Genres> {
        TODO("Not yet implemented")
    }

    override fun getAllMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    companion object {
        private var INSTANCE: MovieRepository? = null
        fun getInstance(remoteDataSource: MovieDataSource.Remote) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: MovieRepository(remoteDataSource)
            }.also { INSTANCE = it }
    }
}
