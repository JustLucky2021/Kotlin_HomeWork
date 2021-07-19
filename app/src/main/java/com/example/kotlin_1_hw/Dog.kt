package com.example.kotlin_1_hw

import android.util.Log

class Dog: Animal() {
    override fun voice() {
        Log.d("kotlin_lesson_2", "Gav Gav")
    }
    fun bite(){
        Log.d("kotlin_lesson_2", "This Dog bites")
    }
}