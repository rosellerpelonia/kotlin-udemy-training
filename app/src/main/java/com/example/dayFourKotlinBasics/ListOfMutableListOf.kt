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

    shoppingList.removeAt(1)

    shoppingList.add(3,"Core i9")

    shoppingList[4] = "Graphics card 9000"

    val hasRam = shoppingList.contains("SSD")

    if(hasRam){
        println("Has SSD in the list")
    }else{
        println("No ram in the list")
    }

    println(shoppingList.size)
    for(index in 0 .. shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")
    }
    println(shoppingList)
}