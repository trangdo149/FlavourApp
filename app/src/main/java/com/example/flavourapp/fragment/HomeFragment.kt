package com.example.flavourapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.Notification
import com.example.flavourapp.R
import com.example.flavourapp.Recipe
import com.example.flavourapp.Recipe3
import com.example.flavourapp.RecipeAdapter
import com.example.flavourapp.RecipeDetailActivity
import com.example.flavourapp.RecipeImage
import com.example.flavourapp.ViewRecipe2Adapter
import com.example.flavourapp.ViewRecipe3Adapter
import com.example.flavourapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupRecyclerViews()
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
        binding.searchRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.searchRecyclerView.adapter = RecipeAdapter(getSearchRecipes()) {

            val intent = Intent(requireContext(), RecipeDetailActivity::class.java)
            startActivity(intent)
        }


        // Setup RecyclerView for Suggested Recipes
        binding.suggestRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.suggestRecyclerView.adapter = ViewRecipe3Adapter(getSuggestedRecipes()){
            val intent = Intent(requireContext(), RecipeDetailActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getExploreRecipes(): List<RecipeImage> {
        return listOf(
            RecipeImage(R.drawable.card1),
            RecipeImage(R.drawable.card1)
        )
    }

    private fun getSearchRecipes(): List<Recipe> {
        return listOf(
            Recipe("Bánh mì nướng", "10 Min", "200 Kcal", R.drawable.image_recipe_detail),
            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail),
            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail)
        )
    }

    private fun getSuggestedRecipes(): List<Recipe3> {
        return listOf(
            Recipe3("Xốt Hummus", "20 Min", "120 Kcal", R.drawable.image_recipe_detail, "Beans fruits"),
            Recipe3("Xốt Hummus", "20 Min", "120 Kcal", R.drawable.image_recipe_detail, "Beans fruits"),
            Recipe3("Keto Salad", "15 Min", "150 Kcal", R.drawable.image_recipe_detail, "Fresh greens")
        )
    }
}