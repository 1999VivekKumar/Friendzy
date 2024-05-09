package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.DiscoverStatusData
import com.vivekkumar.newbnv.R

class DiscoverRecyclerViewAdapter(private val statusDataList: ArrayList<DiscoverStatusData>) : RecyclerView.Adapter<DiscoverRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.discover_status_view , parent ,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return statusDataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.statusPic.setImageResource(statusDataList[position].pic)
        holder.statusDistance.text = statusDataList[position].distance
        holder.statusName.text = statusDataList[position].personName
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val statusPic: ImageView = itemView.findViewById(R.id.statusPic)
        val statusDistance: TextView = itemView.findViewById(R.id.statusDistance)
        val statusName: TextView = itemView.findViewById(R.id.statusName)

    }

}
