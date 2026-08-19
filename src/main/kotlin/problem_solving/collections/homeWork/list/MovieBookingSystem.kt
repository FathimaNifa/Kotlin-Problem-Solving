package org.example.problem_solving.collections.homeWork.list

import org.example.problem_solving.collections.classWork.list.*

data class Movie(val movieID : String,val movieName :String,val language : String, val ticketPrice : Int,val availableSeats: Int){
    val totalAmount = ticketPrice
    var availableSeat = availableSeats
}
val movie1 = mutableListOf<Movie>(Movie("M101","Leo", "Tamil",350,34))
val movie2 = mutableListOf<Movie>(Movie("M101","ABC", "English",150, 12))
val movie3 = mutableListOf<Movie>(Movie("M101","Tim", "Chines",200, 10))

fun ticketBooking(){
    print("Enter Movie ID : ")
    val movieID = readln()
    print("Enter Number Of Tickets : ")
    val ticketCount = readln().toInt()

    when(movieID){
        "M101" ->{
            print("========== Booking Successful ==========")
            println()


        }
        "M102" ->{
            print("========== Booking Successful ==========")
            println()

        }
        "M103" ->{
            print("========== Booking Successful ==========")
            println()

        }
        else -> println("Invalid Movie ID")
    }

    return
}

fun getUserInput(){
    while(true){
        println("====== Movie Details ======")
        println()
        println("1. View Movies")
        println("2. Book Ticket")
        println("3. Cancel Ticket")
        println("4. Search Movie")
        println("5. Exit")
        println()
        println("--------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when(choice){
            1-> {
                println(movie1)
                println(movie2)
                println(movie3)
            }
            2->{

            }
            3->{

            }
            4-> {

            }
            5 -> {
                    println("Happy Watching!......")
                    break
                }

                else -> {
                    println("Invalid Input")
                }
    }
}

fun main(){
    getUserInput()
}



fun cancelTicket() {
    print("Enter Movie ID : ")
    val movieID = readln()
    print("Enter Number Of Tickets : ")
    val ticketCount = readln().toInt()

    when (movieID) {
        "M101" -> {
            print("========== Tickets Cancelled Successfully ==========")
            println()

        }

        "M102" -> {
            print("========== Tickets Cancelled Successfully ==========")
            println()

        }

        "M103" -> {
            print("========== Tickets Cancelled Successfully ==========")
            println()

        }

        else -> println("Invalid Movie ID")
    }
}
}








