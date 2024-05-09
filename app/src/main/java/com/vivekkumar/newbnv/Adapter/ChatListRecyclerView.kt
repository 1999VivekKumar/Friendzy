package com.vivekkumar.newbnv.Adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.ChatListData
import com.vivekkumar.newbnv.R
import com.vivekkumar.newbnv.SecondBnv

class ChatListRecyclerView(private var chatListData: ArrayList<ChatListData>) : RecyclerView.Adapter<ChatListRecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_list_recycler_view , parent ,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return chatListData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.personName.text = chatListData[position].personName
        holder.chatTime.text = chatListData[position].chatTiming
        holder.chatPersonPic.setImageResource(chatListData[position].personPic)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, SecondBnv::class.java)
            holder.itemView.context.startActivity(intent)
        }

    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val personName = itemView.findViewById<TextView>(R.id.chatPersonName)
        val chatTime = itemView.findViewById<TextView>(R.id.chatTime)
        val chatPersonPic = itemView.findViewById<ImageView>(R.id.chatPic)
        val item = itemView.findViewById<CardView>(R.id.item)

    }

}
