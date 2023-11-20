package com.example.kotlin_poo

// Open for the inheritance and override, by default classes in kotlin are final
open class Person {
    // constructor(name: String, age: Int = 0) {}

    // By default is public
    open var name: String = "Jack"                 // public
    private var age: Int = 2                       // private
    protected open var hairColor = "Black"         // protected
    internal var d = 6                             // internal

}