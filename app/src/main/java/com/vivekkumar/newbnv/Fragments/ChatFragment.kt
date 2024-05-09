package com.vivekkumar.newbnv.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekkumar.newbnv.Adapter.ChatRecyclerViewAdpater
import com.vivekkumar.newbnv.Model.ChatData
import com.vivekkumar.newbnv.R


class ChatFragment : Fragment() {
    private lateinit var chatRecyclerView:RecyclerView
    private lateinit var chatDataList:ArrayList<ChatData>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        // initialize the instance variables
        chatRecyclerView = view.findViewById(R.id.chatRecyclerView)
        chatRecyclerView.layoutManager = LinearLayoutManager(context)

        chatDataList = ArrayList<ChatData>()

        // making data for chat list
        val receiverMessages = arrayOf("Hi Vivek! how are you"  , "I am fine , what are you doing?" , "lets make a food order")
        val senderMessages = arrayOf("I am fine you say" , "I am working with Webistic.in" , "yeah That's good idea")
        for (i in senderMessages.indices)
        {
            val data = ChatData(receiverMessages[i] , senderMessages[i])
            chatDataList.add(data)
        }

        // setting adapter in recycler view
        chatRecyclerView.adapter = ChatRecyclerViewAdpater(chatDataList)
        return view
    }


}