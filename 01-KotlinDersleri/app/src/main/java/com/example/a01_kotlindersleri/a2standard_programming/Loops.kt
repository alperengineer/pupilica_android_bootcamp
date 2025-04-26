package com.example.a01_kotlindersleri.a2standard_programming

fun main(){
    // for loop
    for (i in 1..10){
        println("Index: $i")
    }

    for(x in 10..20 step 5){
        println("Number: $x")
    }

    for(a in 25 downTo  5 step 3) {
        println("DownTo: $a")
    }

    // while loop
    var num = 1
    while(num < 10){
        println("Number: $num")
        num +=1
    }
}