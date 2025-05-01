package com.example.a01_kotlindersleri.a4collections

fun main() {

    // Any -> en üst s?n?f demektir
    // Bütün türleri kapsar

    /* HASH SET */
    // Tan?mlama
    val fruits = HashSet<String>()

    fruits.add("Apple")
    fruits.add("Mango")
    fruits.add("Banana")

    println(fruits)

    // Eklenen bir verinin ayn?s? tekrar eklenemez
    fruits.add("Apple")
    println(fruits)

    val f = fruits.elementAt(1)
    println(f)

    for(fruit in fruits){
        println("Fruit Name: ${fruit}")
    }

    for((index, fruit) in fruits.withIndex()){
        println("Index: ${index}, Fruit Name: ${fruit}")
    }
}