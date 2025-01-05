package com.example.flavourapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Post(
    val username: String,
    val postTime: String,
    val content: String,
    val avatarResId: Int,
    val postImageResId: Int,
    val likeCount: String,
    val commentCount: String,
    val shareCount: String
)
class ComAdapter(private val postList: List<Post>) :
    RecyclerView.Adapter<ComAdapter.PostViewHolder>() {

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val avatarImage: ImageView = view.findViewById(R.id.avatarImage)
        val username: TextView = view.findViewById(R.id.username)
        val postTime: TextView = view.findViewById(R.id.posttime)
        val postContent: TextView = view.findViewById(R.id.postContent)
        val postImage: ImageView = view.findViewById(R.id.postImage)
        val likeCount: TextView = view.findViewById(R.id.likeCount)
        val commentCount: TextView = view.findViewById(R.id.commentCount)
        val shareCount: TextView = view.findViewById(R.id.shareCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_com, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = postList[position]
        holder.avatarImage.setImageResource(post.avatarResId)
        holder.username.text = post.username
        holder.postTime.text = post.postTime
        holder.postContent.text = post.content
        holder.postImage.setImageResource(post.postImageResId)
        holder.likeCount.text = post.likeCount
        holder.commentCount.text = post.commentCount
        holder.shareCount.text = post.shareCount
    }

    override fun getItemCount() = postList.size
}