package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.StoryData
import com.vivekkumar.newbnv.R
import de.hdodenhof.circleimageview.CircleImageView

class StoryRecyclerViewAdapter(private  val storyDataList: ArrayList<StoryData>) : RecyclerView.Adapter<StoryRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val storyView = LayoutInflater.from(parent.context).inflate(R.layout.story_layout , parent ,false)
        return  ViewHolder(storyView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.storyTitle.text = storyDataList.get(position).storyTitle
        holder.storyPic.setImageResource(storyDataList[position].storyPic)
    }

    override fun getItemCount(): Int {
       return storyDataList.size
    }


    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        val storyTitle: TextView = itemView.findViewById(R.id.storyTitle)
        val storyPic: CircleImageView = itemView.findViewById(R.id.circleStory)
    }
}