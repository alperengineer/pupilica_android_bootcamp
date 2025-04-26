package com.example.a01_kotlindersleri.a1variables

fun main() {
    println("Hello World")

    var id = 1
    var name = "Mont"
    var photo = "mont.png"
    var point = 4.2
    var price = 2000
    var isStock = true

    println("ID:  $id")
    println("Ad:  $name")
    println("Resim:  $photo")
    println("Ürün Puanı: $point")
    println("Fiyat:  $price")
    println("Stok Durumu:  $isStock")

    /* val & var*/
    // var(variable): bu şekilde tanımlı değişkenler sonradan değiştirilebilir
    // val(value): daha sonradan değiştirilemez -constant-


    /* Type Casting */
    val num1 = 89.56
    val num2 = 34
    val i = num1.toInt();
    val d = num2.toDouble()

    println("i: $i")
    println("d: $d")

    // Arayüzde bir componentte bir değişken kullanılcaksa o değişken String'e çevirilmeli
    // Arayüzden gelen verilerde String olarak gelir

    
}