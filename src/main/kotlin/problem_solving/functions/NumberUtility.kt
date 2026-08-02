package org.example.problem_solving.functions

fun main() {
    print("Enter a Number : ")
    val number = readln().toInt()
    checkEven(number)
    checkPositive(number)
    findSquare(number)
}

fun checkEven(number: Int) {
    if (number % 2 == 0) {
        println("Even : Yes")
    } else {
        println("Even : No")
    }

}

fun checkPositive(number: Int) {
    if (number > 0) {
        println("Positive : Yes")
    } else {
        println("Positive : No")
    }

}

fun findSquare(number: Int) {
    val square = number * number
    println("Square : $square")
}


//Create the following functions:
//
//- `isEven()`
//- `isPositive()`
//- `findSquare()`
//
//Read one number and display all the results.
//
//Example
//
//```
//Enter Number: 10
//
//Even : Yes
//Positive : Yes
//Square : 100
//```