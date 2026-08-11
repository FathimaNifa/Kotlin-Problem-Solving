package org.example.problem_solving.nullSafety.homework

import org.example.problem_solving.loops.getDepositeAmt
import org.example.problem_solving.loops.getWithdrawAmt

class Patient {

    var patientID = ""
    var patientName: String? = ""
    var doctorName: String? = ""
    var bloodGroup: String? = ""
    var contactNumber: String? = ""

    fun displayPatientDetails() {
        println("===========Patient Detail==========")
        println("Patient ID     : $patientID")
        println("Patient Name   : ${patientName ?: "Not Available"}")
        println("Doctor Name    : ${doctorName ?: "Not Available"}")
        println("Blood Group    : ₹$bloodGroup")
        println("Contact Number : ${contactNumber ?: "Not Available"}")
        println()
    }

    fun updateDoctor(): String{
        print("Enter Patient ID : ")
        val getPatientID = readln().toString()
        patientID=getPatientID
        println("Enter Doctor Name : ")
       val updateDoctorName= readln().toString()
        doctorName=updateDoctorName
        return doctorName as String
        displayPatientDetails()
    }

    fun displayMenu() {
        while (true) {
            println("==================================")
            println("    Hospital Management System ")
            println("==================================")
            println()
            println("1. View All Patients")
            println("2. Update Doctor")
            println("3. Update Contact Number")
            println("4. Exit")
            println()
            println("--------------------------")
            println()
            print("Enter your Choice: ")

            val choice = readln().toInt()

            when (choice) {
                1 -> {

                }

                2 -> {
                    updateDoctor()
                }

                3 -> {

                }

                4 -> {
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
}

fun main(){
    val patient1 = Patient()
    val patient2 = Patient()
    val patient3 = Patient()

    patient1.patientID="P101"
    patient2.patientID="P102"
    patient3.patientID="P103"

    patient1.patientName = null
    patient2.patientName = "Ravi"
    patient3.patientName = "Ramya"

    patient1.doctorName = "Dr.Hari"
    patient2.doctorName = null
    patient3.doctorName = "Dr.Renu"

    patient1.bloodGroup = "A+ve"
    patient2.bloodGroup = "B-ve"
    patient3.bloodGroup = null

    patient1.contactNumber = "9876543231"
    patient2.contactNumber = null
    patient3.contactNumber = "5684734765"






}