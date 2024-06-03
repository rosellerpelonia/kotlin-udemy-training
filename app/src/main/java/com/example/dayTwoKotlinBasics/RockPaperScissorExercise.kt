package com.example.dayTwoKotlinBasics

fun main(){
    var playAgain: Boolean
    do {
        var computerChoice = ""
        var playerChoice = ""
        println("Rock, Paper or Scissors? Enter your choice!")
        playerChoice = readln()
        while (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors"){
            println("Incorrect choice for Rock, Paper or Scissors. Please try again")
            playerChoice = readln()
        }
        val randomNumber = (1..3).random()
        when (randomNumber) {
            1 -> {
                computerChoice = "Rock"
            }

            2 -> {
                computerChoice = "Paper"
            }

            3 -> {
                computerChoice = "Scissors"
            }
        }
        println(computerChoice)

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        if (winner == "Tie") {
            println("Draw!")
        } else{
            println("$winner won!")
        }
        println("Do you want to play again? (yes/no)")
        val response = readln()
        playAgain = response == "yes"
    }while(playAgain)

    println("Thanks for playing!")
}