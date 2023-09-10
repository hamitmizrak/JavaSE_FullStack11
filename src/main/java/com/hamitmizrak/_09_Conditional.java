package com.hamitmizrak;

import java.util.StringTokenizer;

public class _09_Conditional {
    public static void main(String[] args) {
        // Conditional
        int number = 5;

        // if else
        if (number == 1) {
            System.out.println("Sayı 1");
        } else {
            System.out.println("Farklı sayıdır");
        }

        //Ternary
        String ternarydata = (number == 1) ? "Sayı 1" : "Farklı sayıdır";
        System.out.println(ternarydata);

        // if elseif else
        if (number == 1) {
            System.out.println("Sayı 1");
        } else if (number == 2) {
            System.out.println("Sayı 2");
        } else if (number == 4) {
            System.out.println("Sayı 4");
        } else if (number == 5) {
            System.out.println("Sayı 5");
        } else if (number == 3) {
            System.out.println("Sayı 3");
        } else {
            System.out.println("Farklı sayıdır");
        }

        // switch Case
        switch (number) {
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            case 5:
                System.out.println("Sayı 5");
                break;
            default:
                System.out.println("Farklı sayıdır");
                break;
        }

        System.out.println("\n*******************************");
        ////////////////////////////////////////////////////////////////////////////////////////
        // Loop
        // break, return,continue
        // Date
        // Exception Handling
        // Access Modifier (public-private-default-protected)
        // Class bileşenleri
        // Override
        // Overloading
        // Encapsulation
        // Method
        // Primitive Method
        // Recursive Method
        // Enum
        // Dizi
        // Inner Class
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
    }
}
