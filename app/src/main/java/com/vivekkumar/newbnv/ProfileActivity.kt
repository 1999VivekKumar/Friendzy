package com.vivekkumar.newbnv

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Adapter.ProfilePhotosAdapter
import com.vivekkumar.newbnv.Model.ProfilePhotosData


class ProfileActivity : AppCompatActivity() {

    private lateinit var photoRecyclerView: RecyclerView
    private lateinit var photoDataList:ArrayList<ProfilePhotosData>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        // initialize the instance variables
        photoRecyclerView = findViewById(R.id.profileRecyclerView)
        photoRecyclerView.layoutManager = GridLayoutManager(this , 3)

        photoDataList = arrayListOf<ProfilePhotosData>()

        // making the data of photos for recycler view
        val photosData = arrayOf(R.drawable.new_pic1 , R.drawable.new_pic2 ,R.drawable.new_pic3 ,R.drawable.new_pic4 ,R.drawable.new_pic5,
            R.drawable.new_pic6 , R.drawable.new_pic7 , R.drawable.new_pic8 ,R.drawable.new_pic9 , R.drawable.new_pic10 , R.drawable.new_pic11,
            R.drawable.new_pic12 ,R.drawable.new_pic13, R.drawable.new_pic14, R.drawable.new_pic15, R.drawable.new_pic16, R.drawable.new_pic17,
            R.drawable.new_pic18 ,R.drawable.new_pic19, R.drawable.new_pic20 , R.drawable.new_pic21 ,R.drawable.new_pic22)
        for (i in photosData.indices) {
            val data = ProfilePhotosData(photosData[i])
            photoDataList.add(data)
        }

        // setting recycler view adapter
        photoRecyclerView.adapter = ProfilePhotosAdapter(photoDataList)


        // button work
        val messageBtn = findViewById<TextView>(R.id.messageBtn)
        messageBtn.setOnClickListener {
            startActivity(Intent(this , SecondBnv::class.java))
        }

    }
}