package com.codeart.filmskuy.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeart.filmskuy.R
import com.codeart.filmskuy.core.ui.MyPagerAdapter
import com.codeart.filmskuy.databinding.ActivityFavoriteBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // tabLayout sementara -> dibuat dynamic feature
        binding.viewpagerFavorite.adapter = MyPagerAdapter(this, supportFragmentManager)
        binding.tabsFavorite.setupWithViewPager(binding.viewpagerFavorite)

        binding.btnBackFavorite.setOnClickListener {
            onBackPressed()
        }
    }
}