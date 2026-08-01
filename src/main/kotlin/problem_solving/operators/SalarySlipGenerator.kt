package org.example.problem_solving.operators

fun main() {

    getEmployeeDetails()


}

fun getEmployeeDetails(){
    print("Enter Employee Name : ")
    val employeeName = readln()
    print("Enter Employee ID   : ")
    val employeeID = readln()
    print("Enter Company Name  : ")
    val companyName  = readln()
    print("Enter Basic Salary  : ")
    val basicSalary  = readln().toInt()
    print("Enter HRA Percentage  : ")
    val hraPercentage = readln().toInt()
    print("Enter DA Percentage  : ")
    val daPercentage = readln().toInt()
    print("Enter Tax Percentage  : ")
    val taxPercentage = readln().toInt()
    val hra = calculateHRA(basicSalary, hraPercentage )
    val da = calculateDA(basicSalary, daPercentage )
    val grossSalary =calculateGrossSalary(basicSalary, da ,hra )
    val tax = calculateTax(grossSalary , taxPercentage)
    val netSalary = calculateNetSalary(grossSalary, tax)
    printSalarySlip(employeeName , employeeID , companyName , basicSalary ,hra, da, grossSalary,tax,netSalary)

}


fun printSalarySlip(employeeName : String, employeeID : String, companyName : String, basicSalary : Int, hra: Int, da : Int, grossSalary: Int, tax : Int, netSalary : Int) {
    println("========================================")
    println("          EMPLOYEE SALARY SLIP")
    println("========================================")
    println()
    println("Employee Name : $employeeName")
    println("Employee ID   : $employeeID")
    println("Company       : $companyName")
    println()
    println("----------------------------------------")
    println("Basic Salary  : ₹$basicSalary")
    println("HRA           : ₹$hra")
    println("DA            : ₹$da")
    println("Gross Salary  : ₹$grossSalary")
    println("Tax           : ₹$tax")
    println("----------------------------------------")
    println("Net Salary    : ₹$netSalary")
    println()
    println("========================================")
}
fun calculateHRA(basicSalary: Int, hraPercentage: Int ): Int = (basicSalary * hraPercentage)/100


fun calculateDA(basicSalary: Int, daPercentage: Int ): Int = (basicSalary * daPercentage)/100


fun calculateGrossSalary(basicSalary: Int, da: Int ,hra : Int): Int = basicSalary + hra+ da


fun calculateTax(grossSalary : Int, taxPercentage : Int): Int = (grossSalary * taxPercentage)/100



fun calculateNetSalary(grossSalary: Int, tax: Int): Int = grossSalary - tax

//
//## Problem Statement
//
//Write a Kotlin program to generate an employee salary slip.
//
//### Input
//
//Ask the user to enter:
//
//- Employee Name
//- Employee ID
//- Company Name
//- Basic Salary
//- HRA Percentage
//- DA Percentage
//- Tax Percentage
//
//### Calculate
//
//- HRA Amount
//- DA Amount
//- Gross Salary
//- Tax Amount
//- Net Salary
//
//### Formula
//
//```
//HRA Amount = Basic Salary × HRA % / 100
//
//DA Amount = Basic Salary × DA % / 100
//
//Gross Salary = Basic Salary + HRA Amount + DA Amount
//
//Tax Amount = Gross Salary × Tax % / 100
//
//Net Salary = Gross Salary − Tax Amount
//```
//
//### Expected Outpu
//
//```
//========================================
//EMPLOYEE SALARY SLIP
//========================================
//
//Employee Name : Kannan
//Employee ID   : EMP1023
//Company       : ABC Technologies
//
//----------------------------------------
//Basic Salary  : ₹50,000
//HRA           : ₹10,000
//DA            : ₹7,500
//Gross Salary  : ₹67,500
//Tax           : ₹6,750
//----------------------------------------
//Net Salary    : ₹60,750
//
//========================================
//```