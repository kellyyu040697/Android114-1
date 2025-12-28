package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class IMF2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imf2)

        // 左上角返回 (關閉當前頁面)
        findViewById<Button>(R.id.btn_top_back).setOnClickListener {
            finish()
        }

        // --- 底部導覽按鈕 ---
        val btnPrev = findViewById<Button>(R.id.btn_prev_floor)
        val btnHome = findViewById<Button>(R.id.btn_home)
        val btnNext = findViewById<Button>(R.id.btn_next_floor)

        // 1. 上一樓：前往 1F (IMF1Activity)
        btnPrev.setOnClickListener {
            startActivity(Intent(this, IMF1Activity::class.java))
            finish() // 結束自己，避免頁面堆疊
        }

        // 2. 回首頁
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

        // 3. 下一樓：前往 3F (IMF3Activity)
        btnNext.setOnClickListener {
            startActivity(Intent(this, IMF3Activity::class.java))
            finish()
        }
        // ------------------

        // 卡片 1: IM 201 專業電腦教室
        findViewById<MaterialCardView>(R.id.card_im201).setOnClickListener {
            showDetailDialog(
                title = "IM 201 專業電腦教室",
                content = """
                    【容納人數】
                    75人
                    
                    【借用規則】
                    課餘時間提供本系大學部學生自由刷卡進入。
                    
                    【建置設備】
                    75台個人電腦(Windows 10)、教學廣播系統、投影機、音響設備。
                    
                    【簡介】
                    可提供全系學生於課程教學、作業討論、專題實驗、及各項系統測試之使用。
                """.trimIndent()
            )
        }

        // 卡片 2: IM 203 會議室
        findViewById<MaterialCardView>(R.id.card_im203).setOnClickListener {
            showDetailDialog(
                title = "IM 203 會議室",
                content = """
                    【容納人數】
                    25人
                    
                    【借用規則】
                    洽系辦公室。
                    
                    【建置設備】
                    電腦、投影機。
                    
                    【簡介】
                    U字型會議桌，以提供課程、會議中能夠有良好的討論交流環境。
                """.trimIndent()
            )
        }

        // 卡片 3: IM 205 討論室
        findViewById<MaterialCardView>(R.id.card_im205).setOnClickListener {
            showDetailDialog(
                title = "IM 205 討論室",
                content = """
                    【容納人數】
                    15人
                    
                    【借用規則】
                    洽系辦公室。
                    
                    【建置設備】
                    投影機設備。
                    
                    【簡介】
                    定位為老師與學生間，進行課業、訪談、交流之討論室，以四色座椅方式，可給學生進行分組討論。
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