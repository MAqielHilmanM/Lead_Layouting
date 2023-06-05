package com.example.lead_layouting.ui.home.explore.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.lead_layouting.databinding.ItemExploreBinding

class ExploreViewHolder(val binding: ItemExploreBinding) : ViewHolder(binding.root) {
    fun bind(
        model: ExploreItemModel
    ) {
        binding.apply {
            tvName.text = model.title
            Glide.with(binding.root.context)
                .load(model.picture)
                .into(ivImage)
        }

    }
}