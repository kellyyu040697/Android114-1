package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class IMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_im)

        // ★★★ 設定返回按鈕 (對應 XML 裡的 btn_back) ★★★
        findViewById<Button>(R.id.btn_back).setOnClickListener {
            // 結束目前頁面，系統會自動回到上一頁 (也就是 GuideActivity)
            finish()
        }

        // 設定樓層按鈕
        findViewById<Button>(R.id.btn_floor1).setOnClickListener {
            startActivity(Intent(this, IMF1Activity::class.java))
        }
        findViewById<Button>(R.id.btn_floor2).setOnClickListener {
            startActivity(Intent(this, IMF2Activity::class.java))
        }
        findViewById<Button>(R.id.btn_floor3).setOnClickListener {
            startActivity(Intent(this, IMF3Activity::class.java))
        }
    }
}
