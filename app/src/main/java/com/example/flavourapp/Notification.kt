package com.example.flavourapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.NotificationAdapter
import com.example.flavourapp.NotificationItem
import com.example.flavourapp.SpaceItemDecoration
import com.example.flavourapp.base.BaseActivity
import com.example.flavourapp.databinding.ActivityNotificationBinding // Import lớp binding

class Notification : BaseActivity() {
    private lateinit var binding: ActivityNotificationBinding // Khai báo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout với View Binding
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Dữ liệu tĩnh
        val notifications = listOf(
            NotificationItem(R.drawable.avatar, "Quang Trung", "Đã thích bài viết của bạn", "5 phút trước"),
            NotificationItem(R.drawable.avatar2, "Nguyễn Huệ", "Đã chia sẻ bài viết của bạn", "10 phút trước"),
            NotificationItem(R.drawable.avatar, "Châu Bùi", "Đã thích bài viết của bạn", "15 phút trước")
        )

        // Thiết lập RecyclerView với View Binding
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.addItemDecoration(SpaceItemDecoration(8))

        binding.recyclerView.adapter = NotificationAdapter(notifications)
        binding.iconBack.setOnClickListener {
            finish()
        }
    }
}