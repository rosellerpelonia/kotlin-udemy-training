package com.example.kotlinbasics

fun main(){

    var age = 0

    println("Please enter your age:")
    val enterAge = readln()
    age = enterAge.toInt()

    if(age >= 18 && age < 40){
        println("You can enter the club.")
    }else if(age >= 40){
        println("You cannot go into the club, please go home.")
    }else{
        println("Age not verified. Please contact support.")
    }
}