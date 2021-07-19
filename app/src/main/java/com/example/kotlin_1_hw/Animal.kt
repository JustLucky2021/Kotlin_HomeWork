package com.example.kotlin_1_hw

import android.util.Log

open class Animal(val name: String = "Animal name", val age: Int = 0){
    open fun voice(){
        Log.d("lesson_2_kotlin", "Animal voice must be here")
    }
}