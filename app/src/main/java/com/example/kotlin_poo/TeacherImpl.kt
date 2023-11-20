package com.example.kotlin_poo

class TeacherImpl(name: String): AbstractPerson() {
    override fun displayGreetings() {
        println("Hello Teacher")
    }

}