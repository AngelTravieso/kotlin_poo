package com.example.kotlin_poo

// class CarImpl(override val speedValue: Int): Vehicle {}

class CarImpl():Vehicle {
    override val speedValue: Int = 25
    override fun startEngine(): String {
        return "Starting the engine"
    }
}
