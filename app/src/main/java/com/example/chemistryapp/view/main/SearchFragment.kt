package com.example.chemistryapp.view.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.chemistryapp.R

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_search, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTextSerach = view.findViewById<EditText>(R.id.search_bar)

        val searchButton = view.findViewById<ImageView>(R.id.search_button)

        searchButton.setOnClickListener {
            val word = editTextSerach.text.toString()
            when (word) {
                "Ca" -> {
                    val intent = Intent(activity, CompoundDetailsActivity::class.java)
                    val searchHistory = view.findViewById<FrameLayout>(R.id.search_history_ca)
                    searchHistory.visibility = View.VISIBLE
                }
                "NaHCO3" -> {
                    val intent = Intent(activity, CompoundDetailsActivity::class.java)
                    val searchHistory = view.findViewById<FrameLayout>(R.id.search_history_nahco3)
                    searchHistory.visibility = View.VISIBLE
                    startActivity(intent)
                }

            }
        }

        val historyNahco = view.findViewById<TextView>(R.id.nahco3_button)
        historyNahco.setOnClickListener {
            val intent = Intent(activity, CompoundDetailsActivity::class.java)
            startActivity(intent)
        }

        val cancelHistory = view.findViewById<ImageView>(R.id.cancel)

        cancelHistory.setOnClickListener {
            val searchHistory = view.findViewById<FrameLayout>(R.id.search_history_nahco3)
            searchHistory.visibility = View.GONE
        }
    }
}