package com.sunasterisk.movieintroduction.ui.genres

import android.view.View
import com.sunasterisk.movieintroduction.data.model.Genres
import com.sunasterisk.movieintroduction.ui.base.BaseViewHolder
import kotlinx.android.synthetic.main.item_genres.view.*

class GenresViewHolder(
    itemView: View
) : BaseViewHolder<Genres>(itemView) {

    override fun onBindData(genres: Genres) {
        super.onBindData(genres)
        with(itemView) {
            buttonItemGenres.text = genres.name
        }
    }
}
