package com.example.lead_layouting.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ui.setupWithNavController
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.FragmentHomeBinding
import com.example.lead_layouting.ui.home.adapter.HomePagerAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupPager()
    }

    private fun setupPager() {
        binding.apply {
            vpHome.adapter = HomePagerAdapter(childFragmentManager, lifecycle)
            bnvHome.setOnItemSelectedListener {
                when (it.itemId) {
                   R.id.item_dashboard -> {
                       vpHome.currentItem = 0
                       true
                   }
                    R.id.item_explore -> {
                        vpHome.currentItem = 1
                        true
                    }
                    R.id.item_profile -> {
                        vpHome.currentItem = 2
                        true
                    }
                    else -> false
                }
            }

        }
    }
}