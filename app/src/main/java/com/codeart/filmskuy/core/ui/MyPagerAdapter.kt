package com.codeart.filmskuy.core.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.codeart.filmskuy.R
import com.codeart.filmskuy.movie.MovieFragment
import com.codeart.filmskuy.tvshow.TvShowFragment

/**
 * Created by wahyu_septiadi on 06, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class MyPagerAdapter(private val context: Context, fm: FragmentManager) :

    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val pages = listOf(
        MovieFragment(),
        TvShowFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.getString(R.string.movie)
            else -> context.getString(R.string.tv_show)
        }
    }
}