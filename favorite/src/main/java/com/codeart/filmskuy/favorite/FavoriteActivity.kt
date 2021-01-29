package com.codeart.filmskuy.favorite

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.codeart.filmskuy.favorite.databinding.ActivityFavoriteBinding
import com.codeart.filmskuy.favorite.movie.MovieFavoriteFragment
import com.codeart.filmskuy.favorite.tvshow.TvShowFavoriteFragment

class FavoriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpagerFavorite.adapter = MyFavoritePagerAdapter(this, supportFragmentManager)
        binding.tabsFavorite.setupWithViewPager(binding.viewpagerFavorite)

        binding.btnBackFavorite.setOnClickListener {
            onBackPressed()
        }
    }
}

class MyFavoritePagerAdapter(private val context: Context, fm: FragmentManager) :

    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val pages = listOf(
        MovieFavoriteFragment(),
        TvShowFavoriteFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> context.getString(com.codeart.filmskuy.R.string.movie)
            else -> context.getString(com.codeart.filmskuy.R.string.tv_show)
        }
    }
}