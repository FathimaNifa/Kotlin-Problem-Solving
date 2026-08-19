package org.example.problem_solving.collections.classWork.list

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int
){
    val total = (price * quantity).toInt()
}
val products = mutableListOf<Product>(Product(1001,"Mobile",35000.50,3))

fun addProduct(){
    print("Enter Product ID: ")
    val id = readln().toInt()
    print("Enter Product Name: ")
    val name = readln()
    print("Enter Product Price: ")
    val price = readln().toDouble()
    print("Enter Product Quantity: ")
    val quantity = readln().toInt()

    val product =Product(id =id, name=name, price=price, quantity=quantity)

    products.add(product)


}


fun viewProduct() {
    println("Products")
    products.forEach{
        println("ID          :${it.id}")
        println("Name        :${it.name}")
        println("Price       :₹${it.price}")
        println("Quantity    :${it.quantity}")
        println("Total       :${it.total}")

    }
}

fun removeProduct(){
    print("Enter the index: ")
    val index = readln().toInt()
    products.removeAt(index)

}
fun getTotal(){
    var totalAmount =0
    products.forEach{
        totalAmount+=it.total
    }
    println("Total      :₹$totalAmount")
}
fun getUserInput(){
    while(true){
        println("====== Shopping Cart ======")
        println()
        println("1. Add Product")
        println("2. View Cart")
        println("3. Remove Product")
        println("4. Calculate Total")
        println("5. Exit")
        println()
        println("--------------------------")
        println()
        print("Enter your Choice: ")

        val choice = readln().toInt()

        when(choice){
            1-> {
                addProduct()
                }
            2->{
                viewProduct()
            }
            3->{
                removeProduct()
            }
            4->{
                getTotal()
            }
            5-> break
        }
    }

}


fun main(){
    getUserInput()
}
