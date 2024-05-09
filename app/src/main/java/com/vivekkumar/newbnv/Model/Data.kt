package com.vivekkumar.newbnv.Model

data class Data(var name: String, var image: Int)
data class StoryData(var storyTitle:String , var storyPic:Int)
data class ReelData(var accountName:String , var reelBackground:Int)
data class DiscoverStatusData(var distance:String , var personName: String , var pic:Int )
data class FriendStatusData(var distance:String , var personName: String , var pic:Int )
data class ChatListData(var personName: String , var chatTiming: String , var personPic:Int )
data class ProfilePhotosData(var photos: Int)
data class ChatPhotoData(var chatPhotos: Int)
data class ChatData(var receiverMessage:String , var senderMessage:String)

