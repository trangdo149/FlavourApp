package com.example.flavourapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.Notification
import com.example.flavourapp.Post_Communty.PostAdapter
import com.example.flavourapp.Post_Communty.PostViewModel
import com.example.flavourapp.databinding.FragmentCommunityBinding

class CommunityFragment : Fragment() {

    private var _binding: FragmentCommunityBinding? = null
    private val binding get() = _binding!!
    private lateinit var postAdapter: PostAdapter
    private lateinit var postViewModel: PostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommunityBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    private fun initView() {
        binding.notiIcon.setOnClickListener {
            val intent = Intent(requireContext(), Notification::class.java)
            startActivity(intent)
        }
        binding.recyclerViewPost.layoutManager = LinearLayoutManager(requireContext())
        postViewModel = ViewModelProvider(this).get(PostViewModel::class.java)

        postViewModel.posts.observe(viewLifecycleOwner) { posts ->
            postAdapter = PostAdapter(posts, requireContext())
            binding.recyclerViewPost.adapter = postAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
