package com.example.flavourapp.dish

import com.example.flavourapp.IngredientModel
import com.example.flavourapp.R
import com.example.flavourapp.StepsModel

class DishRepository {

    private val dishes = listOf(
        DishModel(
            dishName = "Tré trộn",
            dishImage = R.drawable.dish_image_1,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),

            ),
            steps = listOf(
                StepsModel("1", "Bào sợi tré, da heo, xoài; xé nhỏ thịt bò khô."),
                StepsModel("2", "Pha nước trộn: Nước mắm, đường, chanh, ớt."),
                StepsModel("3", "Trộn đều các nguyên liệu với nước trộn."),
                StepsModel("4", "Rắc rau răm, hành phi, đậu phộng lên, dọn ra đĩa và thưởng thức."),
            ),
            category = DishCategory.MON_TRON
        ),
        DishModel(
            dishName = "Gà xé trộn rau răm",
            dishImage = R.drawable.dish_image_2,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Xoài bào sợi. Dưa leo, nem chua, chả cắt miếng dày tầm 0.5cm"),
                StepsModel("2", "Cho các nguyên liệu vào thau, dùng tay bóp miếng tré nhỏ ra để dễ thấm gia vị. Cho thêm tỏi băm, rau răm cắt nhỏ (nếu thích ăn cay thì cho thêm ít ớt băm/bột ớt)"),
                StepsModel("3", "Cho 1-2 muỗng cafe muối tiêu vào thau gỏi, trộn đều các nguyên liệu, nêm nếm lại cho vừa ăn."),
                StepsModel("4", "Xếp ra và ăn kèm với bánh phồng tôm/bánh tráng nướng"),
            ),
            category = DishCategory.MON_TRON
        ),
        DishModel(
            dishName = "Phở trộn chay",
            dishImage = R.drawable.dish_image_3,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị phở và rau:Phở trụng nước sôi để ráo, rau sống và dưa leo rửa sạch, cắt vừa ăn. "),
                StepsModel("2", "Làm đậu hũ và tỏi sả phi:Đậu hũ băm nhỏ, chiên vàng; tỏi, sả băm phi thơm. "),
                StepsModel("3", "Pha nước sốt: Trộn nước ấm, nước tương, đường, chanh, ớt và một phần tỏi sả phi. "),
                StepsModel("4", "Hoàn thành: Cho phở, đậu hũ, rau, dưa leo vào bát, chan nước sốt và trộn đều. "),
            ),
            category = DishCategory.MON_TRON
        ),
        DishModel(
            dishName = "Rau quả trộn sốt",
            dishImage = R.drawable.dish_image_4,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Mình còn một chút rau sống thừa từ hôm trước, các loại quả gọt vỏ cắt hạt lựu để riêng."),
                StepsModel("2", "Cho toàn bộ phần nước sốt vào bát, dùng với lồng đánh đều thành hỗn hợp đồng nhất."),
                StepsModel("3", "Lưu ý: rưới nước sốt lên trước khi ăn, không nên cho nước sốt vào rồi để quá lâu mới ăn"),
                StepsModel("4", "Xếp rau sống ở bên dưới đĩa, quả ở bên trên rồi rưới nước sốt lên, khi ăn trộn đều"),
            ),
            category = DishCategory.MON_TRON
        ),
        DishModel(
            dishName = "Cơm trộn rong biển",
            dishImage = R.drawable.dish_image_5,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", " Vét tủ có gì ăn lấy nên tủ có gì nhặt ra thêm bát cơm nguội. Với rau xanh và cà rốt có thể luộc hoặc xào chín"),
                StepsModel("2", "Rưới nước thịt hoặc tương hàn quốc."),
                StepsModel("3", "Hoặc cầu kỳ hơn cho vào chảo, làm cháy cơm tạo độ nóng ròn"),
                StepsModel("4", "Trộn đều và thưởng thức"),
            ),
            category = DishCategory.MON_TRON
        ),
        DishModel(
            dishName = "Phở gà",
            dishImage = R.drawable.dish_image_6,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị gà, bánh phở, rau thơm, hành, gừng, quế, hồi và gia vị."),
                StepsModel("2", "Luộc gà chín, xé thịt, giữ lại nước luộc."),
                StepsModel("3", "Ninh xương gà với quế, hồi, hành, gừng để làm nước dùng."),
                StepsModel("4", "Chần bánh phở, xếp vào tô cùng thịt gà và rau thơm"),
                StepsModel("5", "Chan nước dùng nóng, thêm chanh, ớt và thưởng thức."),
            ),
            category = DishCategory.MON_NUOC
        ),
        DishModel(
            dishName = "Bún thang",
            dishImage = R.drawable.dish_image_7,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Sơ chế gà, giò lụa thái sợi, trứng tráng mỏng thái chỉ, tôm khô giã bông."),
                StepsModel("2", "Rửa sạch rau, thái nhỏ hành lá, rau răm, mùi tàu."),
                StepsModel("3", "Nấu nước dùng:\n" +
                        "     + Ninh xương gà/xương lợn với hành, gừng nướng.\n" +
                        "     + Nêm mắm tôm, nước mắm, muối, đường vừa ăn."),
                StepsModel("4", "Chần bún, xếp vào tô. Thêm thịt gà, giò lụa, trứng, tôm khô và rau."),
                StepsModel("5", "Chan nước dùng nóng, thêm chanh, ớt, tiêu và thưởng thức"),
            ),
            category = DishCategory.MON_NUOC
        ),
        DishModel(
            dishName = "Bún riêu cua",
            dishImage = R.drawable.dish_image_8,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Sơ chế :\n" +
                        "    + Làm sạch cua, giã nhuyễn lọc lấy nước cốt.\n" +
                        "    + Cắt cà chua múi cau, đậu phụ thái miếng nhỏ, rán vàng.\n" +
                        "    + Rửa sạch rau ăn kèm, thái nhỏ hành lá, rau thơm."),
                StepsModel("2", "Đun nước cốt cua, khuấy nhẹ, khi riêu nổi lên thì vớt ra."),
                StepsModel("3", "Nấu nước dùng:\n" +
                        "        + Phi hành tím, xào cà chua mềm, thêm nước lọc cua.\n" +
                        "        + Nêm giấm bỗng, gia vị vừa ăn."),
                StepsModel("4", "Chần bún, xếp vào tô. Thêm đậu phụ, riêu cua, hành lá, rau thơm."),
                StepsModel("5", "Chan nước dùng nóng, thêm chanh, ớt, tiêu và thưởng thức"),
            ),
            category = DishCategory.MON_NUOC
        ),
        DishModel(
            dishName = "Mỳ bò đài loan",
            dishImage = R.drawable.dish_image_9,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Cắt thịt bò, cà chua, hành tây, băm gừng và tỏi."),
                StepsModel("2", "Nấu nước dùng: Phi tỏi, hành tây, gừng, xào cà chua, thêm nước dùng và gia vị."),
                StepsModel("3", "Cho thịt bò vào nồi, ninh 30-40 phút."),
                StepsModel("4", "Luộc mì tươi, vớt ra để ráo."),
                StepsModel("5", "Xếp mì vào tô, chan nước dùng, thịt bò, trang trí hành lá, rau mùi và thưởng thức."),
            ),
            category = DishCategory.MON_NUOC
        ),
        DishModel(
            dishName = "Mỳ cay Jjampong",
            dishImage = R.drawable.dish_image_10,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Cắt thịt ba chỉ, hải sản, cà chua, bắp cải, hành tây."),
                StepsModel("2", "Xào nguyên liệu: Phi tỏi, hành tây, xào thịt ba chỉ, hải sản, cà chua."),
                StepsModel("3", "Thêm nước dùng, tương ớt, gia vị vào nồi, đun sôi"),
                StepsModel("4", "Luộc mì tươi, vớt ra để ráo."),
                StepsModel("5", "Cho mì vào tô, chan nước dùng và hải sản lên, thưởng thức nóng."),
            ),
            category = DishCategory.MON_NUOC
        ),

        DishModel(
            dishName = "Gỏi cuốn",
            dishImage = R.drawable.dish_image_11,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Rửa sạch xà lách, rau thơm, giá, hẹ, dưa leo. Dưa leo cắt dọc."),
                StepsModel("2", "Rửa sạch, luộc với hành và muối 30 phút, rồi ngâm nước lạnh, cắt lát mỏng."),
                StepsModel("3", "Rửa sạch, luộc với ít muối, tôm đỏ thì vớt ra, lột vỏ, bỏ chỉ lưng."),
                StepsModel("4", "Làm ướt bánh tráng, đặt rau, bún, thịt, tôm, rồi cuộn chặt tay là xong.")
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Bò bía mặn",
            dishImage = R.drawable.dish_image_12,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị nguyên liệu: Cà rốt, củ sắn bào sợi; rau rửa sạch để ráo."),
                StepsModel("2", "Xào nhân: Lạp xưởng cắt lát, chiên sơ; xào cà rốt, củ sắn với ít dầu, nêm nhẹ. Trứng đánh đều, tráng mỏng, cắt sợi."),
                StepsModel("3", "Cuốn bò bía: Làm ướt bánh tráng, cho rau, lạp xưởng, trứng, nhân xào, cuộn chặt tay."),
                StepsModel("4", "Làm nước chấm: Pha tương đen, tương ớt, thêm tỏi phi, đậu phộng giã nhuyễn.")
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Bò lá lốt",
            dishImage = R.drawable.dish_image_13,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị nhân: Trộn thịt bò, mỡ heo, hành tím, tỏi và gia vị (nước mắm, tiêu, hạt nêm, đường) "),
                StepsModel("2", "Cuốn lá lốt: Rửa sạch lá lốt, đặt phần mặt lá bóng xuống. Cho 1 muỗng thịt vào, cuộn lại và gấp mép "),
                StepsModel("3", "Nướng hoặc chiên: Xếp bò cuốn lá lốt lên vỉ, nướng trên than hoa đến khi lá chín thơm. Hoặc chiên trong chảo dầu đến khi lá lốt chín giòn"),
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Chả giò cuốn",
            dishImage = R.drawable.dish_image_14,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị nhân: Trộn đều thịt, tôm, miến, nấm mèo, cà rốt, khoai môn, hành tím và gia vị (nước mắm, tiêu, hạt nêm, đường). Thêm trứng để kết dính "),
                StepsModel("2", "Cuốn chả giò: Đặt bánh tráng lên mặt phẳng, cho nhân vào, cuốn tròn, gấp hai mép hai bên và cuộn chặt tay "),
                StepsModel("3", "Chiên chả giò: Đun dầu nóng, chiên chả giò với lửa vừa đến khi vàng giòn, vớt ra để ráo dầu"),
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Nem nướng",
            dishImage = R.drawable.dish_image_15,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị nem: Trộn thịt heo, mỡ heo, bột năng, tỏi, hành tím và gia vị. Nhồi đều cho dẻo, sau đó nắn thịt quanh que tre "),
                StepsModel("2", "Nướng nem: Nướng nem trên bếp than hoa hoặc lò nướng, phết dầu ăn liên tục, nướng chín vàng đều "),
                StepsModel("3", "Làm nước chấm: Phi tỏi với dầu, thêm gan heo xay, tương hột, đậu phộng và gia vị, đun nhỏ lửa đến khi sánh mịn"),
                StepsModel("4", "Chuẩn bị rau sống, cắt lát rau củ thành sợi hoặc lát. Và thưởng thức")
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Rau muống xào tỏi",
            dishImage = R.drawable.dish_image_16,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Nhặt rau muống, rửa sạch và để ráo."),
                StepsModel("2", "Đun nóng dầu, phi tỏi thơm."),
                StepsModel("3", "Cho rau muống vào xào trên lửa lớn, nêm nước mắm, muối và bột ngọt."),
                StepsModel("4", "Xào đến khi rau chín đều, giòn xanh thì tắt bếp.")
            ),
            category = DishCategory.MON_XAO
        ),
        DishModel(
            dishName = "Mực xào hành tây",
            dishImage = R.drawable.dish_image_17,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Rửa sạch mực, cắt khúc vừa ăn. Bước 2: Chần qua nước sôi có gừng để khử mùi tanh."),
                StepsModel("2", "Phi thơm tỏi, cho mực vào xào nhanh tay."),
                StepsModel("3", "Thêm hành tây, ớt chuông, nêm dầu hào, nước mắm, tiêu, và đường."),
                StepsModel("4", "Xào đều tay, khi hành tây mềm thì tắt bếp.")
            ),
            category = DishCategory.MON_XAO
        ),
        DishModel(
            dishName = "Bò xào rau cải",
            dishImage = R.drawable.dish_image_18,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Ướp thịt bò với xì dầu, tiêu, đường, và tỏi băm trong 10 phút."),
                StepsModel("2", "Đun nóng dầu, xào bò trên lửa lớn cho chín tái, sau đó vớt ra"),
                StepsModel("3", "Dùng chảo đó, xào rau cải với chút dầu, nêm dầu hào."),
                StepsModel("4", "Cho thịt bò vào xào cùng, đảo nhanh tay rồi tắt bếp.")
            ),
            category = DishCategory.MON_XAO
        ),
        DishModel(
            dishName = "Tôm xào bông cải",
            dishImage = R.drawable.dish_image_19,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Rửa sạch tôm, ướp với chút muối và tiêu."),
                StepsModel("2", "Chần bông cải và cà rốt qua nước sôi."),
                StepsModel("3", "Phi thơm tỏi, cho tôm vào xào chín."),
                StepsModel("4", "Thêm bông cải, cà rốt, nêm dầu hào, hạt nêm và xào đều đến khi chín.")
            ),
            category = DishCategory.MON_XAO
        ),
        DishModel(
            dishName = "Gà xào nấm",
            dishImage = R.drawable.dish_image_20,
            ingredients = listOf(
                IngredientModel(R.drawable.ingredient_illus_6, "Tré", "2", "gói"),
                IngredientModel(R.drawable.ingredient_illus_6, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_4, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.ingredient_illus_4, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.ingredient_illus_6, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.ingredient_illus_3, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.ingredient_illus_3, "Đường", "1/2", "thìa cafe"),
            ),
            steps = listOf(
                StepsModel("1", "Ướp thịt gà với nước tương, tiêu, và tỏi băm trong 10 phút."),
                StepsModel("2", "Phi thơm gừng và hành tím, cho gà vào xào chín tái."),
                StepsModel("3", "Thêm nấm, nêm dầu hào, xào đều tay đến khi chín."),
                StepsModel("4", "Rắc tiêu, hành lá, trộn đều rồi tắt bếp.")
            ),
            category = DishCategory.MON_XAO
        )
    )

    fun getAllDishes(): List<DishModel> = dishes

    fun getDishesByCategory(category: DishCategory): List<DishModel> {
        return dishes.filter { it.category == category }
    }
}