package com.example.flavourapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class IngredientModel(
    val ingrImage: Int,
    val ingrName: String,
    val ingrQuantity: String,
    val ingrUnit: String
) : Parcelable
