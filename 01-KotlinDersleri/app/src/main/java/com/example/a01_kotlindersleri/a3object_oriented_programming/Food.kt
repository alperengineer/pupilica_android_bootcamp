package com.example.a01_kotlindersleri.a3object_oriented_programming

data class Food(var id:Int, var name:String, var price:Int) {
// Sınıflara --data-- keywordünü kullanırsak getter-setter gibi fonskiyonları otomatik oluşur

    //Constructor-init method
    init {
        println("!!!Food Sınıfından Nesne Oluştu!!!")
    }


    fun bilgiAl(){
        println("---Yemek 1----")
        println("Id: ${this.id} | Ad: ${this.name} | Fiyat: ${this.price}")
        // this -> Bulunduğu sınıfı temsil eder
    }

    // SUPER: Kalıtım ile bir üst sınıfı temsil eder

}