package org.example.problem_solving.functions

var first100Units = 0
var second100Units = 0
var above200Units = 0
var totalAmount = 0
var totalUnits = 0
fun main() {

    print("Enter Units : ")
    totalUnits = readln().toInt()
    totalAmount = billingRules(totalUnits)
}

fun billingRules(units: Int): Int {
    println("Units : $units")
    for (i in 1..units) {
        if (i <= 100) {
            first100Units = i * 2
        }
        if (i > 100 && i <= 200) {
            var units = i - 100
            second100Units = units * 3
        }
        if (i > 200) {
            var units = i - 200
            above200Units = units * 5
        }
        totalAmount = first100Units + second100Units + above200Units


    }
    println("Amount : $totalAmount")
    return totalAmount

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
