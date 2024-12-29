package com.example.flavourapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Community : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com)

        // Dữ liệu tĩnh
        val posts = listOf(
            Post(
                username = "Trần Hồng Châu",
                postTime = "5 phút",
                content = "Trong những ngày gió rét...",
                avatarResId = R.drawable.avatar,
                postImageResId = R.drawable.image_recipe_detail,
                likeCount = "1,2K",
                commentCount = "137",
                shareCount = "32"
            ),
            Post(
                username = "Trần Hồng Châu",
                postTime = "5 phút",
                content = "Trong những ngày gió rét...",
                avatarResId = R.drawable.avatar,
                postImageResId = R.drawable.image_recipe_detail,
                likeCount = "1,2K",
                commentCount = "137",
                shareCount = "32"
            ),
            Post(
                username = "Dương Quá",
                postTime = "5 phút",
                content = "Phở là một món ăn truyền thống...",
                avatarResId = R.drawable.avatar,
                postImageResId = R.drawable.image_recipe_detail,
                likeCount = "890",
                commentCount = "85",
                shareCount = "25"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ComAdapter(posts)

    }
}