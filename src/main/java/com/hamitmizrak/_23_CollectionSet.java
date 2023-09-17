package com.hamitmizrak;

// Generics
// Collections

// Java 8 gelen özelliklerde
///////////////////////////////////////////////////////////////////
// OOP
// Class bileşenleri
// Override
// Overloading
// Encapsulation
// Class (Lombok)
// inheritance
// abstract
// interface
// polymorhism
// this, super
// new, null,zero

import java.util.*;

// Linux Bash Script
// SQL Native Select, Delete, Update, Find
// Katmanlı Mimariye Giriş ,
// Design Pattern (Singleton Design pattern) ,
// MVC kendimiz yazacağız.
// PreparementStatement
public class _23_CollectionSet {

    public static void main(String[] args) {
        // H - L - T
        // Set<Integer> listem=new HashSet<>(); //eleman sırası önemli değilse
        // Set<Integer> listem=new LinkedHashSet<>(); //eleman sırası önemli ise
        Set<Integer> listem=new TreeSet<>(); //Tekrarsız Küçükten büyüğe doğru
        listem.add(20);
        listem.add(30);
        listem.add(10);
        listem.add(40);
        listem.add(30);
        listem.add(20);
        System.out.println("Eleman sayısı :"+listem.size());

        // forEach Döngüsü kullandım
        for (Integer temp : listem) {
            System.out.print(temp +" ");
        }

        listem.remove(0);
        System.out.println("\n******************");
        // forEach Döngüsü kullandım
        for (Integer temp : listem) {
            System.out.print(temp +" ");
        }

        System.out.println("\n******************");
        System.out.println("Boş mu: "+listem.isEmpty());
        System.out.println("Var mı: "+listem.contains(10));
        System.out.println("toString: "+listem.toString().concat("90"));
        System.out.println("hashCode: "+listem.hashCode());

        System.out.println("*******Iterator***********");
        Iterator iterator=listem.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\n*******Stream***********");
        listem.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });

        System.out.println("\n******************");
        listem.stream().forEach(System.out::println);
        listem.clear();
    }
}
