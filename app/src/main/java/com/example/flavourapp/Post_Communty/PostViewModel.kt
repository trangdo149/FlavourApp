package com.example.flavourapp.Post_Communty

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PostViewModel : ViewModel() {
    private val _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> get() = _posts

    init {
        loadPosts()
    }

    private fun loadPosts() {

        _posts.value = listOf(
            Post("Trần Hồng Châu", "Trong những ngày gió rét...", "drawable/monan", "1,2K", "137", "32"), // local
            Post("Dương Quá", "Phở là một món ăn truyền thống...", "https://example.com/image1.jpg", "1,2K", "137", "32"), // URL online từ sever cái này bổ sung nếu muốn update
            Post("Trần Hồng Châu", "Trong những ngày gió rét...", "drawable/monan", "1,2K", "137", "32"), // local
            Post("Dương Quá", "Phở là một món ăn truyền thống...", "https://example.com/image1.jpg", "1,2K", "137", "32"),
            Post("Trần Hồng Châu", "Trong những ngày gió rét...", "drawable/monan", "1,2K", "137", "32"), // local
            Post("Dương Quá", "Phở là một món ăn truyền thống...", "https://example.com/image1.jpg", "1,2K", "137", "32") // URL online từ sever cái này bổ sung nếu muốn update

        )
    }
}
