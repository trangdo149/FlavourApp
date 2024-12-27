package com.example.flavourapp

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpaceItemDecoration(private val space: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = space // Khoảng cách trên
        outRect.bottom = space // Khoảng cách dưới
        outRect.left = space // Khoảng cách trái
        outRect.right = space // Khoảng cách phải
    }
}