package org.example.problem_solving.collections.homeWork.list

var marks = mutableListOf<Int>()
var studentCount = 0
var total = 0
var average = 0.0
var passCount = 0
var failCount =0
fun getMarks(){
    print("Enter Number of Students : ")
    studentCount= readln().toInt()
    println()
    print("Enter Marks of Students :")
    for(i in 0..studentCount-1) {
        marks.add(readln().toInt())
        total = total + marks[i]
        average= total/ studentCount.toDouble()
        if(marks[i]>=35){
            passCount++

        }else{
            failCount++

        }
    }

    println("===== Students Marks ======")
    print("Marks : $marks")
    println()
    println("Highest Mark : ${marks.max()}")
    println("Lowest Mark  : ${marks.min()}")
    println("Total Mark   : $total")
    println("Average      : $average")
    println("Passed       : $passCount")
    println("Failed       : $failCount")
    println()
    println("-------------------------------")










}

fun main(){
    getMarks()
}