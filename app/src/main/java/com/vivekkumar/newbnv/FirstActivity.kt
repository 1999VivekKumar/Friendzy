package com.vivekkumar.newbnv

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vivekkumar.newbnv.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.googleCardView.setOnClickListener {
            startActivity(Intent(this@FirstActivity , LoginActivity::class.java))
        }

        binding.signUpBTn.setOnClickListener {
            startActivity(Intent(this@FirstActivity , SignUpActivity::class.java))
        }
    }
}