package com.example.a01_kotlindersleri.a3object_oriented_programming

fun main() {
    val a = ClassA()

    // Standart nesne tabanlı erişim
    // println(a.x)
    // a.method()

    // Sanal Nesne-Virtual Object- Nameless Object
    // println(ClassA.x)
    // ClassA().method()

    // static kullanımı
    println(ClassA.x)
    ClassA.method()

}