package com.hamitmizrak;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutionException;

public class _13_ExceptionHandling {

    public static void main(String[] args) throws IndexOutOfBoundsException,ClassNotFoundException {
        try {
            int divideResult = 4 / 0;
            System.out.println(divideResult);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("db.close");
            System.out.println("socket.close");
        }
        // Exception Handling

        System.out.println("Son Satır");
        throw new HamitMizrakException("Burada bir hata var Dikkat !!!!!");
    }


    ///////////////////////////////////////////////////////////////////
    // Access Modifier (public-private-default-protected)
    // Method
    // Primitive Method
    // Recursive Method

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
}
