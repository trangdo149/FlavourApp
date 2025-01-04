package com.example.flavourapp.dish

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.flavourapp.activity.RecipeActivity
import com.example.flavourapp.databinding.ItemDishBinding

class DishAdapter(
    private val context: Context,
    private val dishes: List<DishModel>
) : RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val binding = ItemDishBinding.inflate(LayoutInflater.from(context), parent, false)
        return DishViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishes[position]

        holder.binding.imgRecipe.setImageResource(dish.dishImage)
        holder.binding.txtRecipeTitle.text = dish.dishName
        holder.binding.txtCalories.text = "120 Kcal"
        holder.binding.txtCookingTime.text = "20 Min"
        holder.binding.txtAuthorName.text = "Elena Shelby"

        holder.binding.root.setOnClickListener {
            Toast.makeText(context, "Bạn đã chọn món: ${dish.dishName}", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, RecipeActivity::class.java)

            // Truyền dữ liệu DishModel qua Intent
            intent.putExtra("dishName", dish.dishName)
            intent.putParcelableArrayListExtra("ingredients", ArrayList(dish.ingredients))
            intent.putParcelableArrayListExtra("steps", ArrayList(dish.steps))
            intent.putExtra("dishImage", dish.dishImage)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = dishes.size

    class DishViewHolder(val binding: ItemDishBinding) : RecyclerView.ViewHolder(binding.root)
}
