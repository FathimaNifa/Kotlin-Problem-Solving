package org.example.problem_solving.functions

fun main() {
    var units =0
    print("Enter Units : ")
    units= readln().toInt()
    billingRules(units)
}

fun billingRules(units :Int){
    println("Units : $units")
    var amount = 0
    if(units<=100){
        amount = units*2
    }else if(units>100&&units<=200){
        amount = units*3
    }else {
        amount = units*5
    }

    println("Amount : $amount")
}