package com.example.chemistryapp.view.main

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.chemistryapp.R
import com.google.android.material.appbar.MaterialToolbar

class ElementDetailsActivity : AppCompatActivity() {

    companion object{
        fun startActivity(activity: Activity,mainText: String,cardText: String) {
            val intent = Intent(activity,ElementDetailsActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element_details)


        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)

         setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }
}