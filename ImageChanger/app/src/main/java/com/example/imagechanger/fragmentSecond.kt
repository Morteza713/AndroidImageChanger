package com.example.imagechanger

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.random.Random

@SuppressLint("ResourceType")
class fragmentSecond : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val img = view.findViewById<ImageView>(R.id.ivBody)
        img.setOnClickListener {
            var rand = Random.nextInt(12) + 1
            when (rand) {
                1 -> img.setImageResource(R.drawable.body1)
                2 -> img.setImageResource(R.drawable.body2)
                3 -> img.setImageResource(R.drawable.body3)
                4 -> img.setImageResource(R.drawable.body4)
                5 -> img.setImageResource(R.drawable.body5)
                6 -> img.setImageResource(R.drawable.body6)
                7 -> img.setImageResource(R.drawable.body7)
                8 -> img.setImageResource(R.drawable.body8)
                9 -> img.setImageResource(R.drawable.body9)
                10 -> img.setImageResource(R.drawable.body10)
                11 -> img.setImageResource(R.drawable.body11)
                12 -> img.setImageResource(R.drawable.body12)
            }
        }
    }
}