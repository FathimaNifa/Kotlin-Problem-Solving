package org.example.problem_solving.operators

fun main() {
    getCustomerDetails()

}
fun getCustomerDetails(){
    print("Enter Customer Name        : ")
    val customerName = readln()
    print("Enter Item1 Price          : ")
    val item1Price = readln().toInt()
    print("Enter Item1 Quantity       : ")
    val item1Quantity  = readln().toInt()
    print("Enter Item2 Price          : ")
    val item2Price  = readln().toInt()
    print("Enter Item2 Quantity       : ")
    val item2Quantity = readln().toInt()
    print("Enter Item3 Price          : ")
    val item3Price = readln().toInt()
    print("Enter Item3 Quantity       : ")
    val item3Quantity = readln().toInt()
    print("Enter GST Percentage       : ")
    val gstPercent = readln().toInt()
    print("Enter Discount Percentage  : ")
    val disPercent = readln().toInt()
    val item1 = calculateItem1(item1Price,item1Quantity  )
    val item2 = calculateItem2(item2Price,item2Quantity  )
    val item3 = calculateItem3(item3Price,item3Quantity  )
    val subTotal = calculateSubtotal(item1, item2, item3)
    val gst = calculateGST(subTotal, gstPercent)
    val discount = calculateDiscount(subTotal,disPercent)
    val finalAmount = calculateFinalAmount(subTotal, gst, discount)
    printRestaurantBill(customerName, item1, item2, item3, subTotal, gst, discount, finalAmount, gstPercent,disPercent, item1Price, item2Price, item3Price, item1Quantity, item2Quantity, item3Quantity)

}


fun printRestaurantBill(customerName : String, item1 : Int, item2 : Int, item3 : Int, subTotal: Int, gst : Int, discount: Int, finalAmount : Int, gstPercent: Int, disPercent: Int,item1Price: Int,item2Price: Int,item3Price: Int,item1Quantity: Int, item2Quantity: Int,item3Quantity: Int) {
    println("========================================")
    println("          RESTAURANT BILL")
    println("========================================")
    println()
    println("Customer Name : $customerName")
    println()
    println("Burger  ₹$item1Price*$item1Quantity : ₹$item1")
    println("Pizza   ₹$item2Price*$item2Quantity : ₹$item2")
    println("Juice   ₹$item3Price*$item3Quantity  : ₹$item3")
    println()
    println("----------------------------------------")
    println("SubTotal        : ₹$subTotal")
    println("GST (%$gstPercent)        : ₹$gst")
    println("Discount (%$disPercent)  : ₹$discount")
    println("----------------------------------------")
    println("Final Amount    : ₹$finalAmount")
    println()
    println("========================================")
    println("        THANK YOU! VISIT AGAIN...")
    println("========================================")
}
fun calculateItem1(item1Price: Int, item1Quantity: Int ): Int = item1Price * item1Quantity



fun calculateItem2(item2Price: Int, item2Quantity: Int ): Int = item2Price * item2Quantity


fun calculateItem3(item3Price: Int, item3Quantity: Int ): Int = item3Price * item3Quantity

fun calculateSubtotal(item1: Int, item2 : Int, item3 : Int): Int = item1+item2+item3



fun calculateGST(subTotal: Int, gstPercent: Int): Int = (subTotal*gstPercent)/100


fun calculateDiscount(subTotal: Int, disPercent: Int): Int = (subTotal*disPercent)/100

fun calculateFinalAmount(subTotal: Int, gst: Int, discount: Int): Int = subTotal+gst-discount


//## Problem Statement
//
//Develop a restaurant billing application.
//
//### Input
//
//Ask the customer to enter:
//
//- Customer Name
//- Item 1 Price
//- Item 1 Quantity
//- Item 2 Price
//- Item 2 Quantity
//- Item 3 Price
//- Item 3 Quantity
//- GST Percentage
//- Discount Percentage
//
//### Calculate
//
//For each item:
//
//```
//Item Total = Price × Quantity
//```
//
//Then calculate:
//
//```
//Subtotal
//
//GST Amount
//
//Discount Amount
//
//Final Bill
//```
//
//### Formula
//
//```
//Subtotal = Item1 + Item2 + Item3
//
//GST = Subtotal × GST % /100
//
//Discount = Subtotal × Discount % /100
//
//Final Bill = Subtotal + GST − Discount
//```
//
//### Expected Output
//
//```
//==========================================
//RESTAURANT BILL
//==========================================
//
//Customer : Kannan
//
//Burger        ₹120 × 2 = ₹240
//Pizza         ₹300 × 1 = ₹300
//Juice         ₹80  × 3 = ₹240
//
//------------------------------------------
//Subtotal      : ₹780
//GST (5%)      : ₹39
//Discount (10%): ₹78
//
//------------------------------------------
//Final Amount  : ₹741
//
//==========================================
//THANK YOU! VISIT AGAIN
//==========================================
//```
//
