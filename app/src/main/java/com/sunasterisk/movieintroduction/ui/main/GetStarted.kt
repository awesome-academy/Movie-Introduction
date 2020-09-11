package com.sunasterisk.movieintroduction.ui.main

import android.view.animation.AnimationUtils
import com.sunasterisk.movieintroduction.R
import com.sunasterisk.movieintroduction.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStarted : BaseActivity() {
    override val layoutResource: Int = R.layout.activity_get_started

    override fun initComponent() {
        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
        buttonGetStarted.startAnimation(anim)
        buttonGetStarted.setOnClickListener {
            startActivity(MainActivity.getIntent(this))
            finish()
        }
    }
}
