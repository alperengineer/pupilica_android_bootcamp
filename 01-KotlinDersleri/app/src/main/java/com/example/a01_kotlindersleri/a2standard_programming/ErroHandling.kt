package com.example.a01_kotlindersleri.a2standard_programming

fun main() {

    // 1- Compile Error: Kodlama yaparken olur
    // val sayi = 100
    // sayi = 200

    // 2- Runtime Error ( Exceptions )
    val z = 10
    val y = 0

    try {
        println("Sonuç = ${z / y}")
        println("??lem tamamland?")
    } catch (e: Exception) {
        println("?kinci say? 0 olamaz. ${e.message}")
    }

}