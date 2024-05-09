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
import com.vivekkumar.newbnv.Adapter.RecyclerViewAdapter
import com.vivekkumar.newbnv.Adapter.StoryRecyclerViewAdapter
import com.vivekkumar.newbnv.EditProfileActivity
import com.vivekkumar.newbnv.Model.Data
import com.vivekkumar.newbnv.Model.StoryData
import com.vivekkumar.newbnv.ProfileActivity
import com.vivekkumar.newbnv.R


class HomeFragment : Fragment() {
    private  lateinit var mediaListItem:ArrayList<Data>
    private  lateinit var storyListItem:ArrayList<StoryData>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        val storyRecyclerView = view.findViewById<RecyclerView>(R.id.recyclerStoryView)
        val mediaRecyclerView = view.findViewById<RecyclerView>(R.id.mediaRecyclerView)
        val notification = view.findViewById<ImageView>(R.id.notification)

        notification.setOnClickListener {
            startActivity(Intent(context , ProfileActivity::class.java))
        }

        storyRecyclerView.layoutManager = LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL , false)
        mediaRecyclerView.layoutManager = LinearLayoutManager(context)

        //data class data
        val nameData = arrayOf("One","Two" , "Three" , " Four" , "Five" , "six" , "seven","eight","nine",
            "ten" , "eleven","twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" ,"seventeen","eighteen" ,"nineteen",
            "twenty" , "twentyOne" , "twentyTwo")
        val image = arrayOf(R.drawable.new_pic1 , R.drawable.new_pic2 ,R.drawable.new_pic3 ,R.drawable.new_pic4 ,R.drawable.new_pic5,
            R.drawable.new_pic6 , R.drawable.new_pic7 , R.drawable.new_pic8 ,R.drawable.new_pic9 , R.drawable.new_pic10 , R.drawable.new_pic11,
            R.drawable.new_pic12 ,R.drawable.new_pic13, R.drawable.new_pic14, R.drawable.new_pic15, R.drawable.new_pic16, R.drawable.new_pic17,
            R.drawable.new_pic18 ,R.drawable.new_pic19, R.drawable.new_pic20 , R.drawable.new_pic21 ,R.drawable.new_pic22)

        // initialize ArrayList we created
        mediaListItem = arrayListOf<Data>()
        storyListItem = arrayListOf<StoryData>()


        for(i in image.indices)
        {
            val dataItems = Data(nameData[i] , image[i])
            mediaListItem.add(dataItems)
            val storyItems = StoryData(nameData[i] , image[i])
            storyListItem.add(storyItems)
        }

        mediaRecyclerView.adapter = RecyclerViewAdapter(mediaListItem)
        storyRecyclerView.adapter = StoryRecyclerViewAdapter(storyListItem)





        return view
    }


}