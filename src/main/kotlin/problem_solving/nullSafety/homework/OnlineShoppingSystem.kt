package org.example.problem_solving.nullSafety.homework



class Product{
    var productID = ""
    var productName :String ? = ""
    var category : String ? = ""
    var price = 0
    var discount : Int? = 0


    fun displayProduct(){
        println("===========Product==========")
        println("Product ID     : $productID")
        println("Product Name   : ${productName?: "Not Available"}")
        println("Category       : ${category?: "Not Available"}")
        println("Price          : ₹$price")
        println("Discount       : ${discount?: "Not Available"}")
        println()
        calculateFinalPrice(price,discount?:1)
    }

    fun calculateFinalPrice(price : Int, discount :Int){
        val calculateDiscount = (price* discount/100)
        val finalPrice = price - calculateDiscount
        println("Final Price    : ₹$finalPrice")
    }

}


fun main(){
    val product1 = Product()
    val product2 = Product()
    val product3 = Product()

    product1.productID = "P101"
    product2.productID = "P102"
    product3.productID = "P103"

    product1.productName = "Laptop"
    product2.productName = null
    product3.productName = "Mouse"

    product1.category = "Electronics"
    product2.category = null
    product3.category = "Accessories"

    product1.price = 60000
    product2.price = 1000
    product3.price = 2000

    product1.discount = 10
    product2.discount = 5
    product3.discount = null

product1.displayProduct()
product2.displayProduct()
product3.displayProduct()


}