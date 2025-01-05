package com.example.flavourapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class EditProfileActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        // Cài đặt các thao tác cho các thành phần
        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Quay lại màn hình trước
        }


    }
}
