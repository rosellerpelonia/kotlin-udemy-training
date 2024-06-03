package com.example.dayTwoKotlinBasics

fun main(){

    val age = 35

    if(age >= 18){
        println("You can buy alcohol")
    }else if(age <=18){
        println("You cannot buy alcohol")
    }else if(age == 35){
        println("You can buy alcohol")
    }else{
        println("Age not applicable")
    }
}