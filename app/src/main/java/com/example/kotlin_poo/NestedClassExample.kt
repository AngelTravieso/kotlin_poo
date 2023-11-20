package com.example.kotlin_poo

fun main() {
    var o1 = Outer()
    println(o1.age)

    var nested = Outer.Nested()
    println(nested.length)
}