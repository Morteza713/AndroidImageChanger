package com.example.imagechanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            this.add(R.id.fragmentContainerView1,fragmentFirst())
            setReorderingAllowed(true)
        }

        supportFragmentManager.commit {
            this.add(R.id.fragmentContainerView2,fragmentSecond())
            setReorderingAllowed(true)
        }

        supportFragmentManager.commit {
            this.add(R.id.fragmentContainerView3,fragmentThird())
            setReorderingAllowed(true)
        }

    }
}