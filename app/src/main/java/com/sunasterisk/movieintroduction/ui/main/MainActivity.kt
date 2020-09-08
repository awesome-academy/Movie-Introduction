package com.sunasterisk.movieintroduction.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ActionMenuView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sunasterisk.movieintroduction.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when (p0.itemId) {
            R.id.itemHome -> {
                return true
            }
            R.id.itemToprate -> {
                return true
            }
            R.id.itemNowplay -> {
                return true
            }
            R.id.itemUpcomming -> {
                return true
            }
            R.id.itemMyfavorite -> {
                return true
            }
        }
        return false
    }

}
