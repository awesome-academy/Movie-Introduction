package com.sunasterisk.movieintroduction.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.sunasterisk.movieintroduction.util.toast

abstract class BaseFragment<V : BaseContact.View, T : BasePresenterImpl<V>> :
    Fragment(), BaseContact.View {

    @get:LayoutRes
    protected abstract val layoutResource: Int

    abstract val presenter: T?

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(layoutResource, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter?.onAttach(this as V)
    }

    override fun onDestroyView() {
        presenter?.onDetach()
        super.onDestroyView()
    }

    override fun showMessage(msg: String) {
        context?.toast(msg)
    }

    override fun showMessage(resId: Int) {
        context?.toast(getString(resId))
    }
}
