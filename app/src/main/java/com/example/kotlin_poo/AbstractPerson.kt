package com.example.kotlin_poo

abstract class AbstractPerson {

    var age: Int = 30

    fun displayAge() {
        println("My age is: $age")
    }

    abstract fun displayGreetings()

}