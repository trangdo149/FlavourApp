package com.example.flavourapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Define the Recipe3 data class
data class Recipe3(
    val name3: String,
    val time3: String,
    val calories3: String,
    val imageResId3: Int,
    val subtitle3: String
)

class ViewRecipe3Adapter(
    private val recipeList: List<Recipe3>,
    private val onItemClick: (Recipe3) -> Unit
) :
    RecyclerView.Adapter<ViewRecipe3Adapter.RecipeViewHolder>() {

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeImage3: ImageView = view.findViewById(R.id.recipeImage3)
        val recipeTitle3: TextView = view.findViewById(R.id.recipeTitle3)
        val recipeSubtitle3: TextView = view.findViewById(R.id.recipeSubtitle3)
        val recipeCalories3: TextView = view.findViewById(R.id.recipeCalories3)
        val recipeTime3: TextView = view.findViewById(R.id.recipeTime3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe3, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipeList[position]
        Log.d("Recipe", "Binding data for: ${recipe.time3}")
        holder.recipeImage3.setImageResource(recipe.imageResId3)
        holder.recipeTitle3.text = recipe.name3
        holder.recipeSubtitle3.text = recipe.subtitle3
        holder.recipeCalories3.text = recipe.calories3
        holder.recipeTime3.text = recipe.time3
        holder.itemView.setOnClickListener {
            onItemClick(recipe)
        }

    }

    override fun getItemCount() = recipeList.size
}

