package com.example.a01_kotlindersleri.a3object_oriented_programming

fun main() {

}

fun ucretHesapla(boyut: KonserveBoyut, adet: Int){

    when(boyut){
        KonserveBoyut.KUCUK -> println("${adet * 104} TL")
        KonserveBoyut.ORTA -> println("${adet * 207} TL")
        KonserveBoyut.BUYUK -> println("${adet * 309} TL")
    }

}