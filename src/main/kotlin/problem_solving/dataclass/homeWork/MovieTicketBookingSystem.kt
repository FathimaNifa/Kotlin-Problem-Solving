package org.example.problem_solving.dataclass.homeWork

import org.intellij.lang.annotations.Language

data class MovieTicketBookingSystem(val movieID : String,val movieName :String,val language : String, val ticketPrice : Int,val availableSeat: Int){
    val totalAmount = ticketPrice
    var availableSeats = availableSeat
}

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
                    ticketBooking()

            }

            3 -> {
                    cancelTicket()
            }

            4 -> {
                    compareMovie()
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

fun compareMovie(){
    print("Enter First Movie ID  : ")
    val firstMovie = readln()
    print("Enter Second Movie ID  : ")
    val secondMovie = readln()
    println("Are these two movies equal?\n")
    println(firstMovie==secondMovie)
}
fun ticketBooking(){
    print("Enter Movie ID : ")
    val movieID = readln()
    print("Enter Number Of Tickets : ")
    val ticketCount = readln().toInt()

    when(movieID){
        "M101" ->{
            print("========== Booking Successful ==========")
            println()
            movieTicket1.availableSeats = movieTicket1.availableSeats - ticketCount
            println("Movie : ${movieTicket1.copy(availableSeat= movieTicket1.availableSeats)}")
            println("Tickets Booked : $ticketCount")
            println("Total Amount   : ₹${movieTicket1.totalAmount*ticketCount}")
        }
        "M102" ->{
            print("========== Booking Successful ==========")
            println()
            movieTicket2.availableSeats = movieTicket2.availableSeats - ticketCount
            println("Movie : ${movieTicket2.copy(availableSeat= movieTicket2.availableSeats)}")
            println("Tickets Booked : $ticketCount")
            println("Total Amount   : ₹${movieTicket2.totalAmount*ticketCount}")
        }
        "M103" ->{
            print("========== Booking Successful ==========")
            println()
            movieTicket3.availableSeats = movieTicket3.availableSeats - ticketCount
            println("Movie : ${movieTicket3.copy(availableSeat= movieTicket3.availableSeats)}")
            println("Tickets Booked : $ticketCount")
            println("Total Amount   : ₹${movieTicket3.totalAmount*ticketCount}")
        }
        else -> println("Invalid Movie ID")
    }

return
}

fun cancelTicket(){
    print("Enter Movie ID : ")
    val movieID = readln()
    print("Enter Number Of Tickets : ")
    val ticketCount = readln().toInt()

    when(movieID){
        "M101" ->{
            print("========== Tickets Cancelled Successfully ==========")
            println()
            movieTicket1.availableSeats = movieTicket1.availableSeats + ticketCount
            println("Movie : ${movieTicket1.copy(availableSeat= movieTicket1.availableSeats)}")
        }
        "M102" ->{
            print("========== Tickets Cancelled Successfully ==========")
            println()
            movieTicket3.availableSeats = movieTicket2.availableSeats + ticketCount
            println("Movie : ${movieTicket2.copy(availableSeat= movieTicket2.availableSeats)}")
        }
        "M103" ->{
            print("========== Tickets Cancelled Successfully ==========")
            println()
            movieTicket3.availableSeats = movieTicket3.availableSeats + ticketCount
            println("Movie : ${movieTicket3.copy(availableSeat= movieTicket3.availableSeats)}")
        }
        else -> println("Invalid Movie ID")
    }
}

fun main(){
    userInput()
}







