package com.example.kotlin_poo

fun main() {

    // Create a c1 object of the Car Class
    var c1 = Car("BMW", 2025, "Gray")
    var c2 = Car("Ferrari", 2020, "Red")

    // Access the properties
    /*c1.brand = "BMW"*/
    println(c1.brand)
    println(c2.brand)

    // Access the Functions (Methods)
    c1.drive()

    // a math teacher
    // a football player
    // a businessman

    var p1 = Player("Jhon", 20)
    p1.eat()


}