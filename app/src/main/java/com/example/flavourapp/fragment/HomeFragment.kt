package com.example.flavourapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.Notification
import com.example.flavourapp.R
import com.example.flavourapp.Recipe
import com.example.flavourapp.Recipe3
import com.example.flavourapp.RecipeAdapter
import com.example.flavourapp.RecipeImage
import com.example.flavourapp.ViewRecipe2Adapter
import com.example.flavourapp.ViewRecipe3Adapter
import com.example.flavourapp.activity.RecipeActivity
import com.example.flavourapp.activity.AllDishesActivity  // Thêm import cho Activity mới
import com.example.flavourapp.databinding.FragmentHomeBinding
import com.example.flavourapp.dish.DishRepository

class HomeFragment : Fragment() {

    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupRecyclerViews()
        setupClickListeners()  // Thiết lập các sự kiện click
        return binding.root
    }

    private fun setupRecyclerViews() {
        // Setup RecyclerView for Explore Recipes
        binding.recipeRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recipeRecyclerView.adapter = ViewRecipe2Adapter(getExploreRecipes())

        // Setup RecyclerView for Search Recipes
        binding.searchRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.searchRecyclerView.adapter = RecipeAdapter(getSearchRecipes()) { recipe ->
            onDishClicked(recipe.name)
        }

        // Setup RecyclerView for Suggested Recipes
        binding.suggestRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.suggestRecyclerView.adapter = ViewRecipe3Adapter(getSuggestedRecipes()) { recipe ->
            onDishClicked(recipe.name3)
        }
    }

    private fun setupClickListeners() {
        // Xử lý sự kiện click "Xem thêm" cho các mục tìm kiếm và đề xuất
        binding.seeMoreSearch.setOnClickListener {
            val intent = Intent(requireContext(), AllDishesActivity::class.java)
            startActivity(intent)
        }

        binding.seeMoreSuggest.setOnClickListener {
            val intent = Intent(requireContext(), AllDishesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getExploreRecipes(): List<RecipeImage> {
        return listOf(
            RecipeImage(R.drawable.card1),
        )
    }

    private fun getSearchRecipes(): List<Recipe> {
        return listOf(
            Recipe("Phở gà", "10 Min", "200 Kcal", R.drawable.dish_image_6),
            Recipe("Rau quả trộn sốt", "15 Min", "180 Kcal", R.drawable.dish_image_4),
            Recipe("Bún thang", "15 Min", "180 Kcal", R.drawable.dish_image_3)
        )
    }

    private fun getSuggestedRecipes(): List<Recipe3> {
        return listOf(
            Recipe3("Gà xào nấm", "20 Min", "120 Kcal", R.drawable.dish_image_20, "Món xào"),
            Recipe3("Gỏi cuốn", "20 Min", "120 Kcal", R.drawable.dish_image_11, "Món cuốn"),
            Recipe3("Rau quả trộn sốt", "15 Min", "150 Kcal", R.drawable.dish_image_4, "Món trộn")
        )
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
