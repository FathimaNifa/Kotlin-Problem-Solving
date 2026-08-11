package org.example.problem_solving.dataclass.classWork

data class Student(val id : String, val name : String,val department : String, val marks : Int)


fun main(){
    val student1 = Student("S101","Kannan","CS",96)
    val student2 = Student("S102","Mohan","IT",94)
println("========== Students ==========")
println(student1)
    println(student2)

    println("Are Student 1 and Student 2 equal?")
   println( student1==student2)
    println("========== Updated Student ==========\n")
    println("Original:")
    println(student1)
    println("Copied:")
    println(student1.copy(department = "IT", marks =98))
}



//### Student Record Management
//
//Create a `Student` data class with:
//
//    - `id`
//- `name`
//- `department`
//- `marks`
//
//Create **2 student objects**.
//
//The program should:
//
//1. Display all student details.
//2. Compare two students using `==`.
//3. Create a copy of one student using `copy()` with updated marks.
//4. Display the original and copied student.
//
//### Example Input
//
//```
//Student 1:
//ID         : S101
//Name       : Rahul
//Department : CSE
//Marks      : 75
//
//Student 2:
//ID         : S102
//Name       : Priya
//Department : ECE
//Marks      : 82
//```
//
//### Expected Output
//
//```
//========== Students ==========
//
//Student(id=S101, name=Rahul, department=CSE, marks=75)
//Student(id=S102, name=Priya, department=ECE, marks=82)
//
//Are Student 1 and Student 2 equal?
//false
//
//========== Updated Student ==========
//
//Original:
//Student(id=S101, name=Rahul, department=CSE, marks=75)
//
//Copied:
//Student(id=S101, name=Rahul, department=CSE, marks=85)
//```