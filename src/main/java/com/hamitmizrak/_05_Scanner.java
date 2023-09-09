package com.hamitmizrak;

import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {
        int x = 5;
        int k = 3;
        int y = 3 * x + 4 * k;
        System.out.println(y);

        Scanner scanner = new Scanner(System.in);
        System.out.println("x sayısını giriniz");
        int x2 = scanner.nextInt();
        System.out.println("k sayısını giriniz");
        int k2 = scanner.nextInt();
        int y2 = 3 * x2 + 4 * k2;
        System.out.println(y2);


        // VKİ: Vucut Kitle indeksi:
        // Kullanıcıdan aldığımız Boy ve Kilo'a göre VKİ hesaplayan Java algoritmasını yazınız ?
        // Formül ==> vki=kilo/boy*boy
        // Tips: double değişkeni ile yapabilirsiniz
        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilounuzu giriniz");
        double kilo = scanner.nextDouble();

        double vki = (kilo / (boy * boy));
        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + kilo);
        System.out.println("Sonuç: " + vki);
        System.out.println("Vücut Kitle index: " + vki);

    }
}
