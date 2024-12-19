package com.example.flavourapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flavourapp.databinding.ActivityRecipeDetailBinding

class RecipeDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeDetailBinding

    private val ingredientList = arrayOf(
        IngredientModel(R.drawable.ingredient_illus_1, "Đậu gà", "800","grams"),
        IngredientModel(R.drawable.ingredient_illus_2, "Dầu olive", "10","ml"),
        IngredientModel(R.drawable.ingredient_illus_3, "Tỏi nhuyễn", "2","tép"),
        IngredientModel(R.drawable.ingredient_illus_4, "Đậu gà đen", "400","grams"),
        IngredientModel(R.drawable.ingredient_illus_5, "Sốt chua ngọt", "120","grams"),
    )

    private val stepsList = arrayOf(
        StepsModel("1", "Ngâm đậu gà 8 tiếng (qua đêm)"),
        StepsModel("2", "Nấu với lửa to cho sôi, hớt bọt sạch kỹ rồi hạ nhỏ lửa đậy nắp liu riu 45 phút đến 1 tiếng là đậu chín mềm"),
        StepsModel("3", "Lột 4 tép tỏi bỏ lõi, cho vào blender cùng đậu đã luộc và các nguyên liệu như trên"),
        StepsModel("4", "Xay trong vài phút hoặc đến khi đạt độ mượt như ý muốn. Thêm nước hầm đậu nếu muốn sốt loãng hơn."),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRecipeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ingredientAdapter = IngredientAdapter(ingredientList)
        binding.rvNguyenlieu.layoutManager = LinearLayoutManager(this)
        binding.rvNguyenlieu.adapter = ingredientAdapter

        val stepsAdapter = StepsAdapter(stepsList)
        binding.rvCacbuoc.layoutManager = LinearLayoutManager(this)
        binding.rvCacbuoc.adapter = stepsAdapter

        binding.nestedScrollView.post {
            binding.nestedScrollView.scrollTo(0, 0)
        }

        binding.txtCacBuoc.setTextColor(getColor(R.color.neutral_500))
        binding.lineCacbuoc.visibility = View.GONE
        binding.rvCacbuoc.visibility = View.GONE
        binding.btnCacbuoc.setOnClickListener{
            binding.txtNguyenLieu.setTextColor(getColor(R.color.neutral_500))
            binding.txtCacBuoc.setTextColor((getColor(R.color.green_950)))
            binding.lineNguyenlieu.visibility = View.GONE
            binding.lineCacbuoc.visibility = View.VISIBLE
            binding.rvNguyenlieu.visibility = View.GONE
            binding.rvCacbuoc.visibility = View.VISIBLE
        }
        binding.btnNguyenlieu.setOnClickListener{
            binding.txtNguyenLieu.setTextColor(getColor(R.color.green_950))
            binding.txtCacBuoc.setTextColor(getColor(R.color.neutral_500))
            binding.lineCacbuoc.visibility = View.GONE
            binding.lineNguyenlieu.visibility = View.VISIBLE
            binding.rvCacbuoc.visibility = View.GONE
            binding.rvNguyenlieu.visibility = View.VISIBLE
        }
    }
}