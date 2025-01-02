package com.example.flavourapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.flavourapp.R
import com.example.flavourapp.danhmuctimkiem.DanhMuc
import com.example.flavourapp.danhmuctimkiem.DanhMucAdapter
import com.example.flavourapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private  val binding by lazy { FragmentSearchBinding .inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initView()
        return binding.root
    }

    private fun initView() {
        binding.rvDanhmuc.layoutManager = GridLayoutManager(requireContext(), 2)
        val danhMucList = listOf(
            DanhMuc("Món cuốn", R.drawable.moncuon),
            DanhMuc("Món trộn", R.drawable.moncuon),
            DanhMuc("Món nước", R.drawable.moncuon),
            DanhMuc("Món xào", R.drawable.moncuon)
        )
        val adapter = DanhMucAdapter(requireContext(), danhMucList)
        binding.rvDanhmuc.adapter = adapter
    }


}