package com.example.flavourapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flavourapp.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flavourapp.NotificationAdapter

// Import NotificationItem nếu nằm trong package khác
import com.example.flavourapp.NotificationItem

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        // Dữ liệu tĩnh
        val notifications = listOf(
            NotificationItem("Quang Trung", "Đã thích bài viết của bạn", "5 phút trước"),
            NotificationItem("Nguyễn Huệ", "Đã chia sẻ bài viết của bạn", "10 phút trước"),
            NotificationItem("Châu Bùi", "Đã thích bài viết của bạn", "15 phút trước")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(SpaceItemDecoration(8)) // Khoảng cách 10dp

        recyclerView.adapter = NotificationAdapter(notifications) // Truyền danh sách vào Adapter
    }
}
