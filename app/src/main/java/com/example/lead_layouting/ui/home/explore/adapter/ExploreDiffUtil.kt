package com.example.lead_layouting.ui.home.explore.adapter

import androidx.recyclerview.widget.DiffUtil

class ExploreDiffUtil : DiffUtil.ItemCallback<ExploreItemModel>() {
    override fun areItemsTheSame(oldItem: ExploreItemModel, newItem: ExploreItemModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ExploreItemModel, newItem: ExploreItemModel): Boolean {
        return oldItem == newItem
    }
}