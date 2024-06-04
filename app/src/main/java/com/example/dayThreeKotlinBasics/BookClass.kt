package com.example.dayThreeKotlinBasics

fun main(){

    var myBook = Book()
    println("${myBook.title} ${myBook.author} ${myBook.yearPublish}")

    var customBook = Book("Superman", "russ", 2024)
    println("${customBook.title} ${customBook.author} ${customBook.yearPublish}")
    println("remake of superman")
    //customBook can be change by using var keyword
    customBook.yearPublish = 2052
    println("${customBook.title} ${customBook.author} ${customBook.yearPublish}")



}