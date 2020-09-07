package com.sunasterisk.movieintroduction.ui.main

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.sunasterisk.movieintroduction.R
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStarted : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
        buttonGetStarted.startAnimation(anim)

        buttonGetStarted.setOnClickListener {
            startActivity(MainActivity.getIntent(this))
            finish()
        }
    }

}
