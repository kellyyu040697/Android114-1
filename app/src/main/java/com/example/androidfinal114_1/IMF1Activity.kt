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

        // 1. 左上角的返回按鈕 (保留！)
        // 請確認你的 XML 裡有這個按鈕，id 是 btn_top_back
        findViewById<Button>(R.id.btn_top_back).setOnClickListener {
            finish()
        }

        // --- 底部導覽按鈕 ---
        val btnPrev = findViewById<Button>(R.id.btn_prev_floor)
        val btnHome = findViewById<Button>(R.id.btn_home)
        val btnNext = findViewById<Button>(R.id.btn_next_floor)

        // 上一樓：1F 沒有上一樓，所以禁用
        btnPrev.isEnabled = false

        // 回首頁：回到 MainActivity
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // 清除堆疊，避免按返回鍵又跳回來
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

        // 下一樓：前往 2F (IMF2Activity)
        btnNext.setOnClickListener {
            startActivity(Intent(this, IMF2Activity::class.java))
            finish()
        }

        // ------------------
        // 卡片區 (依照你提供的內容與 ID)

        // 1. IM 101 討論室 (ID: card_im100)
        findViewById<MaterialCardView>(R.id.card_im100).setOnClickListener {
            showDetailDialog(
                title = "IM 101 討論室",
                content = """
                    【容納人數】
                    24人
                    
                    【建置設備】
                    電腦、掃描器、討論桌。
                    
                    【借用規則】
                    1. 提供大學部學生討論與研究學習之用，內有課程相關書藉及課外圖書供學生於課於時間進行閱讀。
                    2. 資管大學部同學直接用學生證刷卡進入(24HR)。
                """.trimIndent()
            )
        }

        // 2. IM 101 專題教室 (ID: card_im101)
        findViewById<MaterialCardView>(R.id.card_im101).setOnClickListener {
            showDetailDialog(
                title = "IM 101 專題教室",
                content = """
                    【容納人數】
                    40人
                    
                    【建置設備】
                    電腦。
                    
                    【借用規則】
                    1. 提供三年級學生進行專題分組究研專用空間，每組提供學生研究專題、系統實驗、測試之專用電腦設備，及可供學生討論專題之空間。
                    2. 資管大學部同學直接用學生證刷卡進入(24HR)。
                """.trimIndent()
            )
        }

        // 3. IM 102 創客基地 (ID: card_im102)
        findViewById<MaterialCardView>(R.id.card_im102).setOnClickListener {
            showDetailDialog(
                title = "IM 102 物聯網微課程創客實作基地",
                content = """
                    【容納人數】
                    30人
                    
                    【建置設備】
                    電腦、投影機、3D印表機、50吋顯示器、音響設備等。
                    
                    【借用規則】
                    1. 提供三年級學生進行專題分組研究。
                    2. 洽系辦公室，限本系師生借用。
                    3. 提供老師開設實作型微型課程，或學生及社團組織舉辦相關高中職營隊活動的空間，並展示學長姐的實作與競賽成果。教室內共有5張討論桌，同學亦可至系辦登記借用。
                """.trimIndent()
            )
        }

        // 4. IM 103 一般教室 (ID: card_im103)
        findViewById<MaterialCardView>(R.id.card_im103).setOnClickListener {
            showDetailDialog(
                title = "IM 103 一般教室",
                content = """
                    【容納人數】
                    55人
                    
                    【建置設備】
                    單槍投影機、電動螢幕、麥克風、擴大機、喇叭、黑板、e化講桌。
                    
                    【借用規則】
                    1. 一般課程教學使用。
                    2. 若需借用請洽系辦公室。
                """.trimIndent()
            )
        }

        // 5. IM 104 專業教室 (ID: card_im104)
        findViewById<MaterialCardView>(R.id.card_im104).setOnClickListener {
            showDetailDialog(
                title = "IM 104 專業教室",
                content = """
                    【容納人數】
                    60人
                    
                    【建置設備】
                    電腦、投影機、音響設備。
                    
                    【借用規則】
                    1. 一般課程教學使用。
                    2. 若需借用請洽系辦公室。
                    3. 階梯式專業教室，共分為三層62個座位，主席桌共5個座位，主要提供碩士班、碩專班、各項活動場地、學生特殊需求使用，每個座位皆有提供插頭，方便相關電子設備使用，本教室搭配有資訊講桌教學設備，以提供完整之教學環境。
                """.trimIndent()
            )
        }

    } // onCreate 結束在這裡

    // showDetailDialog 函式要在 Class 裡面
    private fun showDetailDialog(title: String, content: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(content)
            .setPositiveButton("關閉") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

} // Class 結束在這裡