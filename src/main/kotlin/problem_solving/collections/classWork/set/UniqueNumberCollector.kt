package org.example.problem_solving.collections.classWork.set

fun main(){

    print("Enter 10 Numbers : ")
    var numbers = mutableSetOf<Int>()
    for( i in 0..9) {
        numbers.add(readln().toInt())
    }
    println()
    println("Unique Numbers: $numbers")
    println("Number of Unique Values: ${numbers.size}")


}