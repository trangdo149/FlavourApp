package com.example.flavourapp

import android.content.Intent
import android.os.Bundle
import com.example.flavourapp.Authentication.Authentication
import com.example.flavourapp.databinding.ActivitySigninBinding

class Signin : Authentication() {

    private lateinit var binding: ActivitySigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewdk.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        // Xử lý sự kiện nhấn vào nút đăng nhập
        binding.dkbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.google.setOnClickListener {
            signIn() // Sử dụng phương thức từ class cha
        }
    }
}
