package com.example.flavourapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flavourapp.databinding.CategoryIngredientRvBinding

class IngredientAdapter(private val ingredientList: Array<IngredientModel>) :
    RecyclerView.Adapter<IngredientAdapter.ViewHolder>() {
    class ViewHolder(private val binding: CategoryIngredientRvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(ingredient: IngredientModel) {
            binding.imgDauGa.setImageResource(ingredient.ingrImage)
            binding.txtNameIngredient.text = ingredient.ingrName
            binding.txtSoluong.text = ingredient.ingrQuantity
            binding.txtDonvi.text = ingredient.ingrUnit
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Sử dụng ViewBinding để tạo view holder
        val binding = CategoryIngredientRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Gắn dữ liệu vào ViewHolder
        val ingredient = ingredientList[position]
        holder.bind(ingredient)
    }

    override fun getItemCount(): Int {
        return ingredientList.size
    }
}
