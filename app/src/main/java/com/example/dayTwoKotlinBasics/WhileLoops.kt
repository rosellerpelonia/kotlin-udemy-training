package com.example.dayTwoKotlinBasics

fun main(){

    var userInput = readln()
    while(userInput == "1"){
        println("While loop executed")
        userInput = readln()
    }
    println("loop is done")
}