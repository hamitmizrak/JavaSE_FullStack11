package com.hamitmizrak;

import java.util.Scanner;

public class _06_Cast {
    public static void main(String[] args) {

        // String'ten Tam sayıya çevir
        String str1="10";
        int number1=Integer.valueOf(str1);
        int number2=Integer.parseInt(str1);

        System.out.println(str1+10);
        System.out.println(number1+10);
        System.out.println(number2+10);

        System.out.println("----------------------\n");
        // Tam sayıyadan  String'e çevir
        int number3=10;
        String str2=String.valueOf(number3);
        String str3=Integer.toString(number3);
        System.out.println(number3+10);
        System.out.println(str2+10);
        System.out.println(str3+10);
    }
}
