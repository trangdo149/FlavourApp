package com.example.flavourapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.R
import com.example.flavourapp.Recipe
import com.example.flavourapp.Recipe3
import com.example.flavourapp.RecipeAdapter
import com.example.flavourapp.RecipeImage
import com.example.flavourapp.ViewRecipe2Adapter
import com.example.flavourapp.ViewRecipe3Adapter
import com.example.flavourapp.databinding.ActivityMainBinding // Import lớp binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // Khai báo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout với View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup RecyclerView for Explore Recipes
        binding.recipeRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recipeRecyclerView.adapter = ViewRecipe2Adapter(getExploreRecipes())

        // Setup RecyclerView for Search Recipes
        binding.searchRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.searchRecyclerView.adapter = RecipeAdapter(getSearchRecipes())

        // Setup RecyclerView for Suggested Recipes
        binding.suggestRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.suggestRecyclerView.adapter = ViewRecipe3Adapter(getSuggestedRecipes())
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