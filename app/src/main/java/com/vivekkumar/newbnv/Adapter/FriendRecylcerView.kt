package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.FriendStatusData
import com.vivekkumar.newbnv.R

class FriendRecylcerView(private  val followerDataList: ArrayList<FriendStatusData>) :RecyclerView.Adapter<FriendRecylcerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.followers_card_view , parent ,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return followerDataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(followerDataList[position].pic)
        holder.statusName.text = followerDataList[position].personName
        holder.distance.text = followerDataList[position].distance

    }

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.findViewById<ImageView>(R.id.followerPic)
        val statusName = itemView.findViewById<TextView>(R.id.statusName)
        val distance = itemView.findViewById<TextView>(R.id.statusDistance)

    }
}