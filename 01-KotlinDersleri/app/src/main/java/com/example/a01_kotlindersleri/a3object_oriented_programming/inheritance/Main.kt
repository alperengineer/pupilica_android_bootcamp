package com.example.a01_kotlindersleri.a3object_oriented_programming.inheritance

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCıkar() // Kalıtım yok, kendi fonksiyonuna erişti
    memeli.sesCıkar() // Kalıtım var, üst sınıfın metoduna erişti
    kedi.sesCıkar() // Kalıtımı var fakat kendi metoduna üst sınıftan alınan metodu override ederek erişti
    kopek.sesCıkar() // Kalıtımı var fakat kendi metoduna üst sınıftan alınan metodu override ederek erişti

    // DOWNCASTING & UPCASTING
    // bu iki işlemin yapılabilmesi için iki sınıf arasında KALITIM ilişkisi olmalıdır

}