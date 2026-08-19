package org.example.problem_solving.lambdaFunctions.classwork

data class Product(
    val name: String,
    val price: Double
)

fun main() {

    val products = listOf(
        Product("Laptop", 60000.0),
        Product("Mouse", 800.0),
        Product("Keyboard", 1500.0),
        Product("Headset", 2500.0),
        Product("Webcam", 900.0)
    )

    products.forEach { println("${it.name} : ₹${it.price}") }
    println()
     println("Products costing ₹1000 or more:")
     val expensiveProducts = products.filter { it.price>=1000 }
    expensiveProducts.forEach { println("${it.name} : ₹${it.price}") }
    println()
    println("Products after 10% discount:")
    val applyDiscount = products.map { Product(it.name ,it.price - (it.price*10/100) )}
    applyDiscount.forEach { println("${it.name} : ₹${it.price}") }
    println()
    println("Products below ₹1000 after discount:")
    val below1000 = applyDiscount.filter { it.price<1000 }
    below1000.forEach { println("${it.name} : ₹${it.price}") }


}
