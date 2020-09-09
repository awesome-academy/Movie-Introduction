package com.sunasterisk.movieintroduction.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sunasterisk.movieintroduction.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean =
        when (p0.itemId) {
            R.id.itemHome -> {
                true
            }
            R.id.itemToprate -> {
                true
            }
            R.id.itemNowplay -> {
                true
            }
            R.id.itemUpcomming -> {
                true
            }
            R.id.itemMyfavorite -> {
                true
            }
            else -> false
        }

    companion object {
        fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}
