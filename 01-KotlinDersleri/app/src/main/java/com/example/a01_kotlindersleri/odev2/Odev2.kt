package com.example.a01_kotlindersleri.odev2

import kotlin.ranges.downTo

fun main() {

    println("Fahrenhiet: ${celciusToFahrenhiet(26.3)}")
    println("Çevre: ${calculateEnv(12.4, 22.5)}")
    println("Faktöriyel: ${calculateFactorial(5)}")
    println("Kelimenin içinde ${howManyA("Alperen Oğuz Küçükçal")} tane 'A/a' var")
    println("İç açılar toplamı: ${calculateInteriorAngle(5)}")
    println("Maaş: ${calculateSalary(20)}")
    println("Maaş: ${calculateSalary(21)}")
    println("Fatura Bedeli: ${calculatePrice(122)}")
    println("Fatura Bedeli: ${calculatePrice(48)}")

}

// SORU 1
/* 1. Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren bir metod yazınız. F = C x 1.8 + 32 */
fun celciusToFahrenhiet(degree: Double): Double {
    var fahrenhiet = degree * 1.8 + 32

    return fahrenhiet
}


// SORU 2
/* 2. Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız */
fun calculateEnv(edge1: Double, edge2: Double): Double {
    return (edge1 + edge2) * 2
}


//  SORU 3
/* 3. Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız */

fun calculateFactorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}


// SORU 4
/* 4. Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız */
fun howManyA(word: String): Int {
    return word.lowercase().count() { it == 'a' }
}


// SORU 5
/* 1. Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metod yazınız. İç açılar toplamı = (Kenar sayısı - 2) x 180 */
fun calculateInteriorAngle(egdeNumber: Int): Int {
    var angle = 0
    if (egdeNumber >= 2) {
        angle = (egdeNumber - 2) * 180
    } else {
        angle = -1
    }
    return angle
}

// SORU 6
/* 2. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
1 günde 8 saat çalışılabilir.
Çalışma saat ücreti: 10 も
Mesai saat ücreti: 20も
160 saat üzeri mesai sayılır */
fun calculateSalary(day: Int): Int {
    var workingHour = day * 8
    var salary = 0

    if (workingHour > 160) {
        val tmp = workingHour - 160
        salary = (160 * 10) + (tmp * 20)
    } else {
        salary = workingHour * 10
    }
    return salary
}

// SORU 7
/* 3. Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
50 GB = 100 TL
Kota aşımından sonra her 1 GB, 4 TL'dir */
fun calculatePrice(gb: Int): Int {
    var price = 0
    if (gb > 50) {
        val tmp = gb - 50
        price = 100 + (tmp * 4)
    } else {
        price = 100
    }
    return price
}