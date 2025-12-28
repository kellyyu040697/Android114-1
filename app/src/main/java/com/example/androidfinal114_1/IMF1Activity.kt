package com.example.androidfinal114_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class IMF1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imf1)

        // 左上角的返回按鈕 (功能：關閉現在頁面，回到上一層選單)
        findViewById<Button>(R.id.btn_top_back).setOnClickListener {
            finish()
        }

        // --- 底部導覽按鈕 ---
        val btnPrev = findViewById<Button>(R.id.btn_prev_floor)
        val btnHome = findViewById<Button>(R.id.btn_home)
        val btnNext = findViewById<Button>(R.id.btn_next_floor)

        // 1. 上一樓：1F 沒有上一樓，所以禁用
        btnPrev.isEnabled = false

        // 2. 回首頁：回到 MainActivity
        btnHome.setOnClickListener {
            // 注意：這裡使用 FLAG_ACTIVITY_CLEAR_TOP 確保不會堆疊太多頁面
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // 結束自己
        }

        // 3. 下一樓：前往 2F (IMF2Activity)
        btnNext.setOnClickListener {
            startActivity(Intent(this, IMF2Activity::class.java))
            finish() // 選擇性：如果你希望按返回鍵能回到 1F，就把這行拿掉；如果希望直接切換不留紀錄，就保留。
        }
        // ------------------

        // 卡片點擊事件 (保持不變)
        findViewById<MaterialCardView>(R.id.card_im101_discuss).setOnClickListener {
            showDetailDialog(
                title = "IM 101 討論室",
                content = """
                    【容納人數】
                    24人
                    
                    【借用規則】
                    資管大學部同學直接用學生證刷卡進入(24HR)。
                    
                    【建置設備】
                    電腦、掃描器、討論桌。
                    
                    【簡介】
                    提供大學部學生討論與研究學習之用，內有課程相關書籍及課外圖書供學生於課餘時間進行閱讀。
                """.trimIndent()
            )
        }

        findViewById<MaterialCardView>(R.id.card_im101_project).setOnClickListener {
            showDetailDialog(
                title = "IM 101 專題教室",
                content = """
                    【容納人數】
                    40人
                    
                    【借用規則】
                    所屬空間專題生使用學生證刷卡進出。
                    
                    【建置設備】
                    電腦。
                    
                    【簡介】
                    提供三年級學生進行專題分組研究專用空間，每組提供學生研究專題、系統實驗、測試之專用電腦設備，及可供學生討論專題之空間。
                """.trimIndent()
            )
        }

        findViewById<MaterialCardView>(R.id.card_im102).setOnClickListener {
            showDetailDialog(
                title = "IM 102 創客實作基地",
                content = """
                    【容納人數】
                    30人
                    
                    【借用規則】
                    洽系辦公室，限本系師生借用。
                    
                    【建置設備】
                    電腦、投影機、3D印表機、50吋顯示器、音響設備等。
                    
                    【簡介】
                    提供老師開設實作型微型課程，或學生及社團組織舉辦相關高中職營隊活動的空間，並展示學長姐的實作與競賽成果。教室內共有5張討論桌，同學亦可至系辦登記借用。
                """.trimIndent()
            )
        }

        findViewById<MaterialCardView>(R.id.card_im104).setOnClickListener {
            showDetailDialog(
                title = "IM 104 專業教室",
                content = """
                    【容納人數】
                    60人
                    
                    【借用規則】
                    洽系辦公室，限本系師生借用。
                    
                    【建置設備】
                    電腦、投影機、音響設備。
                    
                    【簡介】
                    階梯式專業教室，共分為三層62個座位，主席桌共5個座位，主要提供碩士班、碩專班、各項活動場地、學生特殊需求使用。每個座位皆有提供插頭，方便相關電子設備使用，本教室搭配有資訊講桌教學設備，以提供完整之教學環境。
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