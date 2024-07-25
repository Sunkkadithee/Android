package com.pang.rockpaperscissors

fun main(){
    var computerChoice = " "
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

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

        playerChoice == computerChoice -> "Tie" //if the same there is a Tie, Don't have to write all of it waste the time
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("IT's a tie")
    }else if(winner == "Player"){
        println("Player won!")
    }
    else{
        println("Computer won!")
    }
}