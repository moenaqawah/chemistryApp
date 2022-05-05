package com.example.chemistryapp.view.splash

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.chemistryapp.R
import com.example.chemistryapp.view.main.MainActivity

class thirdSplashFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_splash_third, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nextButton = view.findViewById<ImageButton>(R.id.next_button)

        nextButton.setOnClickListener {
            val intent = Intent(activity,MainActivity::class.java)
           activity?.startActivity(intent)
        }

    }
}