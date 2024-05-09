package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.ReelData
import com.vivekkumar.newbnv.R

class ReelsRecylerViewAdapter(private val reelsDataList: ArrayList<ReelData>) : RecyclerView.Adapter<ReelsRecylerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reels_view , parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return reelsDataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.reelBackground.setImageResource(reelsDataList[position].reelBackground)
        holder.accountId.text = reelsDataList[position].accountName
    }

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

        val reelBackground = itemView.findViewById<ImageView>(R.id.reelBackgroud)
        val accountId = itemView.findViewById<TextView>(R.id.accountId)

    }


}
