package com.example.campusguide.library

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidfinal114_1.R
import android.widget.Button

class LibraryMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_main)

        val btnFloorGuide: Button = findViewById(R.id.btnFloorGuide)
        btnFloorGuide.setOnClickListener {
            val intent = Intent(this, LibraryFloorListActivity::class.java)
            startActivity(intent)
        }
    }
}