package com.example.flavourapp

data class NotificationItem(
    val imageResource: Int,
    val name: String,      // Tên người
    val action: String,    // Hành động
    val time: String       // Thời gian
)