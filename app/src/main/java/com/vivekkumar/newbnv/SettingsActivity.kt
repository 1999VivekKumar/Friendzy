package com.vivekkumar.newbnv

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val profileBtn = findViewById<RelativeLayout>(R.id.profile_Btn)
        profileBtn.setOnClickListener {
            startActivity(Intent(this@SettingsActivity , EditProfileActivity::class.java))
        }

    }
}