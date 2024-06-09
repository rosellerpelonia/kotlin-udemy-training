package com.example.dayFourKotlinBasics;

class BankAccount(var accountHolder: String,
                  var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount : Double){
        if(amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")

        }else{
            println("Insufficient funds")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)

        }
    }
}
