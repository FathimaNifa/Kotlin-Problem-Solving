package org.example.problem_solving.dataclass.homeWork

data class Product(val id : String, val name : String,val price : Int, val quantity : Int)

fun getUserInput(){
    val product1 = Product("P101","Mouse",5000,2)
    val product2 = Product("P102","Pen Drive",1000,5)
    val product3 = Product("P103","Laptop",30000,1)
    val product4 = Product("P104","Mobile",10000,3)
    println("========== Products==========")
    println(product1)
    println(product2)
    println(product3)
    println(product4)
    print("Enter Product ID : ")
    val productId = readln()
    print("Enter New Quantity : ")
    val quantity = readln().toInt()
    println("========== Product Updated ==========\n")


    when(productId){
        "P101" -> {
            println("Original:")
            println(product1)
            println("Copied:")
            println(product1.copy(quantity = quantity))
        }
        "P102" -> {
            println("Original:")
            println(product2)
            println("Copied:")
            println(product2.copy( quantity = quantity))
        }
        "P103" -> {
            println("Original:")
            println(product3)
            println("Copied:")
            println(product3.copy( quantity = quantity))
        }
        "P104" ->  {
            println("Original:")
            println(product4)
            println("Copied:")
            println(product4.copy( quantity = quantity))
        }
        else -> println("Invalid ID")
    }




}
fun main(){
    getUserInput()
}

