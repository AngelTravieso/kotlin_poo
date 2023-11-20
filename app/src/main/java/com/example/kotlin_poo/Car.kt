package com.example.kotlin_poo

class Car(
    var brand :String,
    var year: Int,
    var color: String
) {

    // Attributes - Property
    // variables that belongs to the class
    /*var brand = "Ford"
    var year = 2023
    var color = "Red"*/

    // Constructor


    // Functions - behaviours
    fun drive() {
        println("Driving...")
    }

    fun brake() {
        println("Braking...")
    }

}