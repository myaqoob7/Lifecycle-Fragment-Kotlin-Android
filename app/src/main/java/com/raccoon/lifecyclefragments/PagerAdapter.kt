package com.raccoon.lifecyclefragments

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = Fragment1()
            1 -> fragment = Fragment2()
            2 -> fragment = Fragment3()
            3 -> fragment = Fragment4()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        // Show 6 total pages.
        return 4
    }
}