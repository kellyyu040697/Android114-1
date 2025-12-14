package com.example.campusguide.library

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal114_1.R

class LibraryFloorListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_floor_list)

        setupFloorButton(R.id.btnB1, "B1")
        setupFloorButton(R.id.btn1F, "1F")
        setupFloorButton(R.id.btn2F, "2F")
        setupFloorButton(R.id.btn3F, "3F")
        setupFloorButton(R.id.btn4F, "4F")
        setupFloorButton(R.id.btn5F, "5F")
    }

    private fun setupFloorButton(buttonId: Int, floorCode: String) {
        val btn = findViewById<Button>(buttonId)
        btn.setOnClickListener {
            val intent = Intent(this, LibraryFloorPagerActivity::class.java)
            intent.putExtra("selected_floor", floorCode)
            startActivity(intent)
        }
    }
}
