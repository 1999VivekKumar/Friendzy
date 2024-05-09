package com.vivekkumar.newbnv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Model.ChatData
import com.vivekkumar.newbnv.R

class ChatRecyclerViewAdpater(private val chatDataList: ArrayList<ChatData>) : RecyclerView.Adapter<ChatRecyclerViewAdpater.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chatting_view , parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatDataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.receiverMessage.text = chatDataList[position].receiverMessage
        holder.senderMessage.text = chatDataList[position].senderMessage

    }

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        val receiverMessage = itemView.findViewById<TextView>(R.id.receive_message)
        val senderMessage = itemView.findViewById<TextView>(R.id.sender_message)

    }


}
