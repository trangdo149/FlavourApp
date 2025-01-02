package com.example.flavourapp.fragment


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.flavourapp.EditProfileActivity
import com.example.flavourapp.R
import com.example.flavourapp.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {
    private  val binding by lazy { FragmentProfileBinding .inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initview()
        return binding.root
    }

    private fun initview() {
        binding.editProfileButton.setOnClickListener {
            val intent = Intent(requireContext(), EditProfileActivity::class.java)
            startActivity(intent)
        }

        val user = FirebaseAuth.getInstance().currentUser
        user?.let {

            val userName = it.displayName
            binding.userName.text = userName ?: "No name"

            val photoUrl = it.photoUrl
            photoUrl?.let { url ->
                Glide.with(this)
                    .load(url)
                    .into(binding.profileImage)
            } ?: run {
                binding.profileImage.setImageResource(R.drawable.avatar2)
            }
        }

    }

}