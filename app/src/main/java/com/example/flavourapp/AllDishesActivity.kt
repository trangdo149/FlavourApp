package com.example.flavourapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.R
import com.example.flavourapp.databinding.AlldishesactivityBinding
import com.example.flavourapp.Recipe
import com.example.flavourapp.RecipeAdapter
import com.example.flavourapp.dish.DishRepository

class AllDishesActivity : AppCompatActivity() {

    private lateinit var binding: AlldishesactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AlldishesactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Thiết lập RecyclerView để hiển thị danh sách món ăn
        setupRecyclerView()

        // Thiết lập sự kiện quay trở về
        binding.imageView5.setOnClickListener {
            finish() // Quay trở về màn hình trước đó
        }
    }

    private fun setupRecyclerView() {
        binding.allDishesRecyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.allDishesRecyclerView.adapter = RecipeAdapter(getAllDishes()) { recipe ->
            onDishClicked(recipe.name) // Xử lý sự kiện click vào món ăn
        }
    }


    private fun getAllDishes(): List<Recipe> {
        // Tạo danh sách các món ăn để hiển thị
        return listOf(
            Recipe("Tré trộn", "20 Min", "300 Kcal", R.drawable.dish_image_1),
            Recipe("Gà xé trộn rau răm", "40 Min", "300 Kcal", R.drawable.dish_image_2),
            Recipe("Phở trộn chay", "20 Min", "150 Kcal", R.drawable.dish_image_3),
            Recipe("Rau quả trộn sốt", "20 Min", "100 Kcal", R.drawable.dish_image_4),
            Recipe("Cơm trộn rong biển", "20 Min", "250 Kcal", R.drawable.dish_image_5),
            Recipe("Phở gà", "10 Min", "200 Kcal", R.drawable.dish_image_6),
            Recipe("Bún thang", "45 Min", "400 Kcal", R.drawable.dish_image_7),
            Recipe("Bún riêu cua", "25 Min", "435 Kcal", R.drawable.dish_image_8),
            Recipe("Mỳ bò Đài Loan", "45 Min", "450 Kcal", R.drawable.dish_image_9),
            Recipe("Mỳ cay Jjampong", "10 Min", "200 Kcal", R.drawable.dish_image_10),
            Recipe("Gỏi cuốn", "10 Min", "200 Kcal", R.drawable.dish_image_11),
            Recipe("Bò bía mặn", "10 Min", "200 Kcal", R.drawable.dish_image_12),
            Recipe("Bò lá lốt", "10 Min", "200 Kcal", R.drawable.dish_image_13),
            Recipe("Chả giò cuốn", "10 Min", "200 Kcal", R.drawable.dish_image_14),
            Recipe("Nem nướng", "10 Min", "200 Kcal", R.drawable.dish_image_15),
            Recipe("rau muống xào tỏi", "10 Min", "200 Kcal", R.drawable.dish_image_16),
            Recipe("Mực xào hành tây", "10 Min", "200 Kcal", R.drawable.dish_image_17),
            Recipe("Bò xào rau cải", "10 Min", "200 Kcal", R.drawable.dish_image_18),
            Recipe("Tôm xào bông cải", "10 Min", "200 Kcal", R.drawable.dish_image_19),
            Recipe("Gà xào nấm", "10 Min", "200 Kcal", R.drawable.dish_image_20),

        )
    }
    private fun onDishClicked(dishName: String) {
        val dishRepository = DishRepository()
        val selectedDish = dishRepository.getAllDishes().find { it.dishName == dishName }

        if (selectedDish != null) {
            val intent = Intent(this, RecipeActivity::class.java).apply {
                putExtra("dishName", selectedDish.dishName)
                putExtra("dishImage", selectedDish.dishImage)
                putExtra("dishDescription", selectedDish.dishDescription)
                putParcelableArrayListExtra("ingredients", ArrayList(selectedDish.ingredients))
                putParcelableArrayListExtra("steps", ArrayList(selectedDish.steps))
            }

            Toast.makeText(this, "Bạn đã chọn món: $dishName", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        } else {
            Toast.makeText(this, "Không tìm thấy thông tin món ăn!", Toast.LENGTH_SHORT).show()
        }
    }
}
