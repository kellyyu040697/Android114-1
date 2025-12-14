package com.example.campusguide.library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.androidfinal114_1.R

class LibraryFloorPagerActivity : AppCompatActivity() {

    private val floors = listOf("B1", "1F", "2F", "3F", "4F", "5F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_floor_pager)

        val viewPager = findViewById<ViewPager2>(R.id.viewPagerFloors)

        val adapter = FloorPagerAdapter(this, floors)
        viewPager.adapter = adapter

        val selectedFloor = intent.getStringExtra("selected_floor")
        val startIndex = floors.indexOf(selectedFloor).takeIf { it >= 0 } ?: 1
        viewPager.setCurrentItem(startIndex, false)
    }
}
