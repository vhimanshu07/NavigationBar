package com.example.navigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    private lateinit var  drawlay:DrawerLayout
    private lateinit var  mtoggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.nav_action))


        // for the back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        drawlay = findViewById(R.id.drawer)
        mtoggle= ActionBarDrawerToggle(this,drawlay,R.string.open,R.string.close)
        drawlay.addDrawerListener(mtoggle)
        mtoggle.syncState()





    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(mtoggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}