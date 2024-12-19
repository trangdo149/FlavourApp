package com.example.flavourapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flavourapp.IngredientAdapter.ViewHolder
import com.example.flavourapp.databinding.CategoryIngredientRvBinding
import com.example.flavourapp.databinding.CategoryStepsRvBinding

class StepsAdapter(private val stepList: Array<StepsModel>):
    RecyclerView.Adapter<StepsAdapter.ViewHolder>(){
    class ViewHolder(private val binding: CategoryStepsRvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(steps: StepsModel) {
            binding.txtStep.text = steps.NumberStep
            binding.txtContentStep.text = steps.ContentStep
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CategoryStepsRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val steps = stepList[position]
        holder.bind(steps)
    }
    override fun getItemCount(): Int {
        return stepList.size
    }
}