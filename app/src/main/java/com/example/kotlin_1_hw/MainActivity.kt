package com.example.kotlin_1_hw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        val LOG_MARKER = "lesson_2_kotlin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animals = listOf(Cat(), Dog())
        for (animal in animals) {
            if (animal is Dog) {
                animal.bite()
            }
            if (animal is Cat) {
                animal.scratch()
            }
            animal.voice()
        }

    }
}