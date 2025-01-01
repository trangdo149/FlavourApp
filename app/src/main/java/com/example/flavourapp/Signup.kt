package com.example.flavourapp

import android.content.Intent
import android.os.Bundle
import com.example.flavourapp.Authentication.Authentication
import com.example.flavourapp.databinding.ActivitySignupBinding

class Signup : Authentication() {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewdn.setOnClickListener {
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }

        binding.dkbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.google.setOnClickListener {
            signIn() 
        }
    }
}
