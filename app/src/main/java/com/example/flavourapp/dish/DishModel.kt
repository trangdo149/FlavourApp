package com.example.flavourapp.dish

import com.example.flavourapp.IngredientModel
import com.example.flavourapp.StepsModel

enum class DishCategory {
    MON_CUON,
    MON_TRON,
    MON_NUOC,
    MON_XAO
}

data class DishModel(
    val dishName: String,
    val dishImage: Int,
    val ingredients: List<IngredientModel>,
    val steps: List<StepsModel>,
    val category: DishCategory
)