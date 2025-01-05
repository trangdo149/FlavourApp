package com.example.flavourapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Định nghĩa lớp Recipe
data class Recipe(
    val name: String,
    val time: String,
    val calories: String,
    val imageResId: Int
)

class RecipeAdapter(
    private val recipeList: List<Recipe>,
    private val onItemClick: (Recipe) -> Unit // Callback nhận một Recipe khi item được click
) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeImage: ImageView = view.findViewById(R.id.recipeImage)
        val recipeTitle: TextView = view.findViewById(R.id.recipeTitle)
        val recipeTime: TextView = view.findViewById(R.id.recipeTime)
        val recipeCalories: TextView = view.findViewById(R.id.recipeCalories)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe1, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipeList[position]

        holder.recipeTitle.text = recipe.name
        holder.recipeTime.text = recipe.time
        holder.recipeCalories.text = recipe.calories
        holder.recipeImage.setImageResource(recipe.imageResId)

        // Gắn sự kiện click cho item
        holder.itemView.setOnClickListener {
            onItemClick(recipe) // Gọi callback với recipe được click
        }
    }

    override fun getItemCount() = recipeList.size
}
