package com.example.dayFourKotlinBasics

fun main(){

    val fruitList = mutableListOf("apple",
            "orange","banana","grapes","mango")

    fruitList.add("papaya")
    println(fruitList)
    fruitList.remove("apple")
    println(fruitList)
    val hasPapaya = fruitList.contains("papaya")
    if(hasPapaya){
        println("papaya exist")
    }else{
        println("no papaya")
    }

}