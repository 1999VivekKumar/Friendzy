package com.vivekkumar.newbnv.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Adapter.DiscoverRecyclerViewAdapter
import com.vivekkumar.newbnv.EditProfileActivity
import com.vivekkumar.newbnv.Model.DiscoverStatusData
import com.vivekkumar.newbnv.R
import com.vivekkumar.newbnv.SecondBnv
import com.vivekkumar.newbnv.SettingsActivity


class DiscoverFragment : Fragment() {
    private lateinit var statusRecylerView: RecyclerView
    private lateinit var statusDataList:ArrayList<DiscoverStatusData>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_discover, container, false)

//        val countrySpinner = view.findViewById<Spinner>(R.id.spinner)
        statusRecylerView = view.findViewById(R.id.discoverStatusRecyclerView)
        val statusDistance = arrayOf(
            "16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away",
            "5.5 Km away",
            "15 Km away",
            "16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away",
            "5.5 Km away",
            "15 Km away",
            "16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away",
            "5.5 Km away",
            "15 Km away",
            "16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away"
        )
        val statusPersonName = arrayOf("One","Two" , "Three" , " Four" , "Five" , "six" , "seven","eight","nine",
            "ten" , "eleven","twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" ,"seventeen","eighteen" ,"nineteen",
            "twenty" , "twentyOne" , "twentyTwo")
        val statusPic = arrayOf(R.drawable.new_pic1 , R.drawable.new_pic2 ,R.drawable.new_pic3 ,R.drawable.new_pic4 ,R.drawable.new_pic5,
            R.drawable.new_pic6 , R.drawable.new_pic7 , R.drawable.new_pic8 ,R.drawable.new_pic9 , R.drawable.new_pic10 , R.drawable.new_pic11,
            R.drawable.new_pic12 ,R.drawable.new_pic13, R.drawable.new_pic14, R.drawable.new_pic15, R.drawable.new_pic16, R.drawable.new_pic17,
            R.drawable.new_pic18 ,R.drawable.new_pic19, R.drawable.new_pic20 , R.drawable.new_pic21 ,R.drawable.new_pic22)

        statusDataList = arrayListOf<DiscoverStatusData>()

        for (index in statusPic.indices) {
            val data =
                DiscoverStatusData(statusDistance[index], statusPersonName[index], statusPic[index])
            statusDataList.add(data)
        }
        statusRecylerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        statusRecylerView.adapter = DiscoverRecyclerViewAdapter(statusDataList)


        val settingBtn = view.findViewById<ImageView>(R.id.settingIcon)
        val searchBtn = view.findViewById<ImageView>(R.id.searchIcon)
        settingBtn.setOnClickListener {
            startActivity(Intent(context , SettingsActivity::class.java))
        }

        return view
    }

}