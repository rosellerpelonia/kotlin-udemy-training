package com.example.dayThreeKotlinBasics

fun main(){
    println("Input sugar count")
    val sugarCount = readln().toInt()
    makeCoffee(sugarCount)
}

fun makeCoffee(sugarCount : Int){
    if(sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar")
    }else if (sugarCount >= 1){
        println("Coffee with $sugarCount spoons of sugar")
    }else {
        println("Coffee with no sugar")
    }
}