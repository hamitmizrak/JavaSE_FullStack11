package com.hamitmizrak;

import java.util.Random;
import java.util.Scanner;

// Dizi
public class _16_2_Array {
    // step-1: rastegele 1 ile 9 arasında kullanıcının verdiği sayıya göre
    // dizi eleman sayısını yazan method yazınız ?
    public static int[] arrayMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi eleman sayısını girniz");
        int userData = scanner.nextInt();
        // Random

        // Dizi
        int[] dizi = new int[userData];
        for (int i = 0; i < dizi.length; i++) {
            Random random = new Random();
            dizi[i] = random.nextInt(9) + 1;
        }
        for (int temp : dizi) {
            System.out.print(temp + " ");
        }
        return dizi;
    }

    // step-2 bu diziden
    // Tek sayıları diziye atayın ?
    // kaç tane adeti ?
    // tek sayıların toplamı ?
    public static int[] arrayProcess(int... dizi) { // Java Ellipsis
        int oddCounter=0;
        for (int i = 0; i < dizi.length; i++) {
            // Dizilerde dizi eleman sayısı
            if (dizi[i] % 2 == 1) {
                oddCounter++;
            }
        }
        System.out.println("********");

        int[] oddArray = new int[oddCounter];
        for (int i = 0; i < oddArray.length; i++) {
            //  Tek diziler
            if (dizi[i] % 2 == 1) {
                oddArray[i] = dizi[i];
            }
        }

        for (int temp : oddArray) {
            System.out.print(temp + " ");
        }
        return oddArray;
    }

    // step-3
    // 2 4 5 5 5
    // aynı olan sayıları başka bir diziye atayalım
    // tekrar eden sayı adeti
    // sayılardan tekrarsız olarak ekranda gösterelim
    // public static void arrayProcess(int [] dizi){}

    public static void main(String[] args) {
        // Random
        // arrayMethod();
        // Dizilerden tek olanarı buluyor
        arrayProcess( arrayMethod());
    }

}
