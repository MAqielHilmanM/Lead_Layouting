package com.example.lead_layouting.ui.home.explore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.lead_layouting.databinding.ItemExploreBinding

class ExploreAdapter : ListAdapter<ExploreItemModel, ExploreViewHolder>(
    ExploreDiffUtil()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        return ExploreViewHolder(
            ItemExploreBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}