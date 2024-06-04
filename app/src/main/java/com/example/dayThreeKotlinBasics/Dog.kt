package com.example.dayThreeKotlinBasics

//this is a property
class Dog (val name : String, val breed: String, var age: Int = 0){

    init {
        bark(name)
    }

    //function with parameter
    private fun bark(name: String) {
        println("$name says woof woof")
    }
}