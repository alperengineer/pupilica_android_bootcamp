package com.example.a01_kotlindersleri.a4functions

fun main() {

    val sonuc = 5
    println(sonuc.carp(3))
    println(sonuc carp2 8)

}

fun Int.carp(sayi:Int):Int{
    return this *sayi
}

infix fun Int.carp2(sayi: Int):Int{
    return this*sayi
}