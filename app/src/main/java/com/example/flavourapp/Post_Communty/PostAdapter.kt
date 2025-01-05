package com.example.flavourapp.Post_Communty

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flavourapp.R

class PostAdapter(private val posts: List<Post>, private val context: Context) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvUsername: TextView = itemView.findViewById(R.id.tvUsername)
        val tvContent: TextView = itemView.findViewById(R.id.tvContent)
        val ivImage: ImageView = itemView.findViewById(R.id.ivImage)
        val tvLikes: TextView = itemView.findViewById(R.id.tvLikes)
        val tvComments: TextView = itemView.findViewById(R.id.tvComments)
        val tvShares: TextView = itemView.findViewById(R.id.tvShares)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.tvUsername.text = post.username
        holder.tvContent.text = post.content
        holder.tvLikes.text = post.likes
        holder.tvComments.text = post.comments
        holder.tvShares.text = post.shares

        // Kiểm tra nếu imageUrl là drawable hoặc URL
        if (post.imageUrl.startsWith("drawable/")) {
            val resourceId = context.resources.getIdentifier(
                post.imageUrl.replace("drawable/", ""),
                "drawable",
                context.packageName
            )
            holder.ivImage.setImageResource(resourceId)
        } else {
            Glide.with(holder.itemView.context)
                .load(post.imageUrl)
                .placeholder(R.drawable.chef) // Ảnh chờ
                .error(R.drawable.error_image) // Ảnh lỗi
                .into(holder.ivImage)
        }
    }

    override fun getItemCount() = posts.size
}
