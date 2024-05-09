package com.vivekkumar.newbnv

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vivekkumar.newbnv.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpBtn.setOnClickListener {
            startActivity(Intent(this@LoginActivity , SignUpActivity::class.java))
        }
        binding.loginCardViewBtn.setOnClickListener {
            startActivity(Intent(this@LoginActivity , MainActivity::class.java))
        }
    }
}