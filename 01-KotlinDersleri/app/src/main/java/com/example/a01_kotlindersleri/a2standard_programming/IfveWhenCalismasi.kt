package com.example.a01_kotlindersleri.a2standard_programming

fun main() {
    val age = 23

    if (age >= 18){
        println("Reşit")
    } else {
        println("Resit değil")
    }

    val nickname = "admin"
    val password = 123456
    val sayi = 10

    if (nickname == "admin" && password == 123456){
        println("Giriş Başarılı")
    }else{
        println("Hatalı Giriş")
    }

    // WHEN, diğer dillerde SWITCH 5r

    when(sayi) {
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        10 -> println("Sayı 10'dur")
        else -> println("Tanımlanmamış sayı")
    }
}