package com.example.dayFourKotlinBasics

fun main(){

    //Immutable list - you cannot add items after the initialization
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    //mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    //adding items to list
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(3,"Core i9")
    println(shoppingList)
}