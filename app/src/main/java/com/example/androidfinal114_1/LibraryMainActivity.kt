package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LibraryMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_floor_list)

        // 返回按鈕
        findViewById<Button>(R.id.btn_back)?.setOnClickListener {
            finish()
        }

        // 樓層按鈕設定
        val floorButtons = mapOf(
            R.id.btnB1 to "B1",
            R.id.btn1F to "1F",
            R.id.btn2F to "2F",
            R.id.btn3F to "3F",
            R.id.btn4F to "4F",
            R.id.btn5F to "5F"
        )

        for ((id, floorCode) in floorButtons) {
            findViewById<Button>(id)?.setOnClickListener {
                val intent = Intent(this, LibraryFloorPagerActivity::class.java)
                intent.putExtra("selected_floor", floorCode)
                startActivity(intent)
            }
        }
    }
}
