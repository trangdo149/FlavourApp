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
            Post("Dương Quá", "Phở là một món ăn truyền thống...", "drawable/phobo", "1,2K", "137", "32"), // URL online từ sever cái này bổ sung nếu muốn update
            Post("Coco", "Gỏi cuốn thật tuyệt vời...", "drawable/goicuon", "1,2K", "137", "32"), // local
            Post("Anh Trâu", "Bánh mỳ nhiều nhân ăn ngon thật...", "drawable/banhmy", "1,2K", "137", "32"),
            Post("Thất đại hiệp", "Lần đầu làm có đẹp ko mọi người...", "drawable/comtronhq", "1,2K", "137", "32"), // local
            Post("Lý Mạc Sầu", "Sợ heo nhưng ăn được nộm tai heo...", "drawable/nomtaiheo", "1,2K", "137", "32") // URL online từ sever cái này bổ sung nếu muốn update

        )
    }
}
