package com.example.flavourapp.fragment


import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flavourapp.EditProfileActivity
import com.example.flavourapp.FavouriteAdapter
import com.example.flavourapp.FavouriteItem
import com.example.flavourapp.IngredientModel
import com.example.flavourapp.R
import com.example.flavourapp.RecipeDetailActivity
import com.example.flavourapp.Signup
import com.example.flavourapp.StepsModel
import com.example.flavourapp.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.parcelize.Parcelize

class ProfileFragment : Fragment() {
    private  val binding by lazy { FragmentProfileBinding .inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initview()
        return binding.root
    }

    private fun initview() {
        binding.editProfileButton.setOnClickListener {
            val intent = Intent(requireContext(), EditProfileActivity::class.java)
            startActivity(intent)
        }

        val user = FirebaseAuth.getInstance().currentUser
        user?.let {

            val userName = it.displayName

            val photoUrl = it.photoUrl
            photoUrl?.let { url ->
                Glide.with(this)
                    .load(url)
                    .into(binding.profileImage)
            } ?: run {
                binding.profileImage.setImageResource(R.drawable.avatar2)
            }


            // Set up ChipGroup with specialties
            val chipGroup = binding.chipGroup

            // Set up RecyclerView
            val recipeRecyclerView = binding.recipeRecyclerView

            // Sample data for recipes
            val recipeList = listOf(
                Recipe("Xốt Hummus", "120 Kcal", "20 Min", "Elena Shelby", R.drawable.image_recipe_detail, R.drawable.avatar,
                    ArrayList(   listOf(StepsModel("1", "Ngâm hoặc luộc đậu gà cho mềm."), StepsModel("2","Xay đậu gà với tahini, nước cốt chanh, tỏi, muối, và bột thì là."), StepsModel("3","Thêm dầu ô liu và nước, tiếp tục xay đến khi mịn."), StepsModel("4","Trang trí và dùng kèm bánh mì hoặc rau củ."))), ArrayList(listOf(IngredientModel(R.drawable.ingredient_illus_3, "Đậu gà", "800", "gram"), IngredientModel(R.drawable.ingredient_illus_3,"Dầu olive","10","ml"), IngredientModel(R.drawable.ingredient_illus_3,"Tỏi nhuyễn","2","tép"), IngredientModel(R.drawable.ingredient_illus_3,"Đậu gà đen","400","grams"), IngredientModel(R.drawable.ingredient_illus_4,"Sốt chua ngọt","120","grams")))),
                Recipe("Panna Cotta", "150 Kcal", "30 Min", "John Doe", R.drawable.img_pannacotta, R.drawable.avatar3,
                    ArrayList(listOf(StepsModel("1", "Ngâm gelatin vào nước lạnh để mềm."),StepsModel("2", "Đun sữa, kem tươi, đường, và vani đến khi ấm, không để sôi."),StepsModel("3", "Khuấy gelatin vào hỗn hợp đến tan hoàn toàn."))), ArrayList<IngredientModel>(listOf(IngredientModel(R.drawable.ingredient_illus_3, "Kem tươi (heavy cream)", "250", "ml"), IngredientModel(R.drawable.ingredient_illus_3, "Sữa tươi không đường", "250", "ml"), IngredientModel(R.drawable.ingredient_illus_3, "Đường", "80", "g"), IngredientModel(R.drawable.ingredient_illus_3, "Bột gelatin hoặc 2 lá gelatin", "5", "g"), IngredientModel(R.drawable.ingredient_illus_3, "Cà phê vani chiết xuất (hoặc hạt vani)", "1", "thìa")))),
                Recipe("Bánh Croissant", "250 Kcal", "40 Min", "Jane Doe", R.drawable.img_croissant, R.drawable.avatar4,
                    ArrayList(listOf(StepsModel("1", "Nhào bột với men, sữa, muối, đường thành khối mềm, để nở 1 giờ."), StepsModel("2", "Cán bơ thành tấm mỏng, đặt vào bột đã cán, gấp lớp và để lạnh."), StepsModel("3", "Cán gấp bột 3 lần, mỗi lần để lạnh 30 phút."), StepsModel("4", "Cắt tạo hình, cuộn bánh, để nở lần 2, rồi nướng ở 200°C khoảng 15-20 phút."))), ArrayList(listOf(IngredientModel(R.drawable.ingredient_illus_3, "Bột mì đa dụng", "250", "grams"), IngredientModel(R.drawable.ingredient_illus_3, "Muối", "5", "grams"), IngredientModel(R.drawable.ingredient_illus_3, "Đuường", "30", "grams"), IngredientModel(R.drawable.ingredient_illus_3, "Men khô (yeast)", "6", "grams"), IngredientModel(R.drawable.ingredient_illus_3, "Sữa tươi ấm", "150", "ml"), IngredientModel(R.drawable.ingredient_illus_3, "Bơ lạt (để làm lớp cán bơ)", "150", "grams"), IngredientModel(R.drawable.ingredient_illus_3, "trứng (đánh tan, để quét mặt bánh)", "1", "quả")))),
                Recipe("Bánh Tiramisu", "200 Kcal", "50 Min", "Sophia Tran", R.drawable.img_tiramisu, R.drawable.avatar5,
                    ArrayList(listOf(StepsModel("1", "Đánh lòng đỏ với đường đến bông mịn, trộn mascarpone."), StepsModel("2", "Đánh bông kem tươi, trộn vào hỗn hợp mascarpone."), StepsModel("3", "Nhúng ladyfinger vào cà phê pha rượu, xếp vào khuôn."), StepsModel("4", "Phủ lớp kem mascarpone, lặp lại, rắc bột cacao và để lạnh 4-6 giờ."))), ArrayList(listOf(IngredientModel(R.drawable.ingredient_illus_3, "Bánh ladyfinger (savoiardi)", "200", "gram"), IngredientModel(R.drawable.ingredient_illus_3, "Mascarpone)", "250", "gram"), IngredientModel(R.drawable.ingredient_illus_3, "Lòng đỏ trứng)", "3", "cái"), IngredientModel(R.drawable.ingredient_illus_3, "Đường", "100", "grams"), IngredientModel(R.drawable.ingredient_illus_3, "Cà phê đậm (để nguội)", "200", "ml"), IngredientModel(R.drawable.ingredient_illus_3, "Kem tươi (whipping cream)", "200", "ml"), IngredientModel(R.drawable.ingredient_illus_3, "Bột cacao để rắc.", "", ""))))
            )

            val favouriteList = listOf(
                FavouriteItem("Cơm trộn"),
                FavouriteItem("Panna cotta"),
                FavouriteItem("Tiramisu"),
                FavouriteItem("Croisant"),
                FavouriteItem("Bún thang"),
            )

            // Set up adapter
            val adapter2 = context?.let { it1 -> RecipeAdapter(recipeList, it1) }
            recipeRecyclerView.adapter = adapter2

            val favorAdapter = FavouriteAdapter(favouriteList)

            val favorRecycleView = binding.chipGroup
            favorRecycleView.adapter = favorAdapter
//            val gridLayoutManager = GridLayoutManager(this, 3)
//            favorRecycleView.layoutManager = gridLayoutManager

            val spacing = 8
            favorRecycleView.addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    outRect.set(spacing, spacing, spacing, spacing)
                }
            })
        }

    }


    // Recipe data class
    @Parcelize
    data class Recipe(
        val title: String,
        val calories: String,
        val cookingTime: String,
        val author: String,
        val imageRes: Int,
        val authorImageRes: Int,
        val steps: ArrayList<StepsModel>,
        val ingredients: ArrayList<IngredientModel>
    ) : Parcelable

    // Adapter for RecyclerView
    private class RecipeAdapter(private val recipes: List<Recipe>, private val context: Context) : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.card_recipe, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val recipe = recipes[position]
            holder.bind(recipe, context)
        }

        override fun getItemCount(): Int = recipes.size

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val imgRecipe: ImageView = itemView.findViewById(R.id.imgRecipe)
            private val txtRecipeTitle: TextView = itemView.findViewById(R.id.txtRecipeTitle)
            private val txtCalories: TextView = itemView.findViewById(R.id.txtCalories)
            private val txtCookingTime: TextView = itemView.findViewById(R.id.txtCookingTime)
            private val txtAuthorName: TextView = itemView.findViewById(R.id.txtAuthorName)
            private val imgAuthor: ImageView = itemView.findViewById(R.id.imgAuthor)


            fun bind(recipe: Recipe, context: Context) {
                txtRecipeTitle.text = recipe.title
                txtCalories.text = recipe.calories
                txtCookingTime.text = recipe.cookingTime
                txtAuthorName.text = recipe.author
                imgRecipe.setImageResource(recipe.imageRes)
                imgAuthor.setImageResource(recipe.authorImageRes)
                itemView.setOnClickListener{
                    val goToDetail = Intent(context, RecipeDetailActivity::class.java)
                    goToDetail.putParcelableArrayListExtra("steps", recipe.steps)
                    goToDetail.putParcelableArrayListExtra("ingredient", recipe.ingredients)
                    goToDetail.putExtra("recipe", recipe)
                    context.startActivity(goToDetail)
                }
            }
        }
    }
}