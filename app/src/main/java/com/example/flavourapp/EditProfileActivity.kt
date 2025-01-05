package com.example.flavourapp
import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.flavourapp.base.BaseActivity
import com.example.flavourapp.databinding.ActivityEditProfileBinding
import com.google.firebase.auth.FirebaseAuth

class EditProfileActivity : BaseActivity() {
    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }
        val user = FirebaseAuth.getInstance().currentUser
        user?.let {
            binding.userEmail.text = it.email

            val userName = it.displayName

            val photoUrl = it.photoUrl
            photoUrl?.let { url ->
                Glide.with(this)
                    .load(url)
                    .into(binding.userImage)
            } ?: run {
                binding.userImage.setImageResource(R.drawable.avatar2)
            }
        }

        binding.logoutBtn.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, start::class.java)
            startActivity(intent)
            finish()
        }
    }
}
