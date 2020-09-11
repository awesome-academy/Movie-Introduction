package com.sunasterisk.movieintroduction.ui.genres

import com.sunasterisk.movieintroduction.R
import com.sunasterisk.movieintroduction.ui.base.BaseFragment

class GenresFragment : BaseFragment<GenresContact.View, GenresPresenterIml>() {
    override val layoutResource = R.layout.fragment_genres
    override val presenter = GenresPresenterIml()
}
