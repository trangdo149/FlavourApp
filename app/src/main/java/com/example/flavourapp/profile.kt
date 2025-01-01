package com.example.flavourapp

import EditProfileActivity
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class ProfileActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val textView = findViewById<TextView>(R.id.userName)
        textView.text = "Test User"

        // Set up the profile image
        val profileImageView = findViewById<ImageView>(R.id.profileImage)
        profileImageView.setImageResource(R.drawable.avatar)

        // Set up the user name and other text views
        val userNameTextView = findViewById<TextView>(R.id.userName)
        userNameTextView.text = "Nguyễn Văn X"

        val statusTextView = findViewById<TextView>(R.id.status)
        statusTextView.text = "Tôi ghét ăn tối bằng thức ăn đóng hộp"

        // Set up button

        val editProfileButton = findViewById<View>(R.id.editProfileButton)

        editProfileButton.setOnClickListener {
            try {
                val intent = Intent(this, EditProfileActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


        // Set up ChipGroup with specialties
        val chipGroup = findViewById<RecyclerView>(R.id.chipGroup)


        // Set up RecyclerView
        val recipeRecyclerView = findViewById<RecyclerView>(R.id.recipeRecyclerView)

        recipeRecyclerView.layoutManager = GridLayoutManager(this, 2)

        // Sample data for recipes
        val recipeList = listOf(
            Recipe("Xốt Hummus", "120 Kcal", "20 Min", "Elena Shelby", R.drawable.image_recipe_detail, R.drawable.avatar),
            Recipe("Panna Cotta", "150 Kcal", "30 Min", "John Doe", R.drawable.image_recipe_detail, R.drawable.avatar),
            Recipe("Bánh Croissant", "250 Kcal", "40 Min", "Jane Doe", R.drawable.image_recipe_detail, R.drawable.avatar),
            Recipe("Bánh Tiramisu", "200 Kcal", "50 Min", "Sophia Tran", R.drawable.image_recipe_detail, R.drawable.avatar)
        )

        val favouriteList = listOf(
            FavouriteItem("Kẹo Caramel"),
            FavouriteItem("Cá Hồi"),
            FavouriteItem("Bánh su kem"),
            FavouriteItem("Panna cotta"),
            FavouriteItem("Tiramisu"),
            FavouriteItem("Bánh Croisant"),
            FavouriteItem("Hí hí")
        )

        // Set up adapter
        val adapter = RecipeAdapter(recipeList)
        recipeRecyclerView.adapter = adapter

        val favorAdapter = FavouriteAdapter(favouriteList)

        val favorRecycleView = findViewById<RecyclerView>(R.id.chipGroup)
        favorRecycleView.adapter = favorAdapter
        val gridLayoutManager = GridLayoutManager(this, 3)
        favorRecycleView.layoutManager = gridLayoutManager

        val spacing = 8
        favorRecycleView.addItemDecoration(object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                outRect.set(spacing, spacing, spacing, spacing)
            }
        })

        // Set up Bottom Navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setSelectedItemId(R.id.nav_profile);
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {

                    true
                }
                R.id.profile -> {

                    true
                }
                else -> false
            }
        }
    }

    // Recipe data class
    data class Recipe(
        val title: String,
        val calories: String,
        val cookingTime: String,
        val author: String,
        val imageRes: Int,
        val authorImageRes: Int
    )

    // Adapter for RecyclerView
    private class RecipeAdapter(private val recipes: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.card_recipe, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val recipe = recipes[position]
            holder.bind(recipe)
        }

        override fun getItemCount(): Int = recipes.size

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val imgRecipe: ImageView = itemView.findViewById(R.id.imgRecipe)
            private val txtRecipeTitle: TextView = itemView.findViewById(R.id.txtRecipeTitle)
            private val txtCalories: TextView = itemView.findViewById(R.id.txtCalories)
            private val txtCookingTime: TextView = itemView.findViewById(R.id.txtCookingTime)
            private val txtAuthorName: TextView = itemView.findViewById(R.id.txtAuthorName)
            private val imgAuthor: ImageView = itemView.findViewById(R.id.imgAuthor)

            fun bind(recipe: Recipe) {
                txtRecipeTitle.text = recipe.title
                txtCalories.text = recipe.calories
                txtCookingTime.text = recipe.cookingTime
                txtAuthorName.text = recipe.author
                imgRecipe.setImageResource(recipe.imageRes)
                imgAuthor.setImageResource(recipe.authorImageRes)
            }
        }
    }
}
