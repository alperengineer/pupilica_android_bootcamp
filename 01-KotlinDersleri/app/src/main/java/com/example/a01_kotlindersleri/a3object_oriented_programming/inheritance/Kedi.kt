package com.example.a01_kotlindersleri.a3object_oriented_programming.inheritance

class Kedi: Memeli() {
    override fun sesCıkar() {
        // super.sesCıkar() -> Kalıtım ile üst sınıfı temsil eder
        println("Miyavvv")
    }
}