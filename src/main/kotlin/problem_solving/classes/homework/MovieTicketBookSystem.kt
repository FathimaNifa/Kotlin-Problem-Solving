package org.example.problem_solving.classes.homework

import org.example.problem_solving.loops.getDepositeAmt
import org.example.problem_solving.loops.getWithdrawAmt

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

    fun getUserInput(): Pair<Int, Int> {

        print("Enter Movie ID: ")
        val movieID = readln().toInt()

        print("Enter the number of tickets: ")
        val ticketCount = readln().toInt()

        return Pair(movieID, ticketCount)
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

        val movie1 = Movie()
        val movie2 = Movie()
        val movie3 = Movie()

        movie1.movieId = 1
        movie1.movieName = "Leo"
        movie1.language = "Tamil"
        movie1.ticketPrice = 200
        movie1.availableSeats = 50

        movie2.movieId = 2
        movie2.movieName = "Avengers"
        movie2.language = "English"
        movie2.ticketPrice = 300
        movie2.availableSeats = 35

        movie3.movieId = 3
        movie3.movieName = "Vikram"
        movie3.language = "Tamil"
        movie3.ticketPrice = 250
        movie3.availableSeats = 40

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
                    val (movieID, ticketCount) = movie1.getUserInput()
                    when (movieID) {
                        1 -> movie1.bookTicket(ticketCount)
                        2 -> movie2.bookTicket(ticketCount)
                        3 -> movie3.bookTicket(ticketCount)
                        else -> println("Invalid Movie ID")
                    }
                }

                3 -> {
                    val (movieID, ticketCount) = movie1.getUserInput()
                    when (movieID) {
                        1 -> movie1.cancelTicket(ticketCount)
                        2 -> movie2.cancelTicket(ticketCount)
                        3 -> movie3.cancelTicket(ticketCount)
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
