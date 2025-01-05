package com.example.flavourapp.activity

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.IngredientAdapter
import com.example.flavourapp.R
import com.example.flavourapp.StepsAdapter
import com.example.flavourapp.databinding.ActivityRecipeBinding
import com.example.flavourapp.IngredientModel
import com.example.flavourapp.StepsModel
import com.example.flavourapp.base.BaseActivity

class RecipeActivity : BaseActivity() {
    private lateinit var binding: ActivityRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dishName = intent.getStringExtra("dishName")
        val dishDescription = intent.getStringExtra("dishDescription")
        val ingredients = intent.getParcelableArrayListExtra<IngredientModel>("ingredients")
        val steps = intent.getParcelableArrayListExtra<StepsModel>("steps")
        val dishImage = intent.getIntExtra("dishImage", 0)

        binding.textView.text = dishName
        binding.txtdescription.text = dishDescription
        binding.imageView.setImageResource(dishImage)

        if (!ingredients.isNullOrEmpty()) {
            val ingredientAdapter = IngredientAdapter(ingredients)
            binding.rvNguyenlieu.layoutManager = LinearLayoutManager(this)
            binding.rvNguyenlieu.adapter = ingredientAdapter
        }

        if (!steps.isNullOrEmpty()) {
            val stepsAdapter = StepsAdapter(steps)
            binding.rvCacbuoc.layoutManager = LinearLayoutManager(this)
            binding.rvCacbuoc.adapter = stepsAdapter
        }
        binding.txtCacBuoc.setTextColor(getColor(R.color.neutral_500))
        binding.lineCacbuoc.visibility = View.GONE
        binding.rvCacbuoc.visibility = View.GONE

        binding.btnCacbuoc.setOnClickListener {
            binding.txtNguyenLieu.setTextColor(getColor(R.color.neutral_500))
            binding.txtCacBuoc.setTextColor(getColor(R.color.green_950))
            binding.lineNguyenlieu.visibility = View.GONE
            binding.lineCacbuoc.visibility = View.VISIBLE
            binding.rvNguyenlieu.visibility = View.GONE
            binding.rvCacbuoc.visibility = View.VISIBLE
        }

        binding.btnNguyenlieu.setOnClickListener {
            binding.txtNguyenLieu.setTextColor(getColor(R.color.green_950))
            binding.txtCacBuoc.setTextColor(getColor(R.color.neutral_500))
            binding.lineCacbuoc.visibility = View.GONE
            binding.lineNguyenlieu.visibility = View.VISIBLE
            binding.rvCacbuoc.visibility = View.GONE
            binding.rvNguyenlieu.visibility = View.VISIBLE
        }

        binding.iconBack.setOnClickListener { finish() }
    }
}