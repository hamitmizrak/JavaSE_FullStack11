package com.hamitmizrak;

///////////////////////////////////////////////////////////////////
// Class bileşenleri
// Override
// Overloading
// Encapsulation
// Inner Class

///////////////////////////////////////////////////////////////////
// Dizi
// File
// Threading
// Collections
// Java 8 gelen özelliklerde
// OOP
// Class (Lombok)
// inheritance
// abstract
// interface
// polymorhism
// this, super
// new, null,zero
public class _15_IterativeRecursive {


    // 1-) voidliParametresiz
    public static void voidliParametresiz() {
        System.out.println("voidli Parametresiz");
    }

    // 2-) voidliParametreli
    public static void voidliParametreli(String name) {
        System.out.println("voidli Parametreli " + name);
    }

    // 3-) voidsizParametresiz
    public static String voidsizParametresiz() {
        return "voidsiz Parametresiz";
    }

    // 4-) voidsizParametreli
    public static String voidsizParametresiz(String name) {
        return "voidsiz Parametreli " + name;
    }

    // Overloading
    public static String voidsizParametresiz(String name,String surname) {
        return "voidsiz Parametreli " + name+ " "+surname;
    }

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("Hamit Mızrak");

        String temp3 = voidsizParametresiz();
        System.out.println(temp3);

        String temp4 = voidsizParametresiz("Hamit");
        System.out.println(temp4);

        String temp5 =  voidsizParametresiz("HAmit","Mızrak");
        System.out.println(temp5);
    }
}
