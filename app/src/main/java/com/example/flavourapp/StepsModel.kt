package com.example.flavourapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StepsModel(
    val NumberStep: String,
    val ContentStep: String
) : Parcelable
