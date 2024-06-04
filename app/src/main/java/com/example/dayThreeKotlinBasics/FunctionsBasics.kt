package com.example.dayThreeKotlinBasics

fun main(){

    println("Input your first number")
    val num1 = readln().toDouble()
    println("Input your second number")
    val num2 = readln().toDouble()
//    val total = add(num1,num2)
    val total = divide(num1,num2)

    println("Total: $total")
}

fun divide (num1:Double,num2:Double):Double{
    val result = num1/num2
    return result
}
fun add (num1:Int,num2:Int):Int{
    val result = num1+num2
    return result
}

fun askCoffeeDetails(){
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