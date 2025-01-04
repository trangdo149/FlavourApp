package com.example.flavourapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.R
import com.example.flavourapp.adapter.SearchHistoryAdapter
import com.example.flavourapp.danhmuctimkiem.DanhMuc
import com.example.flavourapp.danhmuctimkiem.DanhMucAdapter
import com.example.flavourapp.databinding.FragmentSearchBinding
import com.example.flavourapp.dish.DishCategory

class SearchFragment : Fragment() {
    private val binding by lazy { FragmentSearchBinding.inflate(layoutInflater) }

    private val searchHistory = mutableListOf<String>()

    private val searchHistoryAdapter = SearchHistoryAdapter(searchHistory)

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
            DanhMuc("Món cuốn", R.drawable.moncuon, DishCategory.MON_CUON),
            DanhMuc("Món trộn", R.drawable.montron, DishCategory.MON_TRON),
            DanhMuc("Món nước", R.drawable.monnuoc, DishCategory.MON_NUOC),
            DanhMuc("Món xào", R.drawable.xao, DishCategory.MON_XAO)
        )
        val adapter = DanhMucAdapter(requireContext(), danhMucList)
        binding.rvDanhmuc.adapter = adapter

        binding.recyclerViewHis.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewHis.adapter = searchHistoryAdapter

        binding.editTextSearch.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val query = binding.editTextSearch.text.toString().trim()
                if (query.isNotEmpty()) {
                    searchHistory.add(query)
                    searchHistoryAdapter.notifyDataSetChanged()
                    binding.editTextSearch.text.clear()
                    Toast.makeText(requireContext(), "Đã lưu tìm kiếm: $query", Toast.LENGTH_SHORT).show()
                }
                true
            } else {
                false
            }
        }
    }
}
