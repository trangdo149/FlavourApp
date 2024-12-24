package com.example.flavourapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView for Explore Recipes (Hiển thị theo chiều ngang)
        val exploreRecyclerView = findViewById<RecyclerView>(R.id.recipeRecyclerView)
        exploreRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        exploreRecyclerView.adapter = ViewRecipe2Adapter(getExploreRecipes())

        // Setup RecyclerView for Search Recipes (Hiển thị theo chiều ngang)
        val searchRecyclerView = findViewById<RecyclerView>(R.id.searchRecyclerView)
        searchRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        searchRecyclerView.adapter = RecipeAdapter(getSearchRecipes())

        // Setup RecyclerView for Suggested Recipes (Hiển thị theo chiều ngang)
        val suggestRecyclerView = findViewById<RecyclerView>(R.id.suggestRecyclerView)
        suggestRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        suggestRecyclerView.adapter = RecipeAdapter(getSuggestedRecipes())
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
            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail)
        )
    }

    private fun getSuggestedRecipes(): List<Recipe> {
        return listOf(
            Recipe("Cháo yến mạch", "30 Min", "250 Kcal", R.drawable.image_recipe_detail),
            Recipe("Gà nướng", "45 Min", "350 Kcal", R.drawable.image_recipe_detail)
        )
    }
}

