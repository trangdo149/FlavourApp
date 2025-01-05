package com.example.flavourapp.dish

import com.example.flavourapp.IngredientModel
import com.example.flavourapp.R
import com.example.flavourapp.StepsModel

class DishRepository {

    private val dishes = listOf(
        DishModel(
            dishName = "Tré trộn",
            dishImage = R.drawable.dish_image_1,
            dishDescription = "Tré trộn là món ăn đặc trưng miền Trung, với tré chua dai, trộn cùng rau sống, xoài chua và đậu phộng, tạo hương vị chua cay mặn ngọt hài hòa.",
            ingredients = listOf(
                IngredientModel(R.drawable.tres, "Tré", "2", "gói"),
                IngredientModel(R.drawable.thitheo, "Da heo", "20", "gram"),
                IngredientModel(R.drawable.xoai, "Xoài", "1", "quả"),
                IngredientModel(R.drawable.ot, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.chanh, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.rau, "Rau răm", "2", "gram"),
                IngredientModel(R.drawable.dauphu, "Đậu phộng rang", "20", "gram"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),

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
            dishDescription = "Gà xé trộn rau răm là món ăn gồm gà luộc xé nhỏ trộn với rau răm tươi, hành, ớt và gia vị, mang đến hương vị thơm ngon, tươi mát.",
            ingredients = listOf(
                IngredientModel(R.drawable.thitga, "Thịt gà luộc(đùi hoặc ức)", "300", "gram"),
                IngredientModel(R.drawable.rau, "Rau răm", "1", "bó"),
                IngredientModel(R.drawable.hanhtay, "Hành tây", "1", "củ"),
                IngredientModel(R.drawable.ot, "Ớt", "1", "quả"),
                IngredientModel(R.drawable.chanh, "Chanh", "1", "quả"),
                IngredientModel(R.drawable.toi, "Tỏi", "1", "củ"),
                IngredientModel(R.drawable.muoi, "Muối", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.tieu, "Tiêu", "1/3", "thìa cafe")
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
            dishDescription = "Phở trộn chay là món ăn thanh đạm, kết hợp bánh phở mềm dai với rau củ tươi, nước sốt đậm đà và đậu hũ, mang lại hương vị nhẹ nhàng, bổ dưỡng.",
            ingredients = listOf(
                IngredientModel(R.drawable.photuoi, "Phở tươi", "1", "vắt"),
                IngredientModel(R.drawable.dauphu, "Đậu hũ", "1", "miếng"),
                IngredientModel(R.drawable.sa, "Sả", "1", "cây"),
                IngredientModel(R.drawable.toi, "Tỏi", "4", "tép"),
                IngredientModel(R.drawable.ot, "ớt", "1", "quả"),
                IngredientModel(R.drawable.rau, "Rau sống, rau thơm", "1", "bó"),
                IngredientModel(R.drawable.dualeo, "Dưa leo", "1/2", "quả"),
                IngredientModel(R.drawable.chanh, "Chanh", "1/2", "quả"),
                IngredientModel(R.drawable.nuocmam, "Nước ấm", "5", "thìa cafe"),
                IngredientModel(R.drawable.nuoctuong, "Nước tương", "2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
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
            dishDescription = "Rau quả trộn sốt là món ăn tươi mát, kết hợp đa dạng rau củ và trái cây giòn ngọt, hòa quyện cùng nước sốt đậm đà, thích hợp cho bữa ăn nhẹ hoặc khai vị.",
            ingredients = listOf(
                IngredientModel(R.drawable.rau, "Rau sống", "1/2", "bó"),
                IngredientModel(R.drawable.thanhlong, "Thanh long đỏ", "1/2", "quả"),
                IngredientModel(R.drawable.duahau, "Dưa hấu", "1", "miếng"),
                IngredientModel(R.drawable.duavang, "Dưa vàng", "1", "miếng"),
                IngredientModel(R.drawable.tao, "Táo", "1", "quả"),
                IngredientModel(R.drawable.nuocmam, "Sốt Mayonnaise", "3", "thìa cafe"),
                IngredientModel(R.drawable.dauan, "Mật ong", "1", "thìa cafe"),
                IngredientModel(R.drawable.chanh, "Nước cốt chanh", "1", "quả"),
                IngredientModel(R.drawable.duong, "Đường", "1", "thìa cafe"),
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
            dishDescription = "Cơm trộn rong biển là món ăn thanh đạm, kết hợp cơm nóng dẻo với vị giòn thơm đặc trưng của rong biển, thường được thêm rau củ và gia vị, phù hợp cho bữa ăn nhẹ.",
            ingredients = listOf(
                IngredientModel(R.drawable.batcom, "Cơm nguội", "1", "bát"),
                IngredientModel(R.drawable.rau, "Cải chíp", "2", "cây"),
                IngredientModel(R.drawable.rau, "Rau củ tùy ý", "1", "bát"),
                IngredientModel(R.drawable.thitheo, "Thịt băm rang", "3", "thìa"),
                IngredientModel(R.drawable.kimchi, "Kim chi", "2", "thìa"),
                IngredientModel(R.drawable.nuocmam, "Nước sốt thịt kho", "2", "thìa"),
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
            dishDescription = "Phở gà là món ăn truyền thống của Việt Nam, gồm bánh phở mềm, thịt gà luộc xé sợi, nước dùng trong, thơm, được nấu từ xương gà cùng gia vị như hành, gừng, quế, hoa hồi.",
            ingredients = listOf(
                IngredientModel(R.drawable.thitga, "Gà", "1", "con"),
                IngredientModel(R.drawable.banhpho, "Bánh phở", "1", "kg"),
                IngredientModel(R.drawable.hanh, "Hành củ", "1", "củ"),
                IngredientModel(R.drawable.gung, "Gừng", "1", "củ"),
                IngredientModel(R.drawable.hanh, "Hành tím", "5", "củ"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường phèn", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Muối", "1/2", "thìa cafe"),
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
            dishDescription = "Bún thang là món ăn đặc sản Hà Nội , được nấu với nước dùng trong từ xương gà , ăn kèm thịt gà xé, giò lụa, trứng tráng, tôm khô, và rau thơm.",
            ingredients = listOf(
                IngredientModel(R.drawable.buntuoi, "Bún tươi", "800", "gram"),
                IngredientModel(R.drawable.thitga, "Thịt gà", "400", "gram"),
                IngredientModel(R.drawable.thitheo, "Giò lụa", "200", "gram"),
                IngredientModel(R.drawable.trungga, "Trứng gà", "2", "quả"),
                IngredientModel(R.drawable.tomtuoi, "Tôm khô", "50", "gram"),
                IngredientModel(R.drawable.hanh, "Hành tím", "2", "củ"),
                IngredientModel(R.drawable.gung, "Gừng", "1", "nhánh"),
                IngredientModel(R.drawable.nuocmam, "Mắm tôm", "1", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Muối", "1", "thìa cafe")
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
            dishDescription = "Bún riêu cua là món bún đặc trưng với nước dùng chua thanh từ cua đồng, riêu cua tươi mịn, đậu phụ chiên giòn và các loại rau sống tươi ngon.",
            ingredients = listOf(
                IngredientModel(R.drawable.cuadong, "Cua đồng", "500", "gram"),
                IngredientModel(R.drawable.buntuoi, "Bún tươi", "800", "gram"),
                IngredientModel(R.drawable.cachua, "Cà chua", "4", "quả"),
                IngredientModel(R.drawable.dauphu, "Đậu phụ", "4", "miếng"),
                IngredientModel(R.drawable.hanh, "Hành tím", "2", "củ"),
                IngredientModel(R.drawable.rau, "Hành lá, mùi, tía tô", "150", "gram"),
                IngredientModel(R.drawable.rau, "Me chua", "2", "thìa canh"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Muối", "1", "thìa cafe")
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
            dishName = "Mì bò đài loan",
            dishImage = R.drawable.dish_image_9,
            dishDescription = "Mì bò Đài Loan là món mì đặc sắc với nước dùng đậm đà, được ninh từ xương bò và gia vị, kết hợp với thịt bò mềm, sợi mì dai và các loại rau tươi như hành lá, rau mùi.",
            ingredients = listOf(
                IngredientModel(R.drawable.thitbo, "Thịt bò", "250", "gram"),
                IngredientModel(R.drawable.mi, "Mì tươi", "200", "gram"),
                IngredientModel(R.drawable.cachua, "Cà chua", "1", "quả"),
                IngredientModel(R.drawable.hanhtay, "Hành tây", "1/2", "củ"),
                IngredientModel(R.drawable.gung, "Gừng", "1/2", "nhánh"),
                IngredientModel(R.drawable.toi, "Tỏi", "1/2", "nhánh"),
                IngredientModel(R.drawable.nuoctuong, "Nước tương", "2", "thìa canh"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Muối", "1", "thìa cafe")
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
            dishDescription = "Mì cay jjampong là món mì Hàn Quốc nổi bật với nước dùng đỏ, cay và đậm đà, được nấu từ hải sản, thịt ba chỉ, và rau củ. Sợi mì dai, kết hợp với gia vị Hàn Quốc như tương ớt, tạo nên hương vị thơm ngon, cay nồng đặc trưng.",
            ingredients = listOf(
                IngredientModel(R.drawable.mi, "Mì tươi", "200", "gram"),
                IngredientModel(R.drawable.muc, "Hải sản", "100", "gram"),
                IngredientModel(R.drawable.thitbachi, "Thịt ba chỉ", "100", "gram"),
                IngredientModel(R.drawable.cachua, "Cà chua", "1", "quả"),
                IngredientModel(R.drawable.rau, "Bắp cải", "100", "gram"),
                IngredientModel(R.drawable.nuoctuong, "Nước dùng", "750", "ml"),
                IngredientModel(R.drawable.nuocmam, "Tương ớt Hàn Quốc", "2-3", "thìa canh")
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
            dishDescription = "Món ăn truyền thống thanh mát, kết hợp giữa rau củ, thịt, tôm và bún, chấm nước mắm chua ngọt hoặc tương đậu phộng, thích hợp cho ngày hè",
            ingredients = listOf(
                IngredientModel(R.drawable.banhtrang, "Bánh tráng", "20", "cái"),
                IngredientModel(R.drawable.tomtuoi, "Tôm tươi", "200", "gram"),
                IngredientModel(R.drawable.thitbachi, "Thịt ba chỉ", "300", "gram"),
                IngredientModel(R.drawable.buntuoi, "Bún tươi", "200", "gram"),
                IngredientModel(R.drawable.rau, "Rau xà lách", "200", "gram"),
                IngredientModel(R.drawable.rau, "Rau thơm", "100", "gram"),
                IngredientModel(R.drawable.rau, "Giá", "100", "gram"),
                IngredientModel(R.drawable.dualeo, "Dưa leo", "1", "quả"),
                IngredientModel(R.drawable.he, "Hẹ", "20", "cọng"),
                IngredientModel(R.drawable.hanh, "Hành tím", "1", "củ"),
                IngredientModel(R.drawable.muoi, "Muối", "1/2", "thìa cafe"),
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
            dishDescription = "Bò bía mặn là món ăn vặt đường phố phổ biến, có nguồn gốc từ Trung Quốc, với lớp bánh tráng mềm cuốn nhân tôm khô, trứng, xúc xích, củ sắn xào thơm ngon, ăn kèm nước chấm đậm đà.",
            ingredients = listOf(
                IngredientModel(R.drawable.banhtrang, "Bánh tráng", "20", "cái"),
                IngredientModel(R.drawable.cusan, "Củ sắn", "400", "gram"),
                IngredientModel(R.drawable.carrot, "Cà rốt", "100", "gram"),
                IngredientModel(R.drawable.thitheo, "Lạp xưởng", "200", "gram"),
                IngredientModel(R.drawable.tomtuoi, "Tôm khô", "50", "gram"),
                IngredientModel(R.drawable.trung, "Trứng gà", "3", "quả"),
                IngredientModel(R.drawable.rau, "Rau xà lách", "200", "gram"),
                IngredientModel(R.drawable.hanh, "Hành tím băm", "2", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
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
            dishName = "Bò cuốn lá lốt",
            dishImage = R.drawable.dish_image_13,
            dishDescription = "Bò cuốn lá lốt là món nướng truyền thống, thơm ngon với vị béo của thịt bò hòa quyện hương thơm đặc trưng của lá lốt, thường dùng làm món khai vị hoặc ăn kèm bún.",
            ingredients = listOf(
                IngredientModel(R.drawable.thitbo, "Thịt bò xay", "300", "gram"),
                IngredientModel(R.drawable.lalot, "Lá lốt", "20", "lá"),
                IngredientModel(R.drawable.moheo, "Mỡ heo", "50", "gram"),
                IngredientModel(R.drawable.hanh, "Hành tím băm", "2", "thìa cafe"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "1", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Hạt nêm", "1", "thìa cafe")
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
            dishDescription = "Món ăn truyền thống giòn rụm với nhân thịt và rau củ đậm đà, thích hợp cho bữa tiệc hoặc bữa ăn gia đình",
            ingredients = listOf(
                IngredientModel(R.drawable.banhtrang, "Bánh tráng", "20", "cái"),
                IngredientModel(R.drawable.thitheo, "Thịt heo xay", "200", "gram"),
                IngredientModel(R.drawable.tomtuoi, "Tôm tươi băm nhỏ", "100", "gram"),
                IngredientModel(R.drawable.mienkho, "Miến khô", "50", "gram"),
                IngredientModel(R.drawable.nammeo, "Nấm mèo", "50", "gram"),
                IngredientModel(R.drawable.carrot, "Cà rốt", "100", "gram"),
                IngredientModel(R.drawable.khoaimon, "Khoai môn", "100", "gram"),
                IngredientModel(R.drawable.trung, "Trứng gà", "1", "quả"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Hạt nêm", "1", "thìa cafe")
            ),
            steps = listOf(
                StepsModel("1", "Chuẩn bị nhân: Trộn đều thịt, tôm, miến, nấm mèo, cà rốt, khoai môn, hành tím và gia vị (nước mắm, tiêu, hạt nêm, đường). Thêm trứng để kết dính "),
                StepsModel("2", "Cuốn chả giò: Đặt bánh tráng lên mặt phẳng, cho nhân vào, cuốn tròn, gấp hai mép hai bên và cuộn chặt tay "),
                StepsModel("3", "Chiên chả giò: Đun dầu nóng, chiên chả giò với lửa vừa đến khi vàng giòn, vớt ra để ráo dầu"),
            ),
            category = DishCategory.MON_CUON
        ),
        DishModel(
            dishName = "Nem nướng Nha Trang",
            dishImage = R.drawable.dish_image_15,
            dishDescription = "Món ăn đặc sản nổi tiếng với nem nướng thơm lừng, ăn kèm rau sống, bánh tráng và nước chấm đặc trưng",
            ingredients = listOf(
                IngredientModel(R.drawable.thitheo, "Thịt heo xay", "500", "gram"),
                IngredientModel(R.drawable.moheo, "Mỡ heo", "100", "gram"),
                IngredientModel(R.drawable.botnang, "Bột năng", "1", "thìa canh"),
                IngredientModel(R.drawable.hanh, "Hành tím băm", "1", "thìa cafe"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "2", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.duahau, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Hạt nêm", "1", "thìa cafe")
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
            dishDescription = "Món ăn quen thuộc với hương vị dân dã nhưng không kém phần hấp dẫn. Rau muống giòn xanh hòa quyện với mùi thơm nồng của tỏi phi, mang lại cảm giác thanh mát và dễ ăn.",
            ingredients = listOf(
                IngredientModel(R.drawable.rau, "Rau muống", "300", "gram"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "5", "tép"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Bột ngọt", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Hạt nêm", "1", "thìa cafe")
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
            dishDescription = "Sự kết hợp giữa mực tươi giòn dai và hành tây ngọt nhẹ tạo nên một món ăn hấp dẫn và bổ dưỡng. Hương vị đậm đà của dầu hào và chút cay nhẹ từ tiêu làm tăng thêm phần kích thích vị giác.",
            ingredients = listOf(
                IngredientModel(R.drawable.muc, "Mực tươi", "300", "gram"),
                IngredientModel(R.drawable.hanhtay, "Hành tây", "1", "củ"),
                IngredientModel(R.drawable.gung, "Gừng thái lát", "1/2", "quả"),
                IngredientModel(R.drawable.ot, "Ớt chuông", "1", "quả"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "3", "tép"),
                IngredientModel(R.drawable.dauhao, "Dầu hào", "2", "thìa cafe"),
                IngredientModel(R.drawable.nuocmam, "Nước mắm", "1", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.tieu, "Tiêu xay", "1/2", "thìa cafe")
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
            dishDescription = "Thịt bò mềm mại thấm vị hòa quyện với rau cải ngọt giòn, mang lại hương vị thanh nhẹ nhưng vẫn đủ dinh dưỡng. Vị ngọt tự nhiên từ rau và độ đậm đà của thịt bò tạo nên món ăn hấp dẫn, thích hợp dùng kèm cơm hoặc mì.",
            ingredients = listOf(
                IngredientModel(R.drawable.thitbo, "Thịt bò", "200", "gram"),
                IngredientModel(R.drawable.raucai, "Rau cải ngọt", "1", "bó"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "4", "tép"),
                IngredientModel(R.drawable.dauhao, "Dầu hào", "1", "thìa cafe"),
                IngredientModel(R.drawable.nuoctuong, "Nước tương", "1", "thìa cafe"),
                IngredientModel(R.drawable.duong, "Đường", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.tieu, "Tiêu xay", "1/2", "thìa cafe")
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
            dishDescription = "Món ăn màu sắc tươi sáng với tôm đỏ hồng, bông cải xanh và cà rốt cam rực rỡ. Hương vị ngọt từ tôm và rau củ, kết hợp cùng gia vị đậm đà, mang lại một món ăn không chỉ ngon miệng mà còn tốt cho sức khỏe.",
            ingredients = listOf(
                IngredientModel(R.drawable.tomtuoi, "Tôm tươi (bóc vỏ)", "300", "gram"),
                IngredientModel(R.drawable.bongcaixanh, "Bông cải xanh", "200", "gram"),
                IngredientModel(R.drawable.carrot, "Cà rốt (thái lát)", "1", "củ"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "4", "tép"),
                IngredientModel(R.drawable.dauhao, "Dầu hào", "2", "thìa cafe"),
                IngredientModel(R.drawable.muoi, "Hạt nêm", "1/2", "thìa cafe"),
                IngredientModel(R.drawable.tieu, "Tiêu xay", "1/4", "thìa cafe")
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
            dishDescription = "Món ăn này kết hợp giữa nấm mềm ngọt và thịt gà dai thơm, tạo ra một sự hài hòa cả về hương vị lẫn dinh dưỡng. Gia vị dầu hào và tiêu làm tăng độ đậm đà, phù hợp cho những ai yêu thích các món xào thanh đạm nhưng vẫn hấp dẫn.",
            ingredients = listOf(
                IngredientModel(R.drawable.ucga, "Ức gà (thái lát mỏng)", "300", "gram"),
                IngredientModel(R.drawable.namhuong, "Nấm hương", "200", "gram"),
                IngredientModel(R.drawable.hanh, "Hành tím băm", "1", "thìa cafe"),
                IngredientModel(R.drawable.toi, "Tỏi băm", "3", "tép"),
                IngredientModel(R.drawable.gung, "Gừng thái sợi", "1/2", "củ"),
                IngredientModel(R.drawable.dauhao, "Dầu hào", "2", "thìa cafe"),
                IngredientModel(R.drawable.nuoctuong, "Nước tương", "1", "thìa cafe"),
                IngredientModel(R.drawable.tieu, "Tiêu xay", "1/2", "thìa cafe")
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