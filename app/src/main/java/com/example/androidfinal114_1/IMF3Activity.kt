package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class IMF3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imf3)
        // 左上角的返回按鈕 (功能：關閉現在頁面，回到上一層選單)
        findViewById<Button>(R.id.btn_top_back).setOnClickListener {
            finish()
        }
        // --- 底部導覽按鈕 ---
        val btnPrev = findViewById<Button>(R.id.btn_prev_floor)
        val btnBackGuide = findViewById<Button>(R.id.btn_back_guide)
        val btnNext = findViewById<Button>(R.id.btn_next_floor)

        // 1. 上一樓：前往 2F (IMF2Activity)
        btnPrev.setOnClickListener {
            startActivity(Intent(this, IMF2Activity::class.java))
            finish()
        }

        // 2. 回導覽頁 (GuideActivity)
        btnBackGuide.setOnClickListener {
            val intent = Intent(this, GuideActivity::class.java)
            // 清除堆疊，直接回到 GuideActivity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }

        // 3. 下一樓：3F 是頂樓，所以禁用
        btnNext.isEnabled = false
        // ------------------

        // 卡片 1: IM 301 IOS 電腦教室
        findViewById<MaterialCardView>(R.id.card_im301).setOnClickListener {
            showDetailDialog(
                title = "IM 301 IOS 電腦教室",
                content = """
                    【容納人數】
                    32人
                    
                    【借用規則】
                    否。課餘時間需經系辦借用程序。
                    
                    【建置設備】
                    iMac電腦主機。
                    
                    【簡介】
                    提供IOS程式設計課程使用，課餘時間經系辦借用程序後，學生可以在教室中進行專案開發使用。
                """.trimIndent()
            )
        }
    }

    private fun showDetailDialog(title: String, content: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(content)
            .setPositiveButton("關閉") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}