package com.tahacinar.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    val tercih = girdi.nextInt()

    println("Birinci sayıyı giriniz")
    val sayi1 = girdi.nextInt()

    println("İkinci sayıyı giriniz")
    val sayi2 = girdi.nextInt()

    if (tercih == 1){
        println("Toplama : ${sayi1+sayi2}")
    }else if (tercih == 2){
        println("Çıkarma : ${sayi1-sayi2}")
    }else if (tercih == 3){
        println("Çarpma : ${sayi1*sayi2}")
    }else if (tercih == 4){
        println("Bölme : ${sayi1/sayi2}")
    }

}