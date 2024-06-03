package com.example.dayTwoKotlinBasics

fun main(){

    var age = 0

    println("Please enter you age: ")
    val enteredValue = readln()
    age = enteredValue.toInt()


    if(age >= 18){
        println("You can buy cigarettes")
    }else{
        println("You cannot buy cigarettes")
    }

}