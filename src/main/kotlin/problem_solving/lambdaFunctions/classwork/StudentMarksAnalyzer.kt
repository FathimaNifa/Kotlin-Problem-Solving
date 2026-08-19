package org.example.problem_solving.lambdaFunctions.classwork

fun main(){
    val marks = listOf(45, 78, 32, 90, 65, 88, 40, 95)
    println("Original Marks : $marks")
    val passMark = marks.filter{ it>=50
    }
    println("Passed Marks   : $passMark")
    val graceMark = marks.map { it +5 }
    println("Updated Marks  : $graceMark")
}