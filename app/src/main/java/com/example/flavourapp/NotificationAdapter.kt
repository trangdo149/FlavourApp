package com.example.flavourapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotificationAdapter(private val notifications: List<NotificationItem>) :
    RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgAvatar: ImageView = itemView.findViewById(R.id.imgAvatar)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvAction: TextView = itemView.findViewById(R.id.tvAction)
        val tvTime: TextView = itemView.findViewById(R.id.tvTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_notification, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = notifications[position]
        holder.tvName.text = item.name
        holder.tvAction.text = item.action
        holder.tvTime.text = item.time
        holder.imgAvatar.setImageResource(item.imageResource)  // Đặt ảnh đúng
    }

    override fun getItemCount(): Int = notifications.size
}
