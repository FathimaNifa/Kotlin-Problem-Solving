package org.example.problem_solving.collections.homeWork.list

import org.example.problem_solving.collections.classWork.list.*

data class Movie(
    val id: Int,
    val name: String,
    val price: Double,
    val availableSeats: Int
){

}
val movie1 = mutableListOf<Product>(Product(1001,"Leo", 350.0,35))
val movie2 = mutableListOf<Product>(Product(1002,"ABC", 250.0,15))
val movie3 = mutableListOf<Product>(Product(1003,"Tim", 200.0,20))

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
                addStudent()
            }
            2->{
                println("Students List")
                println(student)
            }
            3->{
                removeStudent()
            }
            4->{
                searchStudent()
            }
            5-> break
        }
    }
}

fun main(){

}