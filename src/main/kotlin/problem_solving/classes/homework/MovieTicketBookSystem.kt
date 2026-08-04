package org.example.problem_solving.classes.homework



class Movie {
    var movieId = 0
    var movieName = ""
    var language = ""
    var ticketPrice = 0
    var availableSeats = 0

    fun movieDetails() {
        println("Movie ID        : $movieId")
        println("Movie Name      : $movieName")
        println("Language        : $language")
        println("Ticket Price    : $ticketPrice")
        println("Available Seats : $availableSeats")

    }

    fun getUserInput(): UserInput {
        val userInput = UserInput()
        print("Enter Movie ID: ")
         userInput.movieID = readln().toInt()
        print("Enter the number of tickets: ")
       userInput.ticketCount = readln().toInt()
        return userInput
    }

    fun bookTicket(ticketCount: Int) {
        if (ticketCount > availableSeats) {
            println("Booking Failed!")
            println("Not enough seats available.")
        }else if(ticketCount==0) {
            println("Invalid Number")
        }
        else {

            availableSeats = availableSeats - ticketCount

            val ticketAmount = ticketCount * ticketPrice

            println("Booking Successful!")
            println("Movie Name       : $movieName")
            println("Tickets Booked   : $ticketCount")
            println("Ticket Price     : ₹$ticketPrice")
            println("Total Amount     : ₹$ticketAmount")
            println("Remaining Seats  : $availableSeats")
        }

    }

    fun cancelTicket(ticketCount: Int) {
        if (ticketCount <= availableSeats && ticketCount!=0) {
            availableSeats = availableSeats + ticketCount
            println("Tickets Cancelled Successfully!")
            println("Available Seats : $availableSeats")
        } else {
            println("Invalid attempt")

        }
    }
}
    fun main() {

        val listOfMovies = arrayOf(Movie(),Movie(),Movie())
        listOfMovies[0].movieId = 1
        listOfMovies[0].movieName = "Leo"
        listOfMovies[0].language = "Tamil"
        listOfMovies[0].ticketPrice = 200
        listOfMovies[0].availableSeats = 50

        listOfMovies[1].movieId = 2
        listOfMovies[1].movieName = "Avengers"
        listOfMovies[1].language = "English"
        listOfMovies[1].ticketPrice = 300
        listOfMovies[1].availableSeats = 35

        listOfMovies[2].movieId = 3
        listOfMovies[2].movieName = "Vikram"
        listOfMovies[2].language = "Tamil"
        listOfMovies[2].ticketPrice = 250
        listOfMovies[2].availableSeats = 40

        menu(listOfMovies[0], listOfMovies[1], listOfMovies[2])

    }

class UserInput{
    var movieID = 0
    var ticketCount = 0
}

fun menu(movie1: Movie,movie2 : Movie, movie3 : Movie ){
    while (true) {
        println("======================================")
        println("         Movie Ticket Booking")
        println("======================================")
        println()
        println("1. View All Movies")
        println("2. Book Ticket")
        println("3. Cancel Ticket")
        println("4. Exit")
        println()
        println("---------------------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
                println("======================================")
                movie1.movieDetails()
                println("======================================")
                movie2.movieDetails()
                println("======================================")
                movie3.movieDetails()
                println("======================================")
            }

            2 -> {
                val userInput = movie1.getUserInput()
                when (userInput.movieID) {
                    1 -> movie1.bookTicket(userInput.ticketCount)
                    2 -> movie2.bookTicket(userInput.ticketCount)
                    3 -> movie3.bookTicket(userInput.ticketCount)
                    else -> println("Invalid Movie ID")
                }
            }

            3 -> {
                val userInput = movie1.getUserInput()
                when (userInput.movieID) {
                    1 -> movie1.cancelTicket(userInput.ticketCount)
                    2 -> movie2.cancelTicket(userInput.ticketCount)
                    3 -> movie3.cancelTicket(userInput.ticketCount)
                    else -> println("Invalid Movie ID")
                }
            }

            4 -> {
                println("Thank you for using Movie Ticket Booking System.")
                println("Visit Again!")
                break
            }

            else -> {
                println("Invalid Input")
            }
        }
        println()
    }
}