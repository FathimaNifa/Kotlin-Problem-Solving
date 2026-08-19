package org.example.problem_solving.lambdaFunctions.homework

import org.example.problem_solving.lambdaFunctions.classwork.Product

data class Employee(
    val name: String,
    val salary: Double
)

fun main(){
    val employees = listOf(
        Employee("Kavi", 60000.0),
        Employee("Moni", 40000.0),
        Employee("Ravi", 150000.0),
        Employee("Tim", 25000.0),
        Employee("Chan", 90000.0)
    )

    val moreThan50k = employees.filter { it.salary>50000 }
    val hike = employees.map{Employee(it.name, it.salary+(it.salary*10/100))}
    val moreThan60k = hike.filter { it.salary>60000 }

    employees.forEach { println("${it.name} : ₹${it.salary}") }
    println()
    println("Employee Earning more than 50k")
    moreThan50k.forEach { println("${it.name} : ₹${it.salary}")  }
    println()
    println("Employee Got Hike by 10%")
    hike.forEach { println("${it.name} : ₹${it.salary}")  }
    println()
    println("Employee Earning more than 60k")
    moreThan60k.forEach { println("${it.name} : ₹${it.salary}")  }






}