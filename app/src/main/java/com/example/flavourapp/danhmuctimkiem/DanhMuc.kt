package com.example.flavourapp.danhmuctimkiem

import com.example.flavourapp.dish.DishCategory

data class DanhMuc(
    val ten: String,
    val hinhAnhResId: Int,
    val category: DishCategory
)
