package org.example.problem_solving.collections.classWork.map



val product = mutableMapOf<Int, Int>()

fun addProduct(){
    print("Enter Product Id :")
    val productID = readln().toInt()
    print("Enter Product Quantlty :")
    val quantity = readln().toInt()
    product[productID] = quantity

}


fun removeProduct(){
    print("Enter Product Id :")
    val productID = readln().toInt()
   product.remove(productID)
    println("Prdouct Removed Successfully !")

}

fun checkStock(){
    print("Enter Product Id :")
    val productID = readln().toInt()
   if( product.contains(productID)) {
       println("Product Avaliable")
   }else{
       println("Product Not Avaliable")
   }

}



fun getUserInput(){
    while (true) {
        println("====== Product Inventory ======")
        println()
        println("1. Add Product")
        println("2. View Inventory")
        println("3. Update Quantity")
        println("4. Remove Producte")
        println("5. Check Stock")
        println("6. Exit")
        println()
        println("--------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
            addProduct()
                println("Product Added Successfully!")
            }
            2 -> {
                println(product)
            }
            3 -> {
                addProduct()
                println("Product Updated Successfully!")
            }
            4 ->{
                removeProduct()
            }
            5 ->{
                checkStock()
            }
            6 -> {
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