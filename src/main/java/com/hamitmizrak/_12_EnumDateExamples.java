package com.hamitmizrak;

import java.util.Date;

public class _12_EnumDateExamples {
    public static void main(String[] args) {
        // Enum değişkeni haftanın günlerine göre yazınız.
        // Bu zamanın günü ile eşleştirip gün bilgisini bize söyleyen algoritma ?

        int day=new Date().getDay();
        // System.out.println(day);
        // Not: pazar sıfırda(0) sayarak başlar

        // switch Case
        switch (day) {
            case 0:
                System.out.println(WeekDayInExamples.PAZAR);
                break;
            case 1:
                System.out.println(WeekDayInExamples.PAZARTESI);
                break;
            case 2:
                System.out.println(WeekDayInExamples.SALI);
                break;
            case 3:
                System.out.println(WeekDayInExamples.CARSAMBA);
                break;
            case 4:
                System.out.println(WeekDayInExamples.PERSEMBE);
                break;
            case 5:
                System.out.println(WeekDayInExamples.CUMA);
                break;
            case 6:
                System.out.println(WeekDayInExamples.CUMARTESI);
                break;

            default:
                System.out.println("Farklı Gün sayısı girildi");
                break;
        }
    }
}

enum WeekDayInExamples{
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}