package com.example.chemistryapp.view.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.chemistryapp.R
import com.google.android.material.appbar.MaterialToolbar

class LawsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_laws, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstLaw = activity?.findViewById<CardView>(R.id.first_law)

        firstLaw?.setOnClickListener {
            val intent = Intent(activity,LawDetailsFragment::class.java)
            startActivity(intent)
        }
    }
}