package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.ProfilePhotosData
import com.vivekkumar.newbnv.R

class ProfilePhotosAdapter(private val photoDataList: ArrayList<ProfilePhotosData>) : RecyclerView.Adapter<ProfilePhotosAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val photo = itemView.findViewById<ImageView>(R.id.profilePagePhotos)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_photo_recycler_card , parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return photoDataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photo.setImageResource(photoDataList[position].photos)
    }

}
