package com.vivekkumar.newbnv

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.vivekkumar.newbnv.Fragments.ChatFragment
import com.vivekkumar.newbnv.Fragments.VoiceFragment

class SecondBnv : AppCompatActivity() {

    private lateinit var meowNavBar: MeowBottomNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_bnv)

        meowNavBar = findViewById(R.id.meowBottomNavigation)

        meowNavBar.add(MeowBottomNavigation.Model(1 ,  R.drawable.attach_paperclip_symbol  ))
        meowNavBar.add(MeowBottomNavigation.Model(2 ,  R.drawable.baseline_keyboard_voice_24  ))
        meowNavBar.add(MeowBottomNavigation.Model(3 ,  R.drawable.keyboard  ))

        //default fragment
        replaceFragment(VoiceFragment())

        meowNavBar.setOnClickMenuListener {
            when(it.id){
                2 -> replaceFragment(VoiceFragment())
                3 -> replaceFragment(ChatFragment())

            }
        }


    }

    private fun replaceFragment(frag: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameContainer , frag)
            .commit()
    }


}