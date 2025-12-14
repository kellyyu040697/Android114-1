package com.example.campusguide.library

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfinal114_1.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FloorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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

        tvFloorTitle.text = floorCode

        when (floorCode) {
            "B1" -> {
                tvBookCategory.text = "B1 藏書種類：期刊、報紙、特藏資料..."
                tvFacilities.text = "設備：影印區、倉儲書庫..."
            }
            "1F" -> {
                tvBookCategory.text = "1F 藏書種類：新書展示、休閒讀物..."
                tvFacilities.text = "設備：借還書櫃台、服務台、自動借書機..."
            }
            "2F" -> {
                tvBookCategory.text = "2F 藏書種類：中文圖書..."
                tvFacilities.text = "設備：開架閱覽區、自習桌..."
            }
            "3F" -> { /* 自己填內容 */ }
            "4F" -> { /* 自己填內容 */ }
            "5F" -> { /* 自己填內容 */ }
        }

        return view
    }
}
