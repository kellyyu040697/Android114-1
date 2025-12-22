package com.example.androidfinal114_1


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal114_1.MainActivity
import com.example.androidfinal114_1.R

class RoomFloor1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_floor1)

        val prevButton = findViewById<Button>(R.id.prevButton)
        val backButton = findViewById<Button>(R.id.backButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        // 上一樓：Floor1沒有上一樓，所以可以禁用或不做事
        prevButton.isEnabled = false

        // 返回首頁
        backButton.setOnClickListener {
            startActivity(Intent(this, GuideActivity::class.java))
            finish()
        }

        // 下一樓
        nextButton.setOnClickListener {
            startActivity(Intent(this, RoomFloor2Activity::class.java))
            finish()
        }
    }
}
