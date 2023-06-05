package com.example.lead_layouting.ui.home.dashboard.banner

import androidx.recyclerview.widget.DiffUtil

class BannerDiffUtil : DiffUtil.ItemCallback<BannerItemModel>() {
    override fun areItemsTheSame(oldItem: BannerItemModel, newItem: BannerItemModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: BannerItemModel, newItem: BannerItemModel): Boolean {
        return oldItem == newItem
    }
}