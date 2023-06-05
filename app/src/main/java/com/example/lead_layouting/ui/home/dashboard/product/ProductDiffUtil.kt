package com.example.lead_layouting.ui.home.dashboard.product

import androidx.recyclerview.widget.DiffUtil

class ProductDiffUtil : DiffUtil.ItemCallback<ProductItemModel>() {
    override fun areItemsTheSame(oldItem: ProductItemModel, newItem: ProductItemModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ProductItemModel, newItem: ProductItemModel): Boolean {
        return oldItem == newItem
    }
}