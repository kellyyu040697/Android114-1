package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 綁定按鈕
        val btnEnter = findViewById<Button>(R.id.btn_Enter)

        // 設定點擊監聽器
        btnEnter.setOnClickListener {
            // 建立 Intent，從這頁 (this) 跳轉到 GuideActivity
            val intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }
    }
}