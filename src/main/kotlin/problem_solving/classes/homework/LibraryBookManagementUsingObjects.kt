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

    val listOfBooks = arrayOf(Books(),Books(),Books())

    listOfBooks[0].bookName = "Kotlin Programming"
    listOfBooks[0].author = "JetBrains"
    listOfBooks[0].price = "₹950"
    listOfBooks[0].availableCopies = 5

    listOfBooks[1].bookName = "Android Development"
    listOfBooks[1].author = "Google"
    listOfBooks[1].price = "₹850"
    listOfBooks[1].availableCopies = 4

    listOfBooks[2].bookName = "Data Structures"
    listOfBooks[2].author = "Donald Knuth"
    listOfBooks[2].price = "₹750"
    listOfBooks[2].availableCopies = 3


    userInput(listOfBooks[0], listOfBooks[1], listOfBooks[2])

}


fun userInput(book1: Books, book2: Books, book3: Books){
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