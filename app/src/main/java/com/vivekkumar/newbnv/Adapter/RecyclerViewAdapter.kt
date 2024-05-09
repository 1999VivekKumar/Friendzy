package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.Data
import com.vivekkumar.newbnv.R

class RecyclerViewAdapter(private val dataListItems: ArrayList<Data>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val reelCard = LayoutInflater.from(parent.context).inflate(R.layout.reel_card_view , parent , false)
        return ViewHolder(reelCard)
    }

    override fun getItemCount(): Int {
        return dataListItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentPosition = dataListItems[position]
        holder.personName.text = currentPosition.name
        holder.reelImage.setImageResource(currentPosition.image)
    }


    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        val personName: TextView = itemView.findViewById<TextView>(R.id.personName)
        val reelImage: ImageView = itemView.findViewById<ImageView>(R.id.image)
        
        
    }
}