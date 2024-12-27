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

class RecipeAdapter(private val recipeList: List<Recipe>) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    // ViewHolder giữ các view của item trong RecyclerView
    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeImage: ImageView = view.findViewById(R.id.recipeImage)
        val recipeTitle: TextView = view.findViewById(R.id.recipeTitle)
        val recipeTime: TextView = view.findViewById(R.id.recipeTime)
        val recipeCalories: TextView = view.findViewById(R.id.recipeCalories)
    }

    // Tạo ViewHolder cho mỗi item trong RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        // Inflate layout item_recipe1.xml
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe1, parent, false)
        return RecipeViewHolder(view)
    }

    // Gán dữ liệu vào ViewHolder
    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipeList[position]

        // Gán dữ liệu cho các TextView và ImageView
        holder.recipeTitle.text = recipe.name
        holder.recipeTime.text = recipe.time
        holder.recipeCalories.text = recipe.calories
        holder.recipeImage.setImageResource(recipe.imageResId) // Gán hình ảnh từ tài nguyên
    }

    // Trả về số lượng item trong RecyclerView
    override fun getItemCount() = recipeList.size
}
