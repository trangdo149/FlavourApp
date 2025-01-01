import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.flavourapp.databinding.ActivityStartBinding // Import lớp binding
import com.example.flavourapp.signup

class start : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding // Khai báo binding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflate layout với View Binding
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Thiết lập padding cho hệ thống thanh điều hướng
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Sự kiện cho nút "Tạo tài khoản"
        binding.dkbutton.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        // Sự kiện cho nút "Đăng nhập"
        binding.signinbutton.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
    }
}