package com.example.kotlinbasics

fun main(){

    var playAgain: Boolean
    do {
        var computerChoice = ""
        var playerChoice = ""

        println("Computer choice for rock, paper, scissor: ")
        val enterChoiceComputer = readln()
        computerChoice = enterChoiceComputer

        println("Player choice for rock, paper, scissor: ")
        val enterChoicePlayer = readln()
        playerChoice = enterChoicePlayer

        if (computerChoice == "rock" && playerChoice == "scissor"
            || computerChoice == "paper" && playerChoice == "rock"
            || computerChoice == "scissor" && playerChoice == "paper"
        ) {
            println("Computer wins!")
        } else if (playerChoice == "rock" && computerChoice == "scissor"
            || playerChoice == "paper" && computerChoice == "rock"
            || playerChoice == "scissor" && computerChoice == "paper"
        ) {
            println("Player wins!")
        } else if (playerChoice == "rock" && computerChoice == "rock"
            || playerChoice == "paper" && computerChoice == "paper"
            || playerChoice == "scissor" && computerChoice == "scissor"
        ) {
            println("Draw!")
        } else {
            println("incorrect value for rock paper and scissor")
        }

        println("Do you want to play again? (yes/no)")
        val response = readln()
        playAgain = response == "yes"
    }while(playAgain)
    println("Thank you for playing!")
}