package org.example.problem_solving.collections.classWork.set

var course = mutableSetOf<String>()

fun registerCourse(){
    print("Enter Course : ")
    val newCourse = readln()
    println()

    if(course.contains(newCourse)){
        println("Course Already Registered!")
    }else{
        course.add(newCourse)
        println("Course Registered Successfully!")
    }

}
fun removeCourse(){
    print("Enter Course : ")
    val removeCourse = readln()
    println()
    if(course.contains(removeCourse)){
        course.remove(removeCourse)
        println("Course Successfully Removed!\n")
    }else{
        println("Course Unavailable to Remove!")
    }
}
fun checkCourse(){
    print("Enter Course : ")
    val checkCourse = readln()
    println()
    if(course.contains(checkCourse)){
        println("Course is Available")
    }else{
        println("Course is UnAvailable")
    }
}

fun getUserInput(){
    while (true) {
        println("====== Course Registration System ======")
        println()
        println("1. Register Course")
        println("2. View Courses")
        println("3. Remove Course")
        println("4. Check Course")
        println("5. Exit")
        println()
        println("--------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
                registerCourse()
            }
            2 -> {
                println(course)
            }
            3 -> {
                removeCourse()
            }
            4 ->{
                checkCourse()
            }
            5 ->{

                break
            }
            else -> {
                println("Invalid Input")
            }
        }
        println()
    }
}
fun main(){
    getUserInput()
}