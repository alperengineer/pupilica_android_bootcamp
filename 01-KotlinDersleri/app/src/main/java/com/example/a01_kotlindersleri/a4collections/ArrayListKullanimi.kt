package com.example.a01_kotlindersleri.a4collections

fun main() {
    // Tan?mlama
    val fruits = ArrayList<String>()

    // Veri Ekleme
    // add() fonksiyonu mevcut listenin en sonuna ekler
    fruits.add("Elma") // index->0
    fruits.add("Muz") // index->1
    fruits.add("Kiraz") // index->2
    fruits.add("Kavun") // // index->3
    fruits.add("Armut") // index->4

    println(fruits)

    // Veri Güncelleme
    fruits[1] = "Banana"
    println(fruits)

    // Insert: ?stedi?imiz bir index'e ekleme yapar
    fruits.add(1, "Portakal")
    println(fruits)

    // Okuma
    val muz = fruits.get(1)
    println(2)

    // Listenin Boyutunu Ö?renme
    println("Boyut: ${fruits.size}")

    // forEach
    for(fruit in fruits){
        println("Fruit Name: ${fruit}")
    }

    for((index, fruit) in fruits.withIndex()){
        println("Index: ${index}, Fruit Name: ${fruit}")
    }

    // Silme
    fruits.removeAt(2) // ?stenen index'teki eleman? siler
    println(fruits)

    fruits.clear() // Listeyi tamamen siler
    println(fruits)

}