package com.tahacinar.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("İşlenecek veri miktarı giriniz")

    var veri = girdi.nextInt()

    while (veri > 0){
        println("$veri. veri")
        veri -= 1
    }


}