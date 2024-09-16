package com.example.functions

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun functionsMain(){
        //for sum
        println("Sum: ${sum(3,9)}")
        println("Sum: ${sum(10,20)}")
        // for palindrome
        val testString1 = "women"
        val testString2 = "racecar"
        println("$testString1 is palindrome: ${isPalindrome(testString1)}")
        println("$testString2 is palindrome: ${isPalindrome(testString2)}")
        //for applyDiscount
        val price = 4000
        val price2 = 7000
        println("Discounted price for: ${applyDiscount(price)}")
        println("Discounted price for: ${applyDiscount(price2)}")
        //for processPayment
//        val success = processPayment(3000.0)
//        if (success) {
//            println("Payment processed successfully.")
//        } else {
//            println("Failed to process payment.")
//        }
    }
}