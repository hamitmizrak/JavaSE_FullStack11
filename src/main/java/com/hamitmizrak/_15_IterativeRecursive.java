package com.hamitmizrak;

import java.util.Scanner;

// Enum
enum EFactoriyel {
    ITERATIVE_FACTORIYEL, RECURSIVE_FACTORIYEL
}

// static
class StaticData {
    // Const
    public static final String SYSTEM_LOGOUT = "Çıkış yapılıyor...";
}

// Faktöriyel hesaplayan iterative ve recursive java kodlarını yazınız ?
public class _15_IterativeRecursive {

    // Global Variable
    private static Scanner klavye = new Scanner(System.in);

    // Kullanıcıdan veri almak
    public Integer scannerUserData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nLütfen Faktöriyel için sayı giriniz");
        int number = klavye.nextInt();
        if (number < 0) {
            System.out.println("Negatif sayısının faktöriyeli olmaz");
            scannerUserData();
        } else if (number == 0 || number == 1) {
            System.out.println("0 ve 1 sayısını faktöriyeli 1'dir");
            scannerUserData();
        }
        return number;
    }

    // iterative factoriyel
    public void iterativeFactoriyel(int number) {
        int resultFactoriyel = 1;
        for (int i = number; i >= 1; i--) {
            resultFactoriyel *= i;
        }
        System.out.println(number + " sayısını faktöriyeli :" + resultFactoriyel);
    }

    // recursive factoriyel
    public int recursiveFactoriyel(int number) {
        if (number == 0 || number == 1)
            return 1;
        return number * recursiveFactoriyel(number - 1);
    }

    public void allIterativeAndResursiveMethod() {
        _15_IterativeRecursive iterativeRecursive = new _15_IterativeRecursive();
        // sonsuz method
        while (true) {
            // kullanıcıdan veri almak
            int number = scannerUserData();

            // Kullanıcıdan seçim almak
            System.out.println("Lütfen Seçiniz:\n1-) Iterative Method\n2-) Recursive\n3-) Çıkış");
            int chooise = klavye.nextInt();
            switch (chooise) {
                case 1:
                    iterativeFactoriyel(number);
                    break;
                case 2:
                    int result = recursiveFactoriyel(number);
                    System.out.println(number + " sayısını faktöriyeli :" + result);
                    break;
                case 3:
                    System.out.println(StaticData.SYSTEM_LOGOUT);
                    System.exit(0);
                    break;
                default:
                    System.out.println("sadece size verilen aralıkta sayı girebilirsiniz");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        _15_IterativeRecursive iterativeRecursive = new _15_IterativeRecursive();
        iterativeRecursive.allIterativeAndResursiveMethod();
    }

}
