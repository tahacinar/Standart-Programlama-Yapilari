package com.tahacinar.standartprogramlamayapilari

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(5) { "" }   //["","Yeni Kayıt","","",""]
    //0,1,2,3,4

    for(i in 0 until isimler.count()){ //0,1,2,3,4
        println("${i+1}. isim giriniz")
        val isim = girdi.next()
        isimler[i] = isim
    }



}