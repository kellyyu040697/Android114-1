package com.example.androidfinal114_1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FloorPagerAdapter(activity: FragmentActivity, private val floors: List<String>) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = floors.size

    override fun createFragment(position: Int): Fragment {
        return FloorFragment.newInstance(floors[position])
    }
}
