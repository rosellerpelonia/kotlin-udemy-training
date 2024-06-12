package com.example.dayFourKotlinBasics

fun main(){

    val sarahBankAccount = BankAccount("Sarah", 0.0)

    println(sarahBankAccount.accountHolder + " remaining balance: $" + sarahBankAccount.acctBalance())
    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdraw(10.00)
    sarahBankAccount.deposit(300.00)
    sarahBankAccount.displayTransactionHistory()

    println(sarahBankAccount.accountHolder + " remaining balance: $" + sarahBankAccount.acctBalance())
}