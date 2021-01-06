package com.codeart.filmskuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeart.filmskuy.core.ui.MyPagerAdapter
import com.codeart.filmskuy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpagerMain.adapter = MyPagerAdapter(this, supportFragmentManager)
        binding.tabsMain.setupWithViewPager(binding.viewpagerMain)
    }
}