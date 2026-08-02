package org.example.problem_solving.classes.classWork

class Mobile{
    var brand =""
    var model =""
    var price = ""
    fun displayDetails(){
        println("========== Mobile Details ==========")
        println("Brand : $brand")
        println("Model : $model")
        println("Price : $price")
    }
}

fun main(){
    val mobile1 = Mobile()
    val mobile2 = Mobile()
    mobile1.brand ="Sumsung"
    mobile2.brand = "Apple"
    mobile1.model="Galaxy"
    mobile2.model="iPhone 17"
    mobile1.price = "₹85000"
    mobile2.price = "₹99900"
    mobile1.displayDetails()
    mobile2.displayDetails()




}