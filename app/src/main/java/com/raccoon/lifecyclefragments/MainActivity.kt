package com.raccoon.lifecyclefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    private var mPager: ViewPager? = null
    private lateinit var mAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPager = findViewById<View>(R.id.view_pager) as ViewPager
        mAdapter = PagerAdapter(this@MainActivity, supportFragmentManager)
        mPager!!.adapter = mAdapter

        mPager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {

            }
        })

    }


}