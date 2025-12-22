package com.example.androidfinal114_1


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal114_1.MainActivity

class RoomFloor8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_floor8)

        val prevButton = findViewById<Button>(R.id.prevButton)
        val backButton = findViewById<Button>(R.id.backButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        // 上一樓
        prevButton.setOnClickListener {
            startActivity(Intent(this, RoomFloor7Activity::class.java))
            finish()
        }

        // 返回首頁
        backButton.setOnClickListener {
            startActivity(Intent(this, GuideActivity::class.java))
            finish()
        }

        // 下一樓
        nextButton.setOnClickListener {
            startActivity(Intent(this, RoomFloor9Activity::class.java))
            finish()
        }
    }
}
