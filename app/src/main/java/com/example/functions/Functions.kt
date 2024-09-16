package com.example.functions

fun sum (a: Int = 0, b: Int = 0) : Int{
    val result = a + b
    return result
}

fun isPalindrome (string: String) : Boolean{
    val givenString  = string.filter {
        it.isLetterOrDigit()
    }
    return givenString == givenString.reversed()
}

fun applyDiscount (price : Int): Double {
    if(price >= 5000) {
        val discountAmount = price / 10
        val totalPrice = price - discountAmount
        println("Discounted Price: ${totalPrice}")
    }
    return price.toDouble()
}


