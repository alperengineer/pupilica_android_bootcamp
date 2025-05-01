package com.example.a01_kotlindersleri.a4collections

fun main() {
    /* HASH MAP */
    // HashMap JSON veri modeline benzemektedir(key-value)
    // SharedPreferences, DataStore, UserDefault(Swift) benzemektedir

    // Tan?mlama
    val iller = HashMap<Int, String>()

    iller.put(20,"Denizli")
    iller[32] = "Isparta"

    println(iller)
    println("Boyut: ${iller.size}")

    for((anahtar, deger) in iller) {
        println("${anahtar} -> ${deger}")
    }

}