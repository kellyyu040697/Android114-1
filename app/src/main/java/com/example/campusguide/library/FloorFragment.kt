package com.example.campusguide.library

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfinal114_1.R
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView

class FloorFragment : Fragment() {

    companion object {
        private const val ARG_FLOOR_CODE = "arg_floor_code"

        fun newInstance(floorCode: String): FloorFragment {
            val fragment = FloorFragment()
            val args = Bundle()
            args.putString(ARG_FLOOR_CODE, floorCode)
            fragment.arguments = args
            return fragment
        }
    }

    private var floorCode: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        floorCode = arguments?.getString(ARG_FLOOR_CODE)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_floor, container, false)

        val tvFloorTitle = view.findViewById<TextView>(R.id.tvFloorTitle)
        val tvBookCategory = view.findViewById<TextView>(R.id.tvBookCategory)
        val tvFacilities = view.findViewById<TextView>(R.id.tvFacilities)
        val bgImage = view.findViewById<ImageView>(R.id.bgImage)   // ✅ 新增這行，解決紅字

        tvFloorTitle.text = floorCode

        when (floorCode) {
            "B1" -> {
                bgImage.setImageResource(R.drawable.library_basement1)
                tvBookCategory.text = "B1 藏書種類：期刊、報紙、特藏資料..."
                tvFacilities.text = "設備：影印區、倉儲書庫..."
            }
            "1F" -> {
                bgImage.setImageResource(R.drawable.library_floor1)
                tvBookCategory.text = "1F 藏書種類：新書展示、休閒讀物..."
                tvFacilities.text = "設備：借還書櫃台、服務台、自動借書機..."
            }
            "2F" -> {
                bgImage.setImageResource(R.drawable.library_floor2)
                tvBookCategory.text = "2F 藏書種類：中文圖書..."
                tvFacilities.text = "設備：開架閱覽區、自習桌..."
            }
            "3F" -> {
                bgImage.setImageResource(R.drawable.library_floor3)
                tvBookCategory.text = "3F 藏書種類：外文圖書..."
                tvFacilities.text = "設備：多媒體區..."
            }
            "4F" -> {
                bgImage.setImageResource(R.drawable.library_floor4)
                tvBookCategory.text = "4F 藏書種類：研究用書..."
                tvFacilities.text = "設備：研討室..."
            }
            "5F" -> {
                bgImage.setImageResource(R.drawable.library_floor5)
                tvBookCategory.text = "5F 藏書種類：特藏資料..."
                tvFacilities.text = "設備：安靜自習區..."
            }
        }

        return view
    }
}
