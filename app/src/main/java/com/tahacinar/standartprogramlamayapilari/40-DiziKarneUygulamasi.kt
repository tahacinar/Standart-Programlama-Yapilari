package com.tahacinar.standartprogramlamayapilari

import java.util.Scanner

fun main(){

    val dersler = Array<String>(5){""}//["tarih","fizik","","",""]
    val notlar = Array<Int>(5){0}//[40,60,4,0,0]

    val girdi = Scanner(System.`in`)

    for ( i in 0 until dersler.count() ) {//0,1,2,3,4
        println("${i+1}. dersi giriniz")
        val ders = girdi.next()
        dersler[i] = ders

        println("${i+1}. notu giriniz")
        val not = girdi.nextInt()
        notlar[i] = not
    }

}
