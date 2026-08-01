package org.example.problem_solving.loops

    fun main(){
        println("All Number: ")
        for(i in 1..20){
            print("$i ")
        }
        println()
        println("Even Number: ")
        for(i in 1..20){
            if(i%2==0)
                print("$i ")
        }
        println()
        println("Odd Number: ")
        for(i in 1..20){
            if(i%2!=0)
                print("$i ")
        }

    }