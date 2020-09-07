package com.sunasterisk.movieintroduction.data.source

import com.sunasterisk.movieintroduction.data.model.Genres
import com.sunasterisk.movieintroduction.data.model.Movie

interface MovieDataSource {
    interface Remote {
        fun getAllGenres(): List<Genres>
        fun getAllMovies(): List<Movie>
    }
    interface View{}
}
