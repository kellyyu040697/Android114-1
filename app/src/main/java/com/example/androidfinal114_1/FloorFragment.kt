package com.example.androidfinal114_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FloorFragment : Fragment() {
    private var floorCode: String? = null

    companion object {
        fun newInstance(floorCode: String) = FloorFragment().apply {
            arguments = Bundle().apply {
                putString("floor_code", floorCode)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        floorCode = arguments?.getString("floor_code")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_floor, container, false)

        val tvTitle = view.findViewById<TextView>(R.id.tvFloorTitle)
        val tvDesc = view.findViewById<TextView>(R.id.tvBookCategory)
        val tvFacilities = view.findViewById<TextView>(R.id.tvFacilities)
        val tvHint = view.findViewById<TextView>(R.id.tvSwipeHint)
        val imgPhoto = view.findViewById<ImageView>(R.id.imgFloorPhoto)
        val imgMap = view.findViewById<ImageView>(R.id.imgFloorMap)
        val btnBack = view.findViewById<Button>(R.id.btn_back_to_list)

        tvTitle?.text = floorCode
        btnBack?.setOnClickListener { activity?.finish() }

        when (floorCode) {
            "B1" -> {
                tvHint?.text = "← 往右滑前往 1F →"
                tvDesc?.text = "B1 典藏書區、裝訂期刊、閱覽室：\n悅讀室、機械儲存室、一般閱覽室、典藏書區、裝訂期刊區。圖中央為一般閱覽室，其左側為典藏書區、裝訂期刊區，圖右側亦為裝訂期刊區。圖下方為悅讀室及機械儲存室，悅讀室的右側為地下 1 樓的入口。"
                tvFacilities?.text = "【空間名稱】\nB01 一般閱讀室　　B02 悅讀室\nB01a 典藏/期刊　　 B03 機械儲存室\nB01b 典藏書區、裝訂期刊"
                imgPhoto?.setImageResource(R.drawable.library_basement1)
                imgMap?.setImageResource(R.drawable.lib_map_b1)
            }
            "1F" -> {
                tvHint?.text = "← 往左 B1 | 往右 2F →"
                tvDesc?.text = "1F 圖書館、教務處、數位教育發展處、秀德廳：\n包含秀德廳、秘書室、館長室、書香雅集、採編組、主機房、系統組，以及教務處與數位處相關單位。圖中央為挑空區，左側為採編組，右側為教學發展中心，下方為秀德廳。"
                tvFacilities?.text = "【空間名稱】\n101 SNG教室　　101a 活動推廣　　101b 課程發展\n101c 錄音室　　　102 攝影棚　　　103 專業成長室\n104 教發中心　　105 系統組　　　105a 主機房\n111 秀德廳　　　112 館長室　　　114 秘書室\n115 採訪編目組　116 書香雅集"
                imgPhoto?.setImageResource(R.drawable.library_floor1)
                imgMap?.setImageResource(R.drawable.lib_map_1f)
            }
            "2F" -> {
                tvHint?.text = "← 往左 1F | 往右 3F →"
                tvDesc?.text = "2F 參考、檢索、現期期刊、視聽：\n張靜愚先生紀念室、圖書館大廳、資訊共享區、期刊區。圖下方大門為入口，中央為大廳，右側為期刊區，左側為資訊共享區。"
                tvFacilities?.text = "【空間名稱】\n201 紀念室　　　202 大廳　　　　202a 諮詢台\n202b 自助借書　 203 資訊共享區　203a 教科書區\n203b 地圖區　　 203c 討論室　　 203d 資源指導\n204 讀服組　　　205 期刊工作室　206 期刊區\n206a 藍思專區　 206b 常設書展　 206c 閱報區\n206b 視聽區　　 206e 主題書展　 206g 休閒讀物"
                imgPhoto?.setImageResource(R.drawable.library_floor2)
                imgMap?.setImageResource(R.drawable.lib_map_2f)
            }
            "3F" -> {
                tvHint?.text = "← 往左 2F | 往右 4F →"
                tvDesc?.text = "3F 西文圖書：\n西文書庫、全人閱讀區、西文新書展示區、創意學習室、書刊整理室。圖中央為西文新書展示區，上方為全人閱讀區，右下方為創意學習室。"
                tvFacilities?.text = "【空間名稱】\n301 全人閱讀區　　303 新書展示區\n304 創意學習室　　305 書刊整理室"
                imgPhoto?.setImageResource(R.drawable.library_floor3)
                imgMap?.setImageResource(R.drawable.lib_map_3f)
            }
            "4F" -> {
                tvHint?.text = "← 往左 3F | 往右 5F →"
                tvDesc?.text = "4F 中文圖書：\n中文書庫000-499、基督教史料室、明月前身圖書室、中文新書展示區。圖中央為中文新書展示區，下方為中文書庫。"
                tvFacilities?.text = "【空間名稱】\n401 基督教史料室　402 明月前身圖書室\n403 新書展示區"
                imgPhoto?.setImageResource(R.drawable.library_floor4)
                imgMap?.setImageResource(R.drawable.lib_map_4f)
            }
            "5F" -> {
                tvHint?.text = "← 往左滑前往 4F"
                tvDesc?.text = "5F 中文圖書、本校碩博士論文、教師著作：\n中文書庫 500-999、本校博碩士論文、501-512 研讀室。圖中央為挑空區，左右兩側各 6 間研讀室，四周為中文書庫 800 類。"
                tvFacilities?.text = "【空間名稱】\n501-512 研讀室"
                imgPhoto?.setImageResource(R.drawable.library_floor5)
                imgMap?.setImageResource(R.drawable.lib_map_5f)
            }
        }
        return view
    }
}
