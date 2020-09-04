package com.sunasterisk.movieintroduction.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sunasterisk.movieintroduction.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        fun getIntent (context: Context) = Intent(context, MainActivity::class.java)
    }

}
