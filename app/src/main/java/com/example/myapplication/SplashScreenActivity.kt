package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val splashscreen:ImageView=findViewById(R.id.splashscreen)
        splashscreen.alpha=0f
        splashscreen.animate().setDuration(6000).alpha(1f).withEndAction{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_out, com.google.android.material.R.anim.abc_shrink_fade_out_from_bottom)
            finish()
        }

    }
}