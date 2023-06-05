package com.example.lead_layouting.ui.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.FragmentDashboardBinding
import com.example.lead_layouting.databinding.FragmentProfileBinding
import com.example.lead_layouting.ui.home.dashboard.banner.BannerAdapter
import com.example.lead_layouting.ui.home.dashboard.banner.BannerItemModel
import com.example.lead_layouting.ui.home.dashboard.product.ProductAdapter
import com.example.lead_layouting.ui.home.dashboard.product.ProductItemModel
import com.example.lead_layouting.ui.home.explore.adapter.ExploreItemModel

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    val binding get() = _binding!!

    private val mBannerAdapter : BannerAdapter by lazy {
        BannerAdapter()
    }

    private val mProductAdapter : ProductAdapter by lazy {
        ProductAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDashboardBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupAdapter()
        buildDummyBanner()
        buildDummyProduct()
    }

    private fun buildDummyBanner() {
        val listDummyBanner = listOf(
            BannerItemModel("1", "https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            BannerItemModel("2", "https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
        )
        mBannerAdapter.submitList(listDummyBanner)
    }
    private fun buildDummyProduct() {
        val listDummyProduct = listOf(
            ProductItemModel("1","Satu","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("2","dua","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("3","tiga","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("4","empat","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("5","lima","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("6","enam","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("7","tujuh","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("8","delapan","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ProductItemModel("9","sembilan","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
        )
        mProductAdapter.submitList(listDummyProduct)
    }

    private fun setupAdapter() {
        binding.apply {
            rvDashboard.layoutManager = LinearLayoutManager(requireContext())
            rvDashboard.adapter = ConcatAdapter(
                mBannerAdapter,
                mProductAdapter
            )
        }
    }
}