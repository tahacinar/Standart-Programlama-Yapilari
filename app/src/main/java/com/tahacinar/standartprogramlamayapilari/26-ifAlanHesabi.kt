package com.tahacinar.standartprogramlamayapilari

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    println("Dikdörtgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz : $secim")

    if (secim == 1){
        println("Kısa kenar giriniz")
        val kisiKenar = girdi.nextInt()

        println("Uzun kenar giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdörtgen Alanı")
        val dikdortgenAlani = kisiKenar * uzunKenar
        println("Sonuç : $dikdortgenAlani")
    }

    if (secim == 2){
        println("Yarı çap giriniz")
        val yariCap = girdi.nextInt()

        println("Çember Alanı")
        val cemberAlani = 3.14 * yariCap * yariCap
        println("Sonuç : $cemberAlani")
    }


}