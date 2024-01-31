package com.tahacinar.standartprogramlamayapilari

import java.util.Scanner

fun main (){

    var yas = 17
    var isim = "Taha"

    // Örnek 1
    if (yas >= 18 ){
        println("Reşitsiniz")
    }

    // Örnek 2
    if ( yas >= 18 ){
        println("Reşitsiniz")

    } else {
        println("Reşit değilsiniz")
    }

    // Örnek 3

    if ( isim == "Ahmet" ){
        println("Merhaba Ahmet")

    } else {
        println("Tanınmayan Kişi")
    }

    // Örnek 4

    println("Vize Notunuzu Giriniz")
    val girdi = Scanner(System.`in`)
    val vize = girdi.nextInt()

    println("Final Notunuzu Giriniz")
    val final = girdi.nextInt()

    var ortalama = (vize*0.4)+(final*0.6)
    println("Ders Notunuz: $ortalama")

    if ( ortalama > 90 ){
        println("AA ile geçtiniz.")
    } else if (ortalama > 75) {
        println("BA ile geçtiniz.")
    } else if (ortalama > 60) {
        println("BB ile geçtiniz.")
    } else if (ortalama > 50) {
        println("CB ile geçtiniz.")
    } else if (ortalama <= 49) {
        println("Kaldınız.")
    }else {
        println("Geçerli bir not giriniz")
    }


    //Örnek 5 çoklu şart and

    var kullaniciAdi = "adminx"
    var sifre = 12345

    if (sifre == 12345 && kullaniciAdi == "admin"){// true and true : true
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }

    //Örnek 6 çoklu şart or

    var sinif = 10

    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12){//
        println("AYT sınavına hazırlanabilirsiniz")
    }

    //Örnek 7 kısaltma

    var a = 10
    var b = 14

    if ( a == b)  println("Eşit") else  println("Eşit Değil")

}




