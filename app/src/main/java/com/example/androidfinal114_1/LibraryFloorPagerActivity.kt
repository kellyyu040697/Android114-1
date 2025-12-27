package com.example.androidfinal114_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class LibraryFloorPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_floor_pager)

        val viewPager = findViewById<ViewPager2>(R.id.viewPagerFloors)
        val floors = listOf("B1", "1F", "2F", "3F", "4F", "5F")

        // 綁定 Adapter
        viewPager.adapter = FloorPagerAdapter(this, floors)

        // 接收從上一頁傳來的樓層，讓頁面直接跳到該樓層
        val selectedFloor = intent.getStringExtra("selected_floor")
        val startIndex = floors.indexOf(selectedFloor).takeIf { it >= 0 } ?: 0
        viewPager.setCurrentItem(startIndex, false)
    }
}
