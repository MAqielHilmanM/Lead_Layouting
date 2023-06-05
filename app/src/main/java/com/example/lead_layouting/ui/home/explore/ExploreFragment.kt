package com.example.lead_layouting.ui.home.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.FragmentExploreBinding
import com.example.lead_layouting.databinding.FragmentProfileBinding
import com.example.lead_layouting.ui.home.explore.adapter.ExploreAdapter
import com.example.lead_layouting.ui.home.explore.adapter.ExploreItemModel


class ExploreFragment : Fragment() {

    private var _binding: FragmentExploreBinding? = null
    val binding get() = _binding!!

    private val mAdapter: ExploreAdapter by lazy {
        ExploreAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentExploreBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        buildDummy()
    }

    private fun buildDummy() {
        val listDummy = arrayListOf<ExploreItemModel>(
            ExploreItemModel("1","Satu","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("2","dua","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("3","tiga","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("4","empat","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("5","lima","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("6","enam","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("7","tujuh","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("8","delapan","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
            ExploreItemModel("9","sembilan","https://static.vecteezy.com/packs/media/vector/hero-800px-cc1b446b.jpg"),
        )
        mAdapter.submitList(listDummy)
    }

    private fun setupRecyclerView() {
        binding.apply {
            rvExplore.layoutManager = LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )
            rvExplore.adapter = mAdapter
        }
    }
}