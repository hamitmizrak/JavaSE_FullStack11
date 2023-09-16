package com.hamitmizrak;

import java.util.Random;
import java.util.Scanner;

// Dizi
public class _16_2_Array {
    // step-1: rastegele 1 ile 9 arasında kullanıcının verdiği sayıya göre dizi eleman sayısını yazan method yazınız ?
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
        for (int temp: dizi) {
            System.out.print(temp+" ");
        }
        return dizi;
    }

    // step-2 bu diziden
    // Tek sayıları diziye atayın ?
    // kaç tane adeti ?
    // tek sayıların toplamı ?
    // aynı tek sayıların sayısı ? 4 2 2
    // public static void arrayProcess(int [] dizi){}
    public static void arrayProcess(int... dizi){ // Java Ellipsis

    }

    public static void main(String[] args) {
        arrayMethod();
    }

}
