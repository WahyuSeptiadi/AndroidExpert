package com.codeart.filmskuy

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.codeart.filmskuy.databinding.ActivityMainBinding
import com.codeart.filmskuy.movie.MovieFragment
import com.codeart.filmskuy.tvshow.TvShowFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpagerMain.adapter = MyPagerAdapter(this, supportFragmentManager)
        binding.tabsMain.setupWithViewPager(binding.viewpagerMain)

        binding.favorite.setOnClickListener {
            val uri = Uri.parse("filmskuy://favorite")
            startActivity(Intent(Intent.ACTION_VIEW, uri))
        }
    }

    override fun onBackPressed() {
        if (isTaskRoot) {
            finishAfterTransition()
        } else {
            super.onBackPressed()
        }
    }
}

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

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> context.getString(R.string.movie)
            else -> context.getString(R.string.tv_show)
        }
    }
}