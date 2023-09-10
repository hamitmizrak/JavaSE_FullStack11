package com.hamitmizrak;

import java.util.Calendar;
import java.util.Date;

public class _11_EnumData {

    public static void main(String[] args) {
        // Enum
        WeekDayIn day=WeekDayIn.PAZARTESI;
        /*System.out.println(day);
        System.out.println(day.toString().toLowerCase());
        System.out.println(day.hashCode());
        System.out.println(day.ordinal());*/

        // Date
        Date date=new Date();
        System.out.println(date);

        System.out.println(date.getHours());
        System.out.println(date.getYear()+1900);

        System.out.println(date.getMonth());
        date.setMonth(0);
        System.out.println(date.getMonth());

        int date2=new Date(System.currentTimeMillis()).getYear()+1900;
        System.out.println(new Date(System.currentTimeMillis()).getYear()+1900);

        System.out.println("Calenadar");
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());

        // Enum değişkeni haftanın günlerem göre yazınız.
        // Bu zamanın günü ile eşleştirip gün bilgisini bize söyleyen algoritma ?

    }
}

enum WeekDayIn{
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}
