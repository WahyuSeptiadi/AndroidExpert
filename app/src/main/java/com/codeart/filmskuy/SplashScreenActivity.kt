package com.codeart.filmskuy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.codeart.filmskuy.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val slideInRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right)
        slideInRight.duration = 3000
        binding.nameApps.animation = slideInRight

        val slideInLeft = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        slideInLeft.duration = 3000
        binding.lottieApps.animation = slideInLeft

        val handler = Handler(mainLooper)
        handler.postDelayed({
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3500)
    }
}