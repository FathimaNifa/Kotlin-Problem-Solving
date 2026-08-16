package org.example.problem_solving.dataclass.homeWork

import org.intellij.lang.annotations.Language

data class MovieTicketBookingSystem(val movieID : String,val movieName :String,val language : String, val ticketPrice : Int,val availableSeats: Int)

var movieTicket1 = MovieTicketBookingSystem("M101","Ghili","Tamil",350,12)
var movieTicket2 = MovieTicketBookingSystem("M102","Nemo","English",450,30)
var movieTicket3 = MovieTicketBookingSystem("M103","Premam","Malayalam",250,20)

fun userInput(){
    while (true) {
        println("======================================")
        println("         Movie Booking System")
        println("======================================")
        println()
        println("1. View Movies")
        println("2. Book Tickets")
        println("3. Cancel Tickets")
        println("4. Compare Movies")
        println("5. Exit")
        println()
        println("---------------------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
                    println(movieTicket1)
                    println(movieTicket2)
                    println(movieTicket3)
            }

            2 -> {


            }

            3 -> {

            }

            4 -> {

            }
            5 -> {
                println("Happy Watching!......")
                break
            }

            else -> {
                println("Invalid Input")
            }
        }
        println()
    }


}


fun ticketBooking(){
    print("Enter Movie ID : ")
    val movieID = readln()
    print("Enter Number Of Tickets : ")
    val ticketCount = readln().toInt()
    val totalAmount = 0
    when(movieID){
        "M101" ->{
            print("========== Booking Successful ==========")
            val availableSeats = movieTicket1.availableSeats - ticketCount
            println(movieTicket1.copy(availableSeats=availableSeats))
            println("Tickets Booked : $ticketCount")
            println("Total Amount   : ")
        }
        "M102" ->{
            print("========== Booking Successful ==========")

        }
        "M103" ->{
            print("========== Booking Successful ==========")

        }
        else -> println("Invalid Movie ID")
    }


}

fun main(){
    userInput()
}







