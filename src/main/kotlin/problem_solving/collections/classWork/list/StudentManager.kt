package org.example.problem_solving.collections.classWork.list

var student = mutableListOf("Kannan")

fun addStudent(){
    print("Enter Student name : ")
    student.add(readln())
    println("Student Added Successfully")
}
fun removeStudent(){
    print("Enter Student name : ")
    student.remove(readln())
    println("Student Removed Successfully")
}
fun searchStudent(){
    print("Enter Student name : ")
    val isStudentExist = student.contains(readln())
    if(isStudentExist){
        println("Student Exists")
    }else{
        println("Student Not Exists")
    }
}

fun getUSerInput(){
    while(true){
    println("====== Student Manager ======")
    println()
    println("1. Add Student")
    println("2. View Student")
    println("3. Remove Student")
    println("4. Search Student")
    println("5. Exit")
    println()
    println("--------------------------")
    println()
    print("Enter your Choice: ")

    val choice = readln().toInt()

        when(choice){
            1-> {
                addStudent()
            }
            2->{
                println("Students List")
                println(student)
            }
            3->{
                removeStudent()
            }
            4->{
                searchStudent()
            }
            5-> break
        }
    }

}


fun main(){
getUSerInput()
}