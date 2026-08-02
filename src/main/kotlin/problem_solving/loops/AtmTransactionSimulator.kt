package org.example.problem_solving.loops

fun main() {
    getAtmMenu()
}

fun getDepositeAmt(balance: Int): Int {

    print("Enter the Amount : ")
    val depositeAmt = readln().toInt()
    val checkBalance = balance + depositeAmt
    println("Your Current balance is : $checkBalance")
    println()
    return checkBalance
}

fun getWithdrawAmt(balance: Int): Int {

    var checkBalance = balance
    print("Enter WithDraw Amount : ")
    val withdrawAmt = readln().toInt()
    if (withdrawAmt > checkBalance) {
        println("Insufficient Balance")
    } else {
        checkBalance = balance - withdrawAmt
        println("Please Collect your Cash!.....")
        println("Your Current balance is : $checkBalance")
        println()
    }
    return checkBalance
}

fun getAtmMenu() {

    var balance = 10000
    while (true) {
        println("====== ATM MENU ======")
        println()
        println("1. Check Balance")
        println("2. Deposit")
        println("3. Withdraw")
        println("4. Exit")
        println()
        println("--------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
                println("Your Current balance is : $balance")
            }
            2 -> {
                balance= getDepositeAmt(balance)
            }
            3 -> {
                balance= getWithdrawAmt(balance)
            }
            4 ->{
                println("Thank you for using the ATM!")
                break
            }
            else -> {
                println("Invalid Input")
            }
        }
        println()
    }
}



//# 🏠 Homework 3 — Hard
//
//### ATM Transaction Simulator
//
//Create a simple **ATM transaction simulator** using Kotlin loops.
//
//The program starts with a balance of **10,000**.
//
//Display a menu repeatedly:
//
//```
//===== ATM MENU =====
//
//1. Check Balance
//2. Deposit
//3. Withdraw
//4. Exit
//
//Enter your choice:
//```
//
//The program should:
//
//### 1. Check Balance
//
//Display the current balance.
//
//### 2. Deposit
//
//Ask the user for an amount and add it to the balance.
//
//### 3. Withdraw
//
//Ask the user for an amount.
//
//- If the amount is greater than the balance → display **Insufficient Balance**
//- Otherwise, deduct the amount.
//
//### 4. Exit
//
//Stop the program and display:
//
//```
//Thank you for using the ATM!
//```
//
//### Example
//
//```
//===== ATM MENU =====
//1. Check Balance
//2. Deposit
//3. Withdraw
//4. Exit
//
//Enter your choice: 1
//
//Current Balance: £10,000
//
//Enter your choice: 3
//Enter withdrawal amount: £2,000
//
//Please collect your cash.
//
//Current Balance: £8,000
//
//Enter your choice: 4
//
//Thank you for using the ATM!
//```