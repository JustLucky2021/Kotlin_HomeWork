package com.example.kotlin_1_hw

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


fun generateRandomAge(minAge: Int, maxAge: Int): Int{
    val randomAge = (minAge..maxAge).random()
    return randomAge
}

fun List<String>.random(): String {
    val randomIndex = (0..this.lastIndex).random()
    return this[randomIndex]
}


class MainActivity : AppCompatActivity() {
    companion object {
        val LOG_MARKER = "lesson_2_kotlin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listOfNames = listOf<String>("Денис", "Ирина", "Татьна", "Дмитрий", "Светозар",
                                          "Елена", "Николай", "Лидия", "Надежда", "Александр");
        //val somePerson1 = Person(name = listOfNames.random(), age = generateRandomAge(20, 40))
        val personList = mutableListOf<Person>()
        for (i in 0..10){
            personList.add(Person(name = listOfNames.random(), age = generateRandomAge(minAge = 18, maxAge = 55)))
        }
        //Log.d("$LOG_MARKER", "$personList")
        personList.toList()
        personList.forEach{ Log.d("$LOG_MARKER",  "${personList.indexOf(it)}  $it ")}
        val personListFilter = personList.filter{it.age in 18..40}
        Log.d("$LOG_MARKER", "--------------------------------------------------")
        personListFilter.forEach{ Log.d("$LOG_MARKER",  "${personListFilter.indexOf(it)}  $it ")}
        val personInCurrentAge = personList.find { it.age == 32 }
        if(personInCurrentAge !== null)
            Log.d("$LOG_MARKER", "personInCurrent")
        else
            Log.d("$LOG_MARKER", "Person in current range didn't find.")
    }
}