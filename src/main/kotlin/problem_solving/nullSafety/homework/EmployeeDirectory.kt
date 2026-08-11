package org.example.problem_solving.nullSafety.homework

class Employee{

    var empID = ""
    var empName :String ? = ""
    var department : String ? = ""
    var email : String ? = ""
    var salary : String ? =""


    fun displayEmployeeDetails(){

        println("===========Employee Details==========")
        println("Employee ID     : $empID")
        println("Employee Name   : ${empName?: "Not Available"}")
        println("Department      : ${department?: "Not Available"}")
        println("Email           : ${email?: "Not Available"}")
        isSalaryAvailable()

    }

    fun isSalaryAvailable(){

        println("Salary          : ${salary?: "Salary Not Updated"}")
    }
}

fun main(){
    val employee1 = Employee()
    val employee2 = Employee()
    val employee3 = Employee()

    employee1.empID = "E101"
    employee2.empID = "E102"
    employee3.empID = "E103"

    employee1.empName = "Kannan"
    employee2.empName = "Mohan"
    employee3.empName = "Priya"

    employee1.department = "Android"
    employee2.department = "Testing"
    employee3.department = null

    employee1.email = "kannan@gmail.com"
    employee2.email = null
    employee3.email = "priya@gmail.com"

    employee1.salary = null
    employee2.salary = "₹75,000"
    employee3.salary = "₹50,000"


    employee1.displayEmployeeDetails()
    employee2.displayEmployeeDetails()
    employee3.displayEmployeeDetails()

}