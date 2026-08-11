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
        println("Blood Group    : ${bloodGroup ?: "Not Available"}")
        println("Contact Number : ${contactNumber ?: "Not Available"}")
        println()
    }

    fun getUpdateDoctorInput(): UserInput {
        val userInput = UserInput()
        print("Enter Patient ID : ")
        userInput.patientId = readln().toString()
        print("Enter Doctor Name : ")
        userInput.updateDoctorName = readln().toString()
        return userInput
    }
    fun getUpdateContactInput(): UserInput{
        val userInput = UserInput()
        print("Enter Patient ID : ")
        userInput.patientId = readln().toString()
        print("Enter Contact Number : ")
        userInput.updateContactNumber = readln().toString()
        return userInput
    }

    fun updateDoctor(updateDoctorName: String) {

        doctorName=updateDoctorName
        displayPatientDetails()

    }

    fun updateContactNumber(updateContactNumber : String) {

        contactNumber=updateContactNumber
        displayPatientDetails()
    }

    class UserInput {
        var patientId = ""
        var updateDoctorName = ""
        var updateContactNumber = ""
    }
}
fun main(){
    val patientList = arrayOf(Patient(),Patient(),Patient())


    patientList[0].patientID="P101"
    patientList[1].patientID="P102"
    patientList[2].patientID="P103"

    patientList[0].patientName = null
    patientList[1].patientName = "Ravi"
    patientList[2].patientName = "Ramya"

    patientList[0].doctorName = "Dr.Hari"
    patientList[1].doctorName = null
    patientList[2].doctorName = "Dr.Renu"

    patientList[0].bloodGroup = "A+ve"
    patientList[1].bloodGroup = "B-ve"
    patientList[2].bloodGroup = null

    patientList[0].contactNumber = "9876543231"
    patientList[1].contactNumber = null
    patientList[2].contactNumber = "5684734765"

    displayMenu(patientList[0],patientList[1],patientList[2])



}

fun displayMenu(patient1: Patient,patient2: Patient,patient3 :Patient) {
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
                println("======================================")
                patient1.displayPatientDetails()
                println("======================================")
                patient2.displayPatientDetails()
                println("======================================")
                patient3.displayPatientDetails()
                println("======================================")
            }

            2 -> {
                val userInput = patient1.getUpdateDoctorInput()
                when (userInput.patientId) {
                    "P101"-> patient1.updateDoctor(userInput.updateDoctorName)
                    "P102" -> patient2.updateDoctor(userInput.updateDoctorName)
                    "P103" -> patient3.updateDoctor(userInput.updateDoctorName)
                    else -> println("Invalid Input")
                }
            }

            3 -> {
                val userInput = patient1.getUpdateContactInput()
                when (userInput.patientId) {
                    "P101" -> patient1.updateContactNumber(userInput.updateContactNumber)
                    "P102" -> patient2.updateContactNumber(userInput.updateContactNumber)
                    "P103" -> patient3.updateContactNumber(userInput.updateContactNumber)
                    else -> println("Invalid Input")
                }
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
