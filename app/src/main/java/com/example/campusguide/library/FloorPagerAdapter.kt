package com.example.campusguide.library

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FloorPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val floorList: List<String>
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = floorList.size

    override fun createFragment(position: Int): Fragment {
        val floorCode = floorList[position]
        return FloorFragment.newInstance(floorCode)
    }
}
