package com.example.kotlin_1_hw

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Random_Range = (0..100).random()
        val pi = 3.14
        Log.d("kotlin_1_lesson", "Random_range value is : $Random_Range")
        val Circle_Area = Random_Range * Random_Range * pi
        val Square_Area = Random_Range * Random_Range
        when (Circle_Area > Square_Area) {
            true -> {
                Log.d("kotlin_1_lesson", "Circle_Area = $Circle_Area")
                Log.d("kotlin_1_lesson", "Square_Area = $Square_Area")
                Log.d("kotlin_1_lesson", "Circle_Area more then Square_Area")
            }
            false -> {
                Log.d("kotlin_1_lesson", "Circle_Area = $Circle_Area")
                Log.d("kotlin_1_lesson", "Square_Area = $Square_Area")
                Log.d("kotlin_1_lesson", "Square_Area more then Circle_Area")
            }

        }
    }
}