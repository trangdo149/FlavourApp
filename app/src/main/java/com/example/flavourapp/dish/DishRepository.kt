package com.example.flavourapp.dish

import com.example.flavourapp.IngredientModel
import com.example.flavourapp.R
import com.example.flavourapp.StepsModel

class DishRepository {

    private val dishes = listOf(
        DishModel(
            dishName = "Sốt đậu gà",
            dishImage = R.drawable.dish_image_1,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_1, "Đậu gà", "800", "grams"),
                IngredientModel(R.drawable.ingredient_illus_2, "Dầu olive", "10", "ml"),
            ),
            steps = listOf(
                StepsModel("1", "Ngâm đậu gà 8 tiếng (qua đêm)"),
                StepsModel("2", "Nấu với lửa to cho sôi, hớt bọt sạch kỹ rồi hạ nhỏ lửa đậy nắp liu riu 45 phút đến 1 tiếng là đậu chín mềm"),
                StepsModel("3", "Lột 4 tép tỏi bỏ lõi, cho vào blender cùng đậu đã luộc và các nguyên liệu như trên"),
                StepsModel("4", "Xay trong vài phút hoặc đến khi đạt độ mượt như ý muốn. Thêm nước hầm đậu nếu muốn sốt loãng hơn."),
            ),
            category = DishCategory.MON_TRON
        ),
        DishModel(
            dishName = "Thịt kho tàu",
            dishImage = R.drawable.dish_image_2,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Thịt ba chỉ", "500", "grams"),
                IngredientModel(R.drawable.ingredient_illus_7, "Nước mắm", "3", "muỗng")
            ),
            steps = listOf(
                StepsModel("1", "Sơ chế thịt ba chỉ"),
                StepsModel("2", "Kho thịt với nước mắm và gia vị")
            ),
            category = DishCategory.MON_NUOC
        ),
        DishModel(
            dishName = "Gỏi cuốn tôm thịt",
            dishImage = R.drawable.dish_image_4,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_12, "Tôm tươi", "200", "grams"),
                IngredientModel(R.drawable.ingredient_illus_13, "Thịt heo luộc", "300", "grams"),
                IngredientModel(R.drawable.ingredient_illus_14, "Bánh tráng", "20", "lá"),
                IngredientModel(R.drawable.ingredient_illus_15, "Rau sống", "100", "grams"),
            ),
            steps = listOf(
                StepsModel("1", "Luộc tôm và thịt heo, cắt lát mỏng"),
                StepsModel("2", "Chuẩn bị các loại rau sống"),
                StepsModel("3", "Cuộn tôm, thịt, rau sống với bánh tráng"),
                StepsModel("4", "Pha nước chấm: mắm nêm hoặc nước mắm chua ngọt")
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Cơm chiên hải sản",
            dishImage = R.drawable.dish_image_5,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_16, "Tôm", "150", "grams"),
                IngredientModel(R.drawable.ingredient_illus_17, "Mực", "200", "grams"),
                IngredientModel(R.drawable.ingredient_illus_18, "Trứng gà", "2", "quả"),
                IngredientModel(R.drawable.ingredient_illus_19, "Cơm nguội", "2", "bát"),
                IngredientModel(R.drawable.ingredient_illus_20, "Hành tây", "50", "grams"),
            ),
            steps = listOf(
                StepsModel("1", "Sơ chế hải sản và cắt nhỏ mực, tôm"),
                StepsModel("2", "Xào hải sản với hành tây"),
                StepsModel("3", "Cho cơm nguội vào và đảo đều"),
                StepsModel("4", "Thêm trứng gà, nêm gia vị và chiên đến khi cơm săn lại")
            ),
            category = DishCategory.MON_XAO
        )
    )

    fun getAllDishes(): List<DishModel> = dishes

    fun getDishesByCategory(category: DishCategory): List<DishModel> {
        return dishes.filter { it.category == category }
    }
}