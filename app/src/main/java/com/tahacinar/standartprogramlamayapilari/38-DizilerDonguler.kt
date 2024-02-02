package com.tahacinar.standartprogramlamayapilari

fun main(){

    val meyveler = arrayOf<String>("Çilek","Muz","Elma","Kivi","Kiraz")

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("Sonuç $indeks : $meyve")
    }


}