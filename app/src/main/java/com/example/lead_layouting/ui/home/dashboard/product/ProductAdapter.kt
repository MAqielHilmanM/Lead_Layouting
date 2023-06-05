package com.example.lead_layouting.ui.home.dashboard.product

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.lead_layouting.databinding.ItemBannerBinding
import com.example.lead_layouting.databinding.ItemProductBinding

class ProductAdapter : ListAdapter<ProductItemModel, ProductViewHolder>(
    ProductDiffUtil()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ItemProductBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}