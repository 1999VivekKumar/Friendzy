package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.ChatPhotoData
import com.vivekkumar.newbnv.R

class ChatPhotoRecyclerView(private val photoListDatas: ArrayList<ChatPhotoData>) : RecyclerView.Adapter<ChatPhotoRecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_photo_recycler_view , parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return photoListDatas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photoStatus.setImageResource(photoListDatas[position].chatPhotos)
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val photoStatus: ImageView = itemView.findViewById(R.id.chatPhoto)
    }

}
