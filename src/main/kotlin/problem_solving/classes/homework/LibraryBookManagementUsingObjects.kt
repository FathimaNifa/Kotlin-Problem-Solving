package org.example.problem_solving.classes.homework

class Books {
    var bookName = ""
    var author = ""
    var price = ""
    var availableCopies = 0

    fun borrowBook(){
    if(availableCopies>0){
        availableCopies--
      println("Book Borrowed Successfully!")
    } else {
        println("Book is not available!")
    }
    }
    fun returnBook(){
        availableCopies--
        println("Book Returned Successfully!")
    }
    fun displayDetails(){
        println("Book Name        : $bookName")
        println("Author           : $author")
        println("Price            : $price")
        println("Available Copies : $availableCopies")
    }


}

fun main() {

    val book1 = Books()
    val book2 = Books()
    val book3 = Books()

    book1.bookName = "Kotlin Programming"
    book1.author = "JetBrains"
    book1.price = "₹950"
    book1.availableCopies = 5

    book2.bookName = "Android Development"
    book2.author = "Google"
    book2.price = "₹850"
    book2.availableCopies = 4

    book3.bookName = "Data Structures"
    book3.author = "Donald Knuth"
    book3.price = "₹750"
    book3.availableCopies = 3


    println("========================")
    println("  Available Books")

    println("1. ${book1.bookName}")
    println("2. ${book2.bookName}")
    println("3. ${book3.bookName}")

    print("\nSelect Book: ")
    val selectedBook = readln().toInt()

    println()
    println("Choose Option")
    println("1. Borrow")
    println("2. Return")

    print("Enter your choice: ")
    val choice = readln().toInt()

    val selectedBookObject = when (selectedBook){
        1->book1
        2->book2
        3->book3
        else -> null
    }
    if (selectedBookObject == null) {
        println("Invalid Book Selection")
        return
    }
    println()
    println("========== Book Details ==========")
    selectedBookObject.displayDetails()
    println()
    when (choice) {
        1 -> selectedBookObject.borrowBook()
        2 -> selectedBookObject.returnBook()
        else -> {
            println("Invalid Choice")
            return
        }
    }
    println()
    println("========== Updated Details ==========")
    selectedBookObject.displayDetails()

}


