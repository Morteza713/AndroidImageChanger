package com.example.imagechanger

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.random.Random

@SuppressLint("ResourceType")
class fragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val img = view.findViewById<ImageView>(R.id.ivHead)
        img.setOnClickListener {
            var rand = Random.nextInt(12) + 1
            when (rand) {
                1 -> img.setImageResource(R.drawable.head1)
                2 -> img.setImageResource(R.drawable.head2)
                3 -> img.setImageResource(R.drawable.head3)
                4 -> img.setImageResource(R.drawable.head4)
                5 -> img.setImageResource(R.drawable.head5)
                6 -> img.setImageResource(R.drawable.head6)
                7 -> img.setImageResource(R.drawable.head7)
                8 -> img.setImageResource(R.drawable.head8)
                9 -> img.setImageResource(R.drawable.head9)
                10 -> img.setImageResource(R.drawable.head10)
                11 -> img.setImageResource(R.drawable.head11)
                12 -> img.setImageResource(R.drawable.head12)
            }
        }
    }

}