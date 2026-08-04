package org.example.problem_solving.classes.homework

class Book {
    val bookName = arrayOf("Kotlin Programming", "Android Development", "Data Structures")
    var author = arrayOf("JetBrains", "Google", "Donald Knuth")
    var price = arrayOf("₹950", "₹850", "₹750")
    var availableCopies = arrayOf(5,4,3)
    var selectedBook = 0


    fun borrowBook(): Int  = availableCopies[selectedBook-1]-1


    fun returnBook(): Int  = availableCopies[selectedBook-1]+1


    fun displayBookDetails(selectedBook: Int,choice : Int) {
        println("========== Book Details ==========")
        println()
        val bookName = bookName[selectedBook-1]
        val author = author[selectedBook-1]
        val price = price[selectedBook-1]
        val availableCopies = availableCopies[selectedBook-1]

        println("Book Name        : $bookName")
        println("Author           : $author")
        println("Price            : $price ")
        println("Available Copies : $availableCopies")
        println()
        println("     Book Borrowed Successfully!  ")
        println()
        println("========== Updated Details ==========")
        println("Book Name        : $bookName")
        println("Author           : $author")
        println("Price            : $price ")
       when(choice){
           1-> println("Available Copies : ${borrowBook()}")
           2-> println("Available Copies : ${returnBook()}")

       }

    }

    fun getUserInput()  :Pair <Int,Int> {
        println("========================")
        println("  Available Books")
        for (i in 0..3 - 1) {
            var list = bookName[i]
            println("${i + 1}. $list")
        }
        println()
        print("Select Book : ")
        selectedBook = readln().toInt()

        println()
        println("Choose Option")
        println("1. Borrow")
        println("2. Return")
        print("Enter your choice : ")
        val choice = readln().toInt()
        return Pair(selectedBook,choice)


    }

}

fun main() {

    val book1 = Book()
    val value = book1.getUserInput()
    val selectedBook = value.first
    val choice = value.second
    book1.displayBookDetails(selectedBook,choice)

}