package org.example.problem_solving.loops

fun main() {

    print("Enter a Number :  ")
    val num = readln().toInt()
    for(i in 1..10){
        val table = num*i
        println("$num * $i = $table")
    }

}