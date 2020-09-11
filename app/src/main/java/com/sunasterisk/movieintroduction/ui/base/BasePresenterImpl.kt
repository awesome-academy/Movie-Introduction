package com.sunasterisk.movieintroduction.ui.base

abstract class BasePresenterImpl<V : BaseContact.View> : BaseContact.Presenter<V> {
    private var view: V? = null

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }
}
