package com.example.kotlin_poo

// Open for the inheritance, by default classes in kotlin are final
open class Person {
    // constructor(name: String, age: Int = 0) {}

    var name: String = "Jack"

    // Is equivalent to:
    get() = field // getter
    set(value) { field = value } // setter

    // Executed when we have crated an object of the class
    /*init {
        println("The Person name: $name")
        println("The Person age: $age")
        println("We used the initializer")
    }

    fun talk() {
        println("$name is talking")
    }

    fun walking() {
        println("$name is walking")
    }

    fun eat() {
        println("$name is eating")
    }*/
}