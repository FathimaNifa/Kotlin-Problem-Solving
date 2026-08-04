package org.example.problem_solving.nullSafety.classWork

class Student{
    var studentID = ""
    var studentName :String ? = ""
    var department : String ? = ""
    var phoneNumber : String ? = ""

    fun displayStudentDetails(){
        println("===========Student Details==========")
        println("Student ID     : $studentID")
        println("Student Name   : ${studentName?: "Not Available"}")
        println("Department     : ${department?: "Not Available"}")
        println("Phone Number   : ${phoneNumber?: "Not Available"}")
    }

}

fun main(){
    val student1 = Student()
    val student2 = Student()
    val student3 = Student()

    student1.studentID= "S101"
    student2.studentID= "S102"
    student3.studentID= "S103"

    student1.studentName = "Rahul"
    student2.studentName = null
    student3.studentName = "John"

    student1.department = "CSE"
    student2.department = "ECE"
    student3.department = null

    student1.phoneNumber = "9876543210"
    student2.phoneNumber = null
    student3.phoneNumber = "9876543210"

    student1.displayStudentDetails()
    student2.displayStudentDetails()
    student3.displayStudentDetails()



}





//# Student Registration System
//
//## Problem Statement
//
//Create a class named **Student**.
//
//### Properties
//
//- Student ID
//- Student Name *(Nullable)*
//- Department *(Nullable)*
//- Phone Number *(Nullable)*
//
//### Function
//
//```
//displayStudentDetails()
//```
//
//If any property is `null`, display **"Not Available"** using the **Elvis Operator (`?:`)**.
//
//Create **3 student objects**.
//
//Display the details of all students.
//
//---
//
//### Expected Output
//
//```
//========== Student 1 ==========
//Student ID   : S101
//Name         : Rahul
//Department   : CSE
//Phone Number : 9876543210
//
//========== Student 2 ==========
//Student ID   : S102
//Name         : Not Available
//Department   : ECE
//Phone Number : Not Available
//
//========== Student 3 ==========
//Student ID   : S103
//Name         : John
//Department   : Not Available
//Phone Number : 9876512345
//```