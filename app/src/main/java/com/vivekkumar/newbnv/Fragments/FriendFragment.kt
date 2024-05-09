package com.vivekkumar.newbnv.Fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Adapter.FriendRecylcerView
import com.vivekkumar.newbnv.EditProfileActivity
import com.vivekkumar.newbnv.Model.FriendStatusData
import com.vivekkumar.newbnv.R
import com.vivekkumar.newbnv.SettingsActivity


class FriendFragment : Fragment() {
   private lateinit var followerDataList:ArrayList<FriendStatusData>
   private lateinit var followerRecyclerView : RecyclerView


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_friend, container, false)

        val nameData = arrayOf("One","Two" , "Three" , " Four" , "Five" , "six" , "seven","eight","nine",
            "ten" , "eleven","twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" ,"seventeen","eighteen" ,"nineteen",
            "twenty" , "twentyOne" , "twentyTwo")
        val image = arrayOf(R.drawable.new_pic1 , R.drawable.new_pic2 ,R.drawable.new_pic3 ,R.drawable.new_pic4 ,R.drawable.new_pic5,
            R.drawable.new_pic6 , R.drawable.new_pic7 , R.drawable.new_pic8 ,R.drawable.new_pic9 , R.drawable.new_pic10 , R.drawable.new_pic11,
            R.drawable.new_pic12 ,R.drawable.new_pic13, R.drawable.new_pic14, R.drawable.new_pic15, R.drawable.new_pic16, R.drawable.new_pic17,
            R.drawable.new_pic18 ,R.drawable.new_pic19, R.drawable.new_pic20 , R.drawable.new_pic21 ,R.drawable.new_pic22)
        val statusDistance = arrayOf(
            "16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away",
            "5.5 Km away",
            "15 Km away","16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away",
            "5.5 Km away",
            "15 Km away","16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away",
            "5.5 Km away",
            "15 Km away","16 Km away",
            "4.4 Km away",
            "2.2 Km away",
            "1.1 Km away"

        )

        followerRecyclerView = view.findViewById(R.id.followerReview)
        followerRecyclerView.layoutManager = GridLayoutManager(context , 2 )


        followerDataList = arrayListOf<FriendStatusData>()
        for (i in image.indices )
        {
            val data = FriendStatusData(statusDistance[i] , nameData[i] , image[i])
            followerDataList.add(data)
        }

        followerRecyclerView.adapter = FriendRecylcerView(followerDataList)



        // work on buttons

        val settingBtn = view.findViewById<ImageView>(R.id.settingBtn)
        settingBtn.setOnClickListener {
            startActivity(Intent(context , SettingsActivity::class.java))
        }


        return view
    }

}