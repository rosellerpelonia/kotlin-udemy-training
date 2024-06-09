package com.example.dayFourKotlinBasics

fun main(){

    val russBankAccount = BankAccount("Russ", 500.00)

    println(russBankAccount.accountHolder + " remaining balance: $" + russBankAccount.balance)
    russBankAccount.deposit(200.5)
    russBankAccount.withdraw(500.0)
    russBankAccount.displayTransactionHistory()

    println(russBankAccount.accountHolder + " remaining balance: $" + russBankAccount.balance)
}