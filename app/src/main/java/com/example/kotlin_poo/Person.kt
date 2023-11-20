package com.example.kotlin_poo

// Open for the inheritance, by default classes in kotlin are final
open class Person(var name: String, var age: Int) {
    init {
        println("The Person name: $name")
        println("The Person age: $age")
    }

    fun talk() {
        println("$name is talking")
    }

    fun walking() {
        println("$name is walking")
    }

    fun eat() {
        println("$name is eating")
    }
}