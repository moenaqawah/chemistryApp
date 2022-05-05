package com.example.chemistryapp.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.chemistryapp.R
import com.example.chemistryapp.view.splash.FirstSplashFragment
import com.example.chemistryapp.view.splash.SecondSplashFragment
import com.example.chemistryapp.view.splash.thirdSplashFragment
import com.example.chemistryapp.view.utils.ZoomOutPageTransformer
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator



private const val NUM_PAGES = 3

class LessonDetailsActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_details)

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager)
        viewPager.isUserInputEnabled = false
        val tabLayout = findViewById<View>(R.id.tab_layout) as TabLayout


        // The pager adapter, which provides the pages to the view pager widget.
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if(position == 0) {
                tab.text = "Information"
            } else if(position == 1) {
                tab.text = "Videos"
            } else if(position == 2) {
                tab.text = "Websites"
            }
        }.attach()

    }


    /**
     * A simple pager adapter that represents 2 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> return lessonInformationFragment()
                1 -> return LessonVideosFragment()
                2 -> return LessonWebsiteFragment()
            }
            return lessonInformationFragment()
        }
    }
}