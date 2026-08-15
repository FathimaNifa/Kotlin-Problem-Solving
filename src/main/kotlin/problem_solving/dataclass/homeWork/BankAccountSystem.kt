package org.example.problem_solving.dataclass.homeWork

data class BankAccountSystem(val accountNumber : String, val accountHolder : String, var balance : Int)
var accountHolder1 = BankAccountSystem("B1001","Kannan",90000)
var accountHolder2 = BankAccountSystem("B1002","Mohan",80000)
var accountHolder3 = BankAccountSystem("B1003","Hari",40000)

var actNum = ""
fun getUserInputs(){
    while (true) {
        println("======================================")
        println("         Bank Account System")
        println("======================================")
        println()
        println("1. View Accounts")
        println("2. Deposit")
        println("3. Withdraw")
        println("4. Compare Accounts")
        println("5. Exit")
        println()
        println("---------------------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
            println(accountHolder1)
            println(accountHolder2)
            println(accountHolder3)
            }

            2 -> {

                deposit()
            }

            3 -> {
                withDraw()
            }

            4 -> {
                println("DO AccountHolder1 and AccountHolder2 are Equal ?")
                println(accountHolder1== accountHolder2)
            }
            5 -> {
                println("Happy Banking!......")
                break
            }

            else -> {
                println("Invalid Input")
            }
        }
        println()
    }
}

fun deposit(){
    print("Enter Account Number: ")
    actNum = readln()
    println()
    print("Enter Deposit amount: ")
    val depositAmount = readln().toInt()
    when(actNum) {
        "B1001" -> {
            println("Original Account")
            println(accountHolder1)
            println("Updated Account:")
            val updatedBalance = accountHolder1.balance + depositAmount
            println(accountHolder1.copy(balance = updatedBalance))
        }
        "B1002" -> {
            println("Original Account")
            println(accountHolder2)
            println("Updated Account:")
            val updatedBalance = accountHolder2.balance + depositAmount
            println(accountHolder2.copy(balance = updatedBalance))
        }
        "B1003" -> {
            println("Original Account")
            println(accountHolder3)
            println("Updated Account:")
            val updatedBalance = accountHolder3.balance + depositAmount
            println(accountHolder3.copy(balance = updatedBalance))
        }
        else -> println("Invalid Input")
    }
}

fun withDraw(){
    print("Enter Account Number: ")
    actNum = readln()
    println()
    print("Enter Withdraw amount: ")
    val withdrawAmount = readln().toInt()
    when(actNum) {
        "B1001" -> {
            println("Original Account")
            println(accountHolder1)
            println("Updated Account:")
            val updatedBalance = accountHolder1.balance - withdrawAmount
            println(accountHolder1.copy(balance = updatedBalance))
        }
        "B1002" -> {
            println("Original Account")
            println(accountHolder2)
            println("Updated Account:")
            val updatedBalance = accountHolder2.balance - withdrawAmount
            println(accountHolder2.copy(balance = updatedBalance))
        }
        "B1003" -> {
            println("Original Account")
            println(accountHolder3)
            println("Updated Account:")
            val updatedBalance = accountHolder3.balance - withdrawAmount
            println(accountHolder3.copy(balance = updatedBalance))
        }
        else -> println("Account Number Not exists")
    }
}
fun main(){
getUserInputs()
}