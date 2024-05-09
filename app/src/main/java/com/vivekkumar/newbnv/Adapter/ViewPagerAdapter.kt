package com.vivekkumar.newbnv.Adapter

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.vivekkumar.newbnv.Fragments.HomeFragment
import com.vivekkumar.newbnv.Fragments.MainChatFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
     override fun getCount(): Int {
         return 2
     }

     override fun getItem(position: Int): Fragment {
         when(position)
         {
             0 -> return HomeFragment()
             1 -> return MainChatFragment()
         }

         return HomeFragment()
     }

 }
