import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.flavourapp.databinding.ActivitySigninBinding // Import lớp binding
import com.example.flavourapp.signup

class signin : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding // Khai báo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflate layout với View Binding
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Thiết lập padding cho hệ thống thanh điều hướng
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Xử lý sự kiện nhấn vào TextView đăng ký
        binding.textViewdk.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        // Xử lý sự kiện nhấn vào nút đăng nhập
        binding.dkbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}