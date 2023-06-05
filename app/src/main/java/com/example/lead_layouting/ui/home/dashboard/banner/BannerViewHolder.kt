package com.example.lead_layouting.ui.home.dashboard.banner

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.lead_layouting.databinding.ItemBannerBinding
import com.example.lead_layouting.databinding.ItemExploreBinding

class BannerViewHolder(val binding: ItemBannerBinding) : ViewHolder(binding.root) {
    fun bind(
        model: BannerItemModel
    ) {
        binding.apply {
            Glide.with(binding.root.context)
                .load(model.picture)
                .fitCenter()
                .into(ivBanner)
        }

    }
}