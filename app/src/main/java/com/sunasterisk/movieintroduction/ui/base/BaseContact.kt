package com.sunasterisk.movieintroduction.ui.base

import androidx.annotation.StringRes

interface BaseContact {
    interface View {
        fun showMessage(message: String)

        fun showMessage(@StringRes resId: Int)
    }

    interface Presenter<V : View> {
        fun onAttach(view: V)

        fun onDetach()

        fun handleApiError(throwable: Throwable?)
    }
}
