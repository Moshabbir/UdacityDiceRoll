package com.example.udacitydice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.udacitydice1.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var ImgView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        ImgView = findViewById(R.id.diseImg)

        binding.rollBtn.setOnClickListener {
            ramdomMethod()
        }
    }

    private fun ramdomMethod() {

        val random = Random.nextInt(6)+1

        binding.apply {

            val randomImg = when(random){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
          }
            ImgView.setImageResource(randomImg)
            textNum.text = random.toString()
        }

    }
}