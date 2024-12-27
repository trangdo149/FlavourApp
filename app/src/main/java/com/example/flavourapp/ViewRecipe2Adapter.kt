package com.example.flavourapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

data class RecipeImage(
    val imageResId: Int
)

class ViewRecipe2Adapter(private val imageList: List<RecipeImage>) :
    RecyclerView.Adapter<ViewRecipe2Adapter.ImageViewHolder>() {

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeImageView: ImageView = view.findViewById(R.id.recipeImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe2, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val recipeImage = imageList[position]
        holder.recipeImageView.setImageResource(recipeImage.imageResId)
    }

    override fun getItemCount() = imageList.size
}
