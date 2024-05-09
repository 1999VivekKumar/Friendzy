package com.vivekkumar.newbnv.Fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Adapter.ChatListRecyclerView
import com.vivekkumar.newbnv.Adapter.ChatPhotoRecyclerView
import com.vivekkumar.newbnv.Model.ChatListData
import com.vivekkumar.newbnv.Model.ChatPhotoData
import com.vivekkumar.newbnv.R
import com.vivekkumar.newbnv.SecondBnv


class MainChatFragment : Fragment() {

    private lateinit var photoRecyclerView: RecyclerView
    private lateinit var chatListRecyclerView: RecyclerView
    private lateinit var photoListData:ArrayList<ChatPhotoData>
    private lateinit var chatListData:ArrayList<ChatListData>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_chat, container, false)

        // initialize the instance variables
        photoRecyclerView = view.findViewById(R.id.chatPhotoRecyclerView)
        photoRecyclerView.layoutManager = LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL , false)
        chatListRecyclerView = view.findViewById(R.id.chatListRecyclerView)
        chatListRecyclerView.layoutManager = LinearLayoutManager(context)

        chatListData = ArrayList<ChatListData>()
        photoListData = ArrayList<ChatPhotoData>()

        // making data for chat
        val photoList = arrayOf(R.drawable.new_pic1 , R.drawable.new_pic2 ,R.drawable.new_pic3 ,R.drawable.new_pic4 ,R.drawable.new_pic5,
            R.drawable.new_pic6 , R.drawable.new_pic7 , R.drawable.new_pic8 ,R.drawable.new_pic9 , R.drawable.new_pic10 , R.drawable.new_pic11,
            R.drawable.new_pic12 ,R.drawable.new_pic13, R.drawable.new_pic14, R.drawable.new_pic15, R.drawable.new_pic16, R.drawable.new_pic17,
            R.drawable.new_pic18 ,R.drawable.new_pic19, R.drawable.new_pic20 , R.drawable.new_pic21 ,R.drawable.new_pic22)
        val nameList = arrayOf("Vivek kumar" , "Ravi" , "Mohit" , "Mayank" , "Tushar" , "Angel" , "Krishna" , "Isha",
            "Vivek kumar" , "Ravi" , "Mohit" , "Mayank" , "Tushar" , "Angel" , "Krishna" , "Isha",
            "Vivek kumar" , "Ravi" , "Mohit" , "Mayank" , "Tushar" , "Angel")
        val chatTime = arrayOf("09:01" , "08:35" , "07:56" , "09:48" , "04:45" , "02:36" , "01:49"  , "07:40",
            "09:01" , "08:35" , "07:56" , "09:48" , "04:45" , "02:36" , "01:49"  , "07:40",
            "09:01" , "08:35" , "07:56" , "09:48" , "04:45" , "02:36")

        val chatStatusPhoto = arrayOf(R.drawable.new_pic1 , R.drawable.new_pic2 ,R.drawable.new_pic3 ,R.drawable.new_pic4 ,R.drawable.new_pic5,
            R.drawable.new_pic6 , R.drawable.new_pic7 , R.drawable.new_pic8 ,R.drawable.new_pic9 , R.drawable.new_pic10 , R.drawable.new_pic11,
            R.drawable.new_pic12 ,R.drawable.new_pic13, R.drawable.new_pic14, R.drawable.new_pic15, R.drawable.new_pic16, R.drawable.new_pic17,
            R.drawable.new_pic18 ,R.drawable.new_pic19, R.drawable.new_pic20 , R.drawable.new_pic21 ,R.drawable.new_pic22)
        for (i in photoList.indices){
            val data = ChatListData(nameList[i] , chatTime[i] , photoList[i])
            chatListData.add(data)
        }
        for (i in chatStatusPhoto.indices){
            val photoData = ChatPhotoData(chatStatusPhoto[i])
            photoListData.add(photoData)
        }


        // setting adapter for recycler views
        photoRecyclerView.adapter = ChatPhotoRecyclerView(photoListData)
        chatListRecyclerView.adapter = ChatListRecyclerView(chatListData)

        chatListRecyclerView.setOnClickListener {
            startActivity(Intent(context , SecondBnv::class.java))
        }

        return view
    }


}