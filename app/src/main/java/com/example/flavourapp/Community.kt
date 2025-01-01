import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.ComAdapter
import com.example.flavourapp.Post
import com.example.flavourapp.R
import com.example.flavourapp.databinding.ActivityComBinding // Import lớp binding

class Community : AppCompatActivity() {
    private lateinit var binding: ActivityComBinding // Khai báo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComBinding.inflate(layoutInflater)
        setContentView(binding.root) // Gán layout qua binding

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

        // Sử dụng binding để truy cập RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ComAdapter(posts)
    }
}