package com.sunasterisk.movieintroduction.ui.genres

import com.sunasterisk.movieintroduction.data.model.Genres
import com.sunasterisk.movieintroduction.ui.base.BaseContact

interface GenresContact {

    interface View : BaseContact.View {

        fun updateRecyclerView(listGenres: List<Genres>)
    }

    interface Presenter : BaseContact.Presenter<View> {

        fun loadScreen()

        fun onItemClick()
    }
}
