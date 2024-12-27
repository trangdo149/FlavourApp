package com.example.flavourapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class start : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tìm nút "Tạo tài khoản" và "Đăng nhập" bằng ID
        val dkButton = findViewById<AppCompatButton>(R.id.dkbutton)
        val signinButton = findViewById<AppCompatButton>(R.id.signinbutton)

        // Sự kiện cho nút "Tạo tài khoản"
        dkButton.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        // Sự kiện cho nút "Đăng nhập"
        signinButton.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
    }
}