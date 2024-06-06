package com.example.dayThreeKotlinBasics


data class CoffeeDetails(
    val sugarCount : Int,
    val name : String,
    val size : String,
    val creamAmount : Int
)



fun main(){
 val coffeeForRuss = CoffeeDetails(0, "Russ", "xxl", 0)
    makeCoffee(coffeeForRuss)
}

fun askCoffeeDetails(){
        println("Input sugar count")
        val sugarCount = readln().toInt()
        println("Input the name of the coffee owner")
        val name = readln()
        //makeCoffee(sugarCount, name)
    }

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and " +
                "cream : ${coffeeDetails.creamAmount}")
    } else if (coffeeDetails.sugarCount >= 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for  ${coffeeDetails.name}" +
                " and cream : ${coffeeDetails.creamAmount}")
    } else {
        println("Coffee with no sugar for  ${coffeeDetails.name}" +
                " and cream : ${coffeeDetails.creamAmount}")
    }
}
