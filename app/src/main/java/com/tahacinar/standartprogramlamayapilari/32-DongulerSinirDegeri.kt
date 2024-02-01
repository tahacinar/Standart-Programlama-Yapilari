package com.tahacinar.standartprogramlamayapilari

fun main(){

    //3 ile 6

    for (i in 3..6){
        println("Döngü 1 : $i")
    }

    var sayac = 3

    while (sayac < 7){
        println("Döngü 2 : $sayac")
        sayac += 1
    }

    // 0 ile 8 2 şer

    for (i in 0..8 step 2){
        println("Döngü 3 : $i")
    }

    var sayac1 = 0

    while(sayac1 < 9){
        println("Döngü 4 : $sayac1")
        sayac1+=2
    }

    //8 den 0 2 şer azalsın

    for (i in 8 downTo 0 step 2){
        println("Döngü 5 : $i")
    }

    var sayac2 = 8

    while(sayac2 > -1){
        println("Döngü 6 : $sayac2")
        sayac2-=2
    }

}