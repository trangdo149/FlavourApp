package com.example.flavourapp.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.R
import com.example.flavourapp.base.BaseActivity
import com.example.flavourapp.databinding.ActivityRecipeDetailBinding
import com.example.flavourapp.databinding.ActivitySearch2Binding
import com.example.flavourapp.dish.DishAdapter
import com.example.flavourapp.dish.DishCategory
import com.example.flavourapp.dish.DishRepository

class Search2 : BaseActivity() {
    private lateinit var binding: ActivitySearch2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearch2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val categoryName = intent.getStringExtra("CATEGORY_NAME")
        val category = if (categoryName != null) DishCategory.valueOf(categoryName) else null
        val dishes = when (category) {
            DishCategory.MON_TRON -> DishRepository().getDishesByCategory(DishCategory.MON_TRON)
            DishCategory.MON_NUOC -> DishRepository().getDishesByCategory(DishCategory.MON_NUOC)
            DishCategory.MON_XAO -> DishRepository().getDishesByCategory(DishCategory.MON_XAO)
            DishCategory.MON_CUON -> DishRepository().getDishesByCategory(DishCategory.MON_CUON)
            else -> emptyList()
        }

        binding.rvDanhmuc.layoutManager = GridLayoutManager(this, 2)
        val adapter = DishAdapter(this, dishes)
        binding.rvDanhmuc.adapter = adapter

        binding.iconBack.setOnClickListener { finish() }
    }

}