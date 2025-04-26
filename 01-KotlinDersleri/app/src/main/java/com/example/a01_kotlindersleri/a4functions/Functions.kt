package com.example.a01_kotlindersleri.a4functions

class Functions {

    // void: Sadece işlem yapar geri dönüş değerleri olmaz
    fun selamla1() {
        val result = "Hello World"
        println(result)
    }


    // return: İşlemleri yapar ve bir değer geri döndürür
    fun selamla2(): String {
        val result = "Hello World"
        return result
    }

    // parametre
    fun selamla3(name:String){
        val result = "Hello $name"
        println(result)
    }

    // overloading: Bir sınıf içinde aynı isimde fonksiyonları tekrar kullanmaktır
    fun topla(n1:Int, n2:Int){
        println("Toplam=${(n1+n2)}")
    }

    fun topla(n1:Int, n2:Int, n3:Int){
        println("Toplam=${(n1+n2+n3)}")
    }

    fun topla(n1:Double, n2:Double){
        println("Toplam=${(n1+n2)}")
    }
}