package com.codeart.filmskuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeart.filmskuy.core.ui.MyPagerAdapter
import com.codeart.filmskuy.databinding.ActivityMainBinding
import com.codeart.filmskuy.favorite.FavoriteActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpagerMain.adapter = MyPagerAdapter(this, supportFragmentManager)
        binding.tabsMain.setupWithViewPager(binding.viewpagerMain)

        binding.favorite.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }
    }
}