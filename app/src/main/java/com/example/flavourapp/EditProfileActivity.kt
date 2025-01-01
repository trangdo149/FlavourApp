package com.example.flavourapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.flavourapp.databinding.ActivityEditProfileBinding // Import lớp binding

class EditProfileActivity : ComponentActivity() {
    private lateinit var binding: ActivityEditProfileBinding // Khai báo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout với View Binding
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sử dụng binding để gắn sự kiện
        binding.backButton.setOnClickListener {
            finish() // Quay lại màn hình trước
        }
    }
}