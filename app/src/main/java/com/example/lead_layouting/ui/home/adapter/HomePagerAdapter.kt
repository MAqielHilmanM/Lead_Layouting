package com.example.lead_layouting.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lead_layouting.ui.home.dashboard.DashboardFragment
import com.example.lead_layouting.ui.home.explore.ExploreFragment
import com.example.lead_layouting.ui.home.profile.ProfileFragment

class HomePagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> {
                DashboardFragment()
            }
            1 -> {
                ExploreFragment()
            }
            2 -> {
                ProfileFragment()
            }
            else -> {
                ProfileFragment()
            }
        }
    }
}