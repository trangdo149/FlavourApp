package com.example.flavourapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.flavourapp.base.BaseActivity
import com.example.flavourapp.databinding.ActivityRecipeDetailBinding
import com.example.flavourapp.fragment.ProfileFragment

class RecipeDetailActivity : BaseActivity() {
    private lateinit var binding: ActivityRecipeDetailBinding

    private val ingredientList = listOf(
        IngredientModel(R.drawable.ingredient_illus_1, "Đậu gà", "800", "grams"),
        IngredientModel(R.drawable.ingredient_illus_2, "Dầu olive", "10", "ml"),
        IngredientModel(R.drawable.ingredient_illus_3, "Tỏi nhuyễn", "2", "tép"),
        IngredientModel(R.drawable.ingredient_illus_4, "Đậu gà đen", "400", "grams"),
        IngredientModel(R.drawable.ingredient_illus_5, "Sốt chua ngọt", "120", "grams"),
    )

    private val stepsList = listOf(
        StepsModel("1", "Ngâm đậu gà 8 tiếng (qua đêm)"),
        StepsModel(
            "2",
            "Nấu với lửa to cho sôi, hớt bọt sạch kỹ rồi hạ nhỏ lửa đậy nắp liu riu 45 phút đến 1 tiếng là đậu chín mềm"
        ),
        StepsModel(
            "3",
            "Lột 4 tép tỏi bỏ lõi, cho vào blender cùng đậu đã luộc và các nguyên liệu như trên"
        ),
        StepsModel(
            "4",
            "Xay trong vài phút hoặc đến khi đạt độ mượt như ý muốn. Thêm nước hầm đậu nếu muốn sốt loãng hơn."
        ),
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

        // Setting everything from begin
        val recipe = intent.getParcelableExtra<ProfileFragment.Recipe>("recipe")

        Glide.with(this)
            .load(recipe?.imageRes)
            .into(binding.imageView)

        binding.textView.text = recipe?.title ?: "Không có tên"


        val listIngredient = intent.getParcelableArrayListExtra<IngredientModel>("ingredient")
        val listStep = intent.getParcelableArrayListExtra<StepsModel>("steps")

        val ingredientAdapter = if (listIngredient != null) {
            IngredientAdapter(listIngredient)
        } else {
            IngredientAdapter(ingredientList)
        }
        binding.rvNguyenlieu.layoutManager = LinearLayoutManager(this)
        binding.rvNguyenlieu.adapter = ingredientAdapter


        val stepsAdapter = if (listStep != null) {
            StepsAdapter(listStep)
        } else {
            StepsAdapter(stepsList)
        }
        binding.rvCacbuoc.layoutManager = LinearLayoutManager(this)
        binding.rvCacbuoc.adapter = stepsAdapter
        binding.nestedScrollView.post {
            binding.nestedScrollView.scrollTo(0, 0)
        }
        binding.txtCacBuoc.setTextColor(getColor(R.color.neutral_500))
        binding.lineCacbuoc.visibility = View.GONE
        binding.rvCacbuoc.visibility = View.GONE

        binding.btnCacbuoc.setOnClickListener {
            binding.txtNguyenLieu.setTextColor(getColor(R.color.neutral_500))
            binding.txtCacBuoc.setTextColor(getColor(R.color.green_950))
            binding.lineNguyenlieu.visibility = View.GONE
            binding.lineCacbuoc.visibility = View.VISIBLE
            binding.rvNguyenlieu.visibility = View.GONE
            binding.rvCacbuoc.visibility = View.VISIBLE
        }

        binding.btnNguyenlieu.setOnClickListener {
            binding.txtNguyenLieu.setTextColor(getColor(R.color.green_950))
            binding.txtCacBuoc.setTextColor(getColor(R.color.neutral_500))
            binding.lineCacbuoc.visibility = View.GONE
            binding.lineNguyenlieu.visibility = View.VISIBLE
            binding.rvCacbuoc.visibility = View.GONE
            binding.rvNguyenlieu.visibility = View.VISIBLE
        }

        binding.iconBack.setOnClickListener { finish() }
    }
}
