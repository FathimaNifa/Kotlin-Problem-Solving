package org.example.problem_solving.`when`


val name = "Fathima"
val mobileNumber = "9940300864"
val serviceProvider = "Airtel"
val rechargeAmount = "299"

fun main(){
    getPrintStatement()
}

fun getCustomerDetails(){
    println("Customer Name     :  $name")
    println("Mobile Number     :  $mobileNumber")
    println("Service Provider  :  $serviceProvider")
    println("Recharge Amount   :  $rechargeAmount")
    println()
}

fun getRechargeAmount(rechargeAmount : String){
    when (rechargeAmount) {
        "199" ->{
            getCustomerDetails()
            println("Plan Validity     : 28 days")
            println("Daily Data        : 1 GB/day")
            println("Recharge Status   : Successfull")
        }
        "299" ->{
            getCustomerDetails()
            println("Plan Validity     : 28 days")
            println("Daily Data        : 1.5 GB/day")
            println("Recharge Status   : Successfull")
        }
        "399" ->{
            getCustomerDetails()
            println("Plan Validity     : 56 days")
            println("Daily Data        : 2 GB/day")
            println("Recharge Status   : Successfull")
        }
        "599" ->{
            getCustomerDetails()
            println("Plan Validity     : 84 days")
            println("Daily Data        : 2 GB/day")
            println("Recharge Status   : Successfull")
        } else ->{
        println("Invalid Recharge")
    }
    }
}

fun getPrintStatement(){
    println("----------------------------------------")
    println("       Mobile Recharge Summary")
    println("----------------------------------------")
    println()
    getRechargeAmount(rechargeAmount)
    println()
    println("----------------------------------------")
    println("  Thank you for choosing our service!")
    println("----------------------------------------")
}



//Kotlin Homework - Mobile Recharge System
//
//## Objective
//
//Develop a Kotlin console application that simulates a mobile recharge system. The application should display the recharge benefits based on the recharge amount selected by the customer.
//
//### Topics Covered
//
//* `val` / `var`
//* Data Types
//* Functions
//* `when`
//
//## Requirements
//
//### Step 1: Store the Following Details
//
//* Customer Name
//* Mobile Number
//* Service Provider
//* Recharge Amount
//
//### Step 2: Create Functions
//
//Create separate functions to perform the following tasks:
//
//1. Display the customer details.
//2. Determine the validity based on the recharge amount.
//3. Determine the daily data limit based on the recharge amount.
//4. Display the recharge summary.
//
//### Recharge Plans
//
//Use the `when` expression to determine the recharge benefits.
//
//| Recharge Amount (₹) | Validity         | Daily Data |
//| ------------------- | ---------------- | ---------- |
//| 199                 | 28 Days          | 1 GB/day   |
//| 299                 | 28 Days          | 1.5 GB/day |
//| 399                 | 56 Days          | 2 GB/day   |
//| 599                 | 84 Days          | 2 GB/day   |
//| Any Other Amount    | Invalid Recharge | N/A        |
//
//If the entered recharge amount does not match any available plan, display **"Invalid Recharge Plan"**.
//
//### Expected Output
//
//Display the following information in a neatly formatted manner:
//
//* Customer Name
//* Mobile Number
//* Service Provider
//* Recharge Amount
//* Plan Validity
//* Daily Data
//* Recharge Status
//
//## Instructions
//
//* Use meaningful variable names.
//* Divide the logic into separate functions.
//* Use the `when` expression to determine the recharge benefits.
//* Do not use loops, arrays, collections, or classes.
//* Keep the entire program in a single Kotlin file.
//* Write clean, readable, and well-formatted code.
//
//### Expected Output (Example)
//
//----------------------------------------
//Mobile Recharge Summary
//----------------------------------------
//
//Customer Name     : Kannan
//Mobile Number     : 9876543210
//Service Provider  : Airtel
//Recharge Amount   : ₹299
//
//Plan Validity     : 28 Days
//Daily Data        : 1.5 GB/day
//Recharge Status   : Successful
//
//----------------------------------------
//Thank you for choosing our service!
//----------------------------------------
//```
//
//### Problem Statement
//
//Write a Kotlin program that generates a simple supermarket bill.
//
//### Requirements
//
//Ask the user to enter:
//
//- Customer Name
//- Product Name
//- Price of one product
//- Quantity Purchased
//
//Calculate:
//
//- Total Amount = Price × Quantity
//
//Display the bill in the following format:
//
//```
//=================================
//SUPERMARKET BILL
//=================================
//Customer Name : Kannan
//Product Name  : Rice
//Price         : ₹120
//Quantity      : 5
//---------------------------------
//Total Amount  : ₹600
//=================================
//Thank You! Visit Again.
//```