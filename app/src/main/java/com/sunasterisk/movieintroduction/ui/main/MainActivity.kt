package com.sunasterisk.movieintroduction.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sunasterisk.movieintroduction.R
import com.sunasterisk.movieintroduction.ui.base.BaseActivity
import com.sunasterisk.movieintroduction.ui.genres.GenresFragment
import com.sunasterisk.movieintroduction.util.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override val layoutResource: Int = R.layout.activity_main

    override fun initComponent() {
        bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean =
        when (p0.itemId) {
            R.id.itemHome -> {
                replaceFragment(GenresFragment(),R.id.frameContainer)
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
