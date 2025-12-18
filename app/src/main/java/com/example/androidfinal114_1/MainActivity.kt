package com.example.androidfinal114_1

import android.content.Intent
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val block1 = findViewById<FrameLayout>(R.id.block1)
        val block2 = findViewById<FrameLayout>(R.id.block2)
        val block3 = findViewById<FrameLayout>(R.id.block3)

        val img1 = findViewById<ImageView>(R.id.img1)
        val img2 = findViewById<ImageView>(R.id.img2)
        val img3 = findViewById<ImageView>(R.id.img3)

        val text1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)
        val text3 = findViewById<TextView>(R.id.text3)

        val blocks = listOf(
            Triple(block1, img1, text1),
            Triple(block2, img2, text2),
            Triple(block3, img3, text3)
        )

        for ((block, image, text) in blocks) {

            block.setOnTouchListener { _, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        text.visibility = View.VISIBLE
                        applyBlur(image)      // 模糊
                        enlarge(image)        // 放大
                    }
                    MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                        text.visibility = View.GONE
                        clearBlur(image)      // 清除模糊
                        resetSize(image)      // 縮回原本大小
                    }
                }
                false
            }
        }

        // 點擊跳轉
        block1.setOnClickListener { startActivity(Intent(this, RoomFloor1Activity::class.java)) }
        block2.setOnClickListener { startActivity(Intent(this, RoomFloor1Activity::class.java)) }
        block3.setOnClickListener { startActivity(Intent(this, RoomFloor1Activity::class.java)) }
    }

    private fun applyBlur(view: ImageView) {
        if (Build.VERSION.SDK_INT >= 31) {
            view.setRenderEffect(
                RenderEffect.createBlurEffect(20f, 20f, Shader.TileMode.CLAMP)
            )
        }
    }

    private fun clearBlur(view: ImageView) {
        if (Build.VERSION.SDK_INT >= 31) {
            view.setRenderEffect(null)
        }
    }

    private fun enlarge(view: View) {
        view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(200).start()
    }

    private fun resetSize(view: View) {
        view.animate().scaleX(1f).scaleY(1f).setDuration(200).start()
    }
}
