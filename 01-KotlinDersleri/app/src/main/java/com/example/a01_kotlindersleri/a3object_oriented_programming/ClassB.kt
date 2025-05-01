package com.example.a01_kotlindersleri.a3object_oriented_programming

class ClassB: MyInterface {
    override var degisken: Int = 23

    override fun method1() {
        println("Method 1 is working")
    }

    override fun method2(): String {
        return "Method 2 is working"
    }
}