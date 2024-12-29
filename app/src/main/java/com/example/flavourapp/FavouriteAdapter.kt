package com.example.flavourapp

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip

class FavouriteAdapter(private val favourites: List<FavouriteItem>) :
    RecyclerView.Adapter<FavouriteAdapter.ViewHolder>() {

    // Lớp ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: Chip = itemView.findViewById(R.id.chipName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_favourite, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = favourites[position]
        holder.tvName.text = item.name

        val screenWidth = Resources.getSystem().displayMetrics.widthPixels
        val chipWidth = screenWidth / 5
        holder.tvName.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

    }

    override fun getItemCount(): Int = favourites.size
}
