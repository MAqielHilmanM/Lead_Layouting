package com.example.lead_layouting.ui.home.dashboard.product

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.lead_layouting.databinding.ItemBannerBinding
import com.example.lead_layouting.databinding.ItemProductBinding

class ProductViewHolder(val binding: ItemProductBinding) : ViewHolder(binding.root) {
    fun bind(
        model: ProductItemModel
    ) {
        binding.apply {
            tvName.text = model.title
            Glide.with(binding.root.context)
                .load(model.picture)
                .into(ivImage)
        }

    }
}