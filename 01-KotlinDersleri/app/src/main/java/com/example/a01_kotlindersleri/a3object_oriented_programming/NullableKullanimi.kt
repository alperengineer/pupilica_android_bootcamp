package com.example.a01_kotlindersleri.a3object_oriented_programming

fun main() {
    // Nullable, Null Safety, Optional(Swift)
    // Genellikle mobil uygulama geliştirme dillerinde olmaktadır
    // null, NaN, nil

    var msg: String? = null
    // msg = "Hello World"

    // Yöntem 1
    println("Yöntem 1: ${msg?.uppercase()}") // Sorun yoksa çalışır, sorun var ise uygulama çökmez

    // Yöntem 2
    // Çok emin olduğumuz kod bloklarında kullanılabilir
    //println("Yöntem 2: ${msg!!.uppercase()}")  // Sorun yoksa çalışır, sorun var ise uygulama çöker

    // Yöntem 3
    // konrol blokları ile null kontrolü
    if (msg != null) {
        println("Yöntem 3: ${msg.uppercase()}")
    } else {
        println("Değişken null değer dönmektedir")
    }

    msg?.let { // burası yalnızca if != bloğunun karşılığıdır
        println("Yöntem 3: ${msg.uppercase()}")
    }
}