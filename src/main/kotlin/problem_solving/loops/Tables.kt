package org.example.problem_solving.loops

fun main() {

    print("Enter a Number :  ")
    var num = readln().toInt()
    for(i in 1..10){
        var table = num*i
        println("$num * $i = $table")
    }

}