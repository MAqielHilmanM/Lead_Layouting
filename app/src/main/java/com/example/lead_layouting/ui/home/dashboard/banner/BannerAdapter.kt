package com.example.lead_layouting.ui.home.dashboard.banner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.lead_layouting.databinding.ItemBannerBinding
import com.example.lead_layouting.databinding.ItemExploreBinding

class BannerAdapter : ListAdapter<BannerItemModel, BannerViewHolder>(
    BannerDiffUtil()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(
            ItemBannerBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}