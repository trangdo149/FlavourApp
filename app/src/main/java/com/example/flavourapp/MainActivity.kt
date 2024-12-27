package com.example.flavourapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView for Explore Recipes (Hiển thị theo chiều ngang)
        val exploreRecyclerView = findViewById<RecyclerView>(R.id.recipeRecyclerView)
        exploreRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        exploreRecyclerView.adapter = ViewRecipe2Adapter(getExploreRecipes())  // Fix adapter

        // Setup RecyclerView for Search Recipes (Hiển thị theo chiều ngang)
        val searchRecyclerView = findViewById<RecyclerView>(R.id.searchRecyclerView)
        searchRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        searchRecyclerView.adapter = RecipeAdapter(getSearchRecipes())

        // Setup RecyclerView for Suggested Recipes (Hiển thị theo chiều ngang)
        val suggestRecyclerView = findViewById<RecyclerView>(R.id.suggestRecyclerView)
        suggestRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        suggestRecyclerView.adapter = ViewRecipe3Adapter(getSuggestedRecipes())

    }

    // Define the RecipeImage data class
    private fun getExploreRecipes(): List<RecipeImage> {
        return listOf(
            RecipeImage(R.drawable.card1),  // Example image
            RecipeImage(R.drawable.card1)   // Example image
        )
    }

    // Define the Recipe data class
    private fun getSearchRecipes(): List<Recipe> {
        return listOf(
            Recipe("Bánh mì nướng", "10 Min", "200 Kcal", R.drawable.image_recipe_detail),
            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail),
            Recipe("Salad rau củ", "15 Min", "180 Kcal", R.drawable.image_recipe_detail)
        )
    }

    // Define the Recipe3 data class
    private fun getSuggestedRecipes(): List<Recipe3> {
        return listOf(
            Recipe3("Xốt Hummus", "20 Min", "120 Kcal", R.drawable.image_recipe_detail, "Beans fruits"),
            Recipe3("Xốt Hummus", "20 Min", "120 Kcal", R.drawable.image_recipe_detail, "Beans fruits"),
            Recipe3("Keto Salad", "15 Min", "150 Kcal", R.drawable.image_recipe_detail, "Fresh greens")
        )
    }
}
