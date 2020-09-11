package com.sunasterisk.movieintroduction.ui.genres

import android.view.LayoutInflater
import android.view.ViewGroup
import com.sunasterisk.movieintroduction.R
import com.sunasterisk.movieintroduction.data.model.Genres
import com.sunasterisk.movieintroduction.ui.base.BaseRecyclerAdapter

class GenresAdapter : BaseRecyclerAdapter<Genres, GenresViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenresViewHolder =
        GenresViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_genres, parent, false)
        )
}
