package com.example.dayThreeKotlinBasics

fun main(){
    println("Input sugar count")
    val sugarCount = readln().toInt()
    println("Input the name of the coffee owner")
    val name = readln()
    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount : Int, name : String){
    if(sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }else if (sugarCount >= 1){
        println("Coffee with $sugarCount spoons of sugar for $name")
    }else {
        println("Coffee with no sugar for $name")
    }
}