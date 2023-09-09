package com.hamitmizrak;

public class _07_SystemMath {
    public static void main(String[] args) {

        System.err.println("Ekran Çıktısı");
        System.out.println("MATH");
        System.out.println(Math.min(2,99));
        System.out.println(Math.max(2,99));

        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(-44));

        System.out.println(Math.sin(45));
        System.out.println(Math.asin(-1));

        System.out.println(Math.floor(4.9));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.round(2.4));
        System.out.println(Math.round(2.5));

        System.out.println(Math.ceil(Math.random()*9+1));
    }
}
