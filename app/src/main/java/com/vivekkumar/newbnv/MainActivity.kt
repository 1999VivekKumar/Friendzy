package com.vivekkumar.newbnv

import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.vivekkumar.newbnv.Adapter.ViewPagerAdapter
import com.vivekkumar.newbnv.Fragments.DiscoverFragment
import com.vivekkumar.newbnv.Fragments.FriendFragment
import com.vivekkumar.newbnv.Fragments.HomeFragment
import com.vivekkumar.newbnv.Fragments.MainChatFragment
import com.vivekkumar.newbnv.Fragments.ProfileFragment
import com.vivekkumar.newbnv.Fragments.ReelsFragment
import com.vivekkumar.newbnv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // ViewPager initializing
        val viewPager = binding.viewPager
        viewPager.adapter  = ViewPagerAdapter(supportFragmentManager)

        val navView: BottomNavigationView = binding.navView

        //default fragment on screen
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.frameLayout  , HomeFragment())
        ft.commit()

        navView.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.homeIcon -> {
                    replaceFrameWithFragment(HomeFragment())
                    binding.frameLayout.visibility = FrameLayout.INVISIBLE
                    true
                }
                R.id.discoverIcon -> {
                    replaceFrameWithFragment(DiscoverFragment())
                    true
                }
                R.id.addIcon -> {
                    replaceFrameWithFragment(ReelsFragment())
                    true
                }
                R.id.friendsIcon -> {
                    replaceFrameWithFragment(FriendFragment())
                    true
                }
                R.id.profileIcon -> {
                    replaceFrameWithFragment(ProfileFragment())
                    true
                }

                else -> false
            }
        }


    }

    private fun replaceFrameWithFragment(frag: Fragment) {
        binding.frameLayout.visibility = FrameLayout.VISIBLE
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.frameLayout  , frag)
        ft.commit()
    }
}