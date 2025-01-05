package com.example.flavourapp.fragment

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.R
import com.example.flavourapp.activity.RecipeActivity
import com.example.flavourapp.adapter.SearchHistoryAdapter
import com.example.flavourapp.danhmuctimkiem.DanhMuc
import com.example.flavourapp.danhmuctimkiem.DanhMucAdapter
import com.example.flavourapp.databinding.FragmentSearchBinding
import com.example.flavourapp.dish.DishCategory
import com.example.flavourapp.dish.DishRepository

class SearchFragment : Fragment() {
    private val binding by lazy { FragmentSearchBinding.inflate(layoutInflater) }

    private val searchHistory = mutableListOf<String>()
    private lateinit var searchHistoryAdapter: SearchHistoryAdapter

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
        val danhMucAdapter = DanhMucAdapter(requireContext(), danhMucList)
        binding.rvDanhmuc.adapter = danhMucAdapter
        binding.recyclerViewHis.layoutManager = LinearLayoutManager(requireContext())
        searchHistoryAdapter = SearchHistoryAdapter(searchHistory) { dishName ->
            onDishClicked(dishName)
        }
        binding.recyclerViewHis.adapter = searchHistoryAdapter
        val dishRepository = DishRepository()
        binding.editTextSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString().trim()
                if (query.isNotEmpty()) {
                    val filteredDishes = dishRepository.getAllDishes()
                        .filter { it.dishName.startsWith(query, ignoreCase = true) }
                        .map { it.dishName }
                    searchHistory.addAll(filteredDishes)
                } else {
                    searchHistory.clear()
                }
                searchHistoryAdapter.notifyDataSetChanged()
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun onDishClicked(dishName: String) {
        val dishRepository = DishRepository()
        val selectedDish = dishRepository.getAllDishes().find { it.dishName == dishName }

        if (selectedDish != null) {
            val intent = Intent(context, RecipeActivity::class.java).apply {
                putExtra("dishName", selectedDish.dishName)
                putExtra("dishImage", selectedDish.dishImage)
                putExtra("dishDescription", selectedDish.dishDescription)
                putParcelableArrayListExtra("ingredients", ArrayList(selectedDish.ingredients))
                putParcelableArrayListExtra("steps", ArrayList(selectedDish.steps))
            }

            Toast.makeText(requireContext(), "Bạn đã chọn món: $dishName", Toast.LENGTH_SHORT).show()
            context?.startActivity(intent)
        } else {
            Toast.makeText(requireContext(), "Không tìm thấy thông tin món ăn!", Toast.LENGTH_SHORT).show()
        }
    }
}
