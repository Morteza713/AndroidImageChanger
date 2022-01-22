package com.example.imagechanger

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.random.Random

@SuppressLint("ResourceType")
class fragmentThird : Fragment(R.layout.fragment_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val img = view.findViewById<ImageView>(R.id.ivLegs)
        img.setOnClickListener {
            var rand = Random.nextInt(12) + 1
            when (rand) {

                1 -> img.setImageResource(R.drawable.legs1)
                2 -> img.setImageResource(R.drawable.legs2)
                3 -> img.setImageResource(R.drawable.legs3)
                4 -> img.setImageResource(R.drawable.legs4)
                5 -> img.setImageResource(R.drawable.legs5)
                6 -> img.setImageResource(R.drawable.legs6)
                7 -> img.setImageResource(R.drawable.legs7)
                8 -> img.setImageResource(R.drawable.legs8)
                9 -> img.setImageResource(R.drawable.legs9)
                10 -> img.setImageResource(R.drawable.legs10)
                11 -> img.setImageResource(R.drawable.legs11)
                12 -> img.setImageResource(R.drawable.legs12)
            }
        }
    }
}