package com.example.flavourapp.danhmuctimkiem
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
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
            Toast.makeText(context, "Updating: ${danhMuc.ten}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = danhMucList.size

    class DanhMucViewHolder(val binding: ItemCategoryDanhmucBinding) : RecyclerView.ViewHolder(binding.root)
}
