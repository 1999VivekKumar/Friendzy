package com.vivekkumar.newbnv.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Adapter.ReelsRecylerViewAdapter
import com.vivekkumar.newbnv.Model.ReelData
import com.vivekkumar.newbnv.R


class ReelsFragment : Fragment() {
    private lateinit var reelsRecyclerView:RecyclerView
    private lateinit var reelsDataList:ArrayList<ReelData>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_reels, container, false)

        // initialize instance variables
        reelsRecyclerView = view.findViewById(R.id.reelRecyclerView)
        reelsRecyclerView.layoutManager = LinearLayoutManager(context)

        reelsDataList = arrayListOf<ReelData>()

        // making data for reelsDataList
        val accountName = arrayOf("@Vivek kumar" , "@Suman Mehra" , "@Isha Malhotra")
        val reelBackground = arrayOf(R.drawable.reel_background , R.drawable.background , R.drawable.reel_background)

        for (i in accountName.indices)
        {
            val data = ReelData(accountName[i] , reelBackground[i])
            reelsDataList.add(data)
        }

        //setting adapter in recycler view of reels_view
        reelsRecyclerView.adapter = ReelsRecylerViewAdapter(reelsDataList)


        return view
    }


}