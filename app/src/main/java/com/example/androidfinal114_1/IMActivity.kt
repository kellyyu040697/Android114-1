package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class IMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_im)

        // 這裡設定三個樓層按鈕...
        findViewById<Button>(R.id.btn_floor1).setOnClickListener {
            startActivity(Intent(this, RoomFloor1Activity::class.java))
        }
        findViewById<Button>(R.id.btn_floor2).setOnClickListener {
            startActivity(Intent(this, RoomFloor2Activity::class.java))
        }
        findViewById<Button>(R.id.btn_floor3).setOnClickListener {
            startActivity(Intent(this, RoomFloor3Activity::class.java))
        }
    }
}