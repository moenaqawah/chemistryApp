package com.example.chemistryapp.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.chemistryapp.R
import com.google.android.material.appbar.MaterialToolbar

import com.google.android.material.bottomnavigation.BottomNavigationView









class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        // as soon as the application opens the first
        // fragment should be shown to the user
        // in this case it is algorithm fragment

        // as soon as the application opens the first
        // fragment should be shown to the user
        // in this case it is algorithm fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, LessonsFragment()).commit()

    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item -> // By using switch we can easily get
            // the selected fragment
            // by using there id.
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_lessons-> selectedFragment = LessonsFragment()
                R.id.nav_laws -> selectedFragment = LawsFragment()
                R.id.nav_elements -> selectedFragment = ElementsFragment()
                R.id.nav_search -> selectedFragment = SearchFragment()
            }
            // It will help to replace the
            // one fragment to other.
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, selectedFragment!!)
                .commit()
            true
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.main_q_and_a -> {
                val intent = Intent(this,QuestionsActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}


