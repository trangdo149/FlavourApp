package com.example.flavourapp.danhmuctimkiem
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flavourapp.activity.Search2
import com.example.flavourapp.databinding.ItemCategoryDanhmucBinding

class DanhMucAdapter(
    private val context: Context,
    private val danhMucList: List<DanhMuc>
) : RecyclerView.Adapter<DanhMucAdapter.DanhMucViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DanhMucViewHolder {
        val binding = ItemCategoryDanhmucBinding.inflate(LayoutInflater.from(context), parent, false)
        return DanhMucViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DanhMucViewHolder, position: Int) {
        val danhMuc = danhMucList[position]
        holder.binding.categoryTitle.text = danhMuc.ten
        holder.binding.categoryImage.setImageResource(danhMuc.hinhAnhResId)
        holder.binding.root.setOnClickListener {
            val intent = Intent(context, Search2::class.java)
            intent.putExtra("CATEGORY_NAME", danhMuc.category.name)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = danhMucList.size

    class DanhMucViewHolder(val binding: ItemCategoryDanhmucBinding) : RecyclerView.ViewHolder(binding.root)

}
