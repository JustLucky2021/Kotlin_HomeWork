package com.example.kotlin_1_hw

import android.util.Log

class Cat: Animal() {
    override fun voice(){
        Log.d("kotlin_lesson_2", "Miay Miay")
    }
    fun scratch (){
        Log.d("kotlin_lesson_2", "This cat scratchs")
    }
}