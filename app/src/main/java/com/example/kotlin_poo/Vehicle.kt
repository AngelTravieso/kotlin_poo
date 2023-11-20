package com.example.kotlin_poo

interface Vehicle {
    val speedValue: Int
    fun startEngine(): String
    fun accelerate() {
        println("Accelerating...")
    }
}