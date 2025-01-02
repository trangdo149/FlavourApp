package com.example.flavourapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flavourapp.Notification
import com.example.flavourapp.databinding.FragmentCommunityBinding

class CommunityFragment : Fragment() {
    private  val binding by lazy { FragmentCommunityBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initView()
        return binding.root
    }

    private fun initView() {
        binding.notiIcon.setOnClickListener {
            val intent = Intent(requireContext(), Notification::class.java)
            startActivity(intent)
        }

    }
}