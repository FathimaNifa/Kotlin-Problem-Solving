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


//Billing Rules:
//
//- First 100 units → ₹2/unit
//- Next 100 units → ₹3/unit
//- Above 200 units → ₹5/unit
//
//Display:
//
//- Units Consumed
//- Amount Payable
//
//Example
//
//```
//Enter Units: 250
//
//Units : 250
//Amount : ₹750
//```