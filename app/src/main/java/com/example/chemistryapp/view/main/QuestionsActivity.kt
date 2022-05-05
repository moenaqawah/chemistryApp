package com.example.chemistryapp.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.chemistryapp.R
import org.w3c.dom.Text

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val firstQLearnMore = findViewById<TextView>(R.id.learn_why_1)
        val secondQLearnMore = findViewById<TextView>(R.id.learn_why_2)

        firstQLearnMore.setOnClickListener {
            AnswerDetailsDialogFragment("Lithium is the lightest metal on earth because it is placed in the first group of the periodic (in alkali metal group) and it has the lowest atomic weight.").show(supportFragmentManager,AnswerDetailsDialogFragment.TAG)
        }

        secondQLearnMore.setOnClickListener {
            AnswerDetailsDialogFragment("The reason behind this compounds abundance is that Silicon Dioxide is a compound of the two most abundant elements in the Earth's crust, silicon and oxygen, SiO2.+ The reason why silicon is the most common element within the rocky planets, is because it was the most common element (next to hydrogen) in the original nebula that condescend to form the solar system.").show(supportFragmentManager,AnswerDetailsDialogFragment.TAG)
        }
    }
}