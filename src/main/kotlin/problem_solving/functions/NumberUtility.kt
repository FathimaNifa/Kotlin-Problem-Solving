package org.example.problem_solving.functions

fun main() {
    print("Enter a Number : ")
    val number = readln().toInt()
    checkeven(number)
    checkPositive(number)
    findSquare(number)
}

fun checkeven(number: Int) {
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