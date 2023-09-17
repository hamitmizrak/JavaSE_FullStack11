package com.hamitmizrak;

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

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Linux Bash Script
// SQL Native Select, Delete, Update, Find
// Katmanlı Mimariye Giriş ,
// Design Pattern (Singleton Design pattern) ,
// MVC kendimiz yazacağız.
// PreparementStatement
public class _25_Java8Properties {
    /*
      Lambda Expression
      @FunctionInterface
      Method Referances
      Optional
      Stream()
      Base64 Encoder-Decoder
      forEach
      JDBC try-with-resources
      */

    // Array To List Change (Collection)
    public static List<String> getArrayToList(){
        String [] dizi={"Malatya","Sivas","Diyarbakır","Elazığ","Malatya","Bingöl"};
        List<String> arrayToList=new ArrayList<>();
        arrayToList=List.of(dizi);
        return arrayToList;
    }

    // List
    public static List<String> getList(){
        return getArrayToList();
    }

    // Collect: işlem sonunda List'e çevir
    public static List<String> streamCollectMethod(){
        List<String> list=getArrayToList();
        //List<String> list=getList();
        List<String> resultList= list
                .stream()
                .collect(Collectors.toList());
       return resultList;
    }

    // ForEach
    public static void streamForEachMethod(){
        List<String> list=streamCollectMethod();
        list.stream().forEach((temp)->{
            System.out.println(temp);
        });
    }

    // Sorted: Küçükten Büyüğe
    public static void streamSortedMethod(){
        List<String> list=streamCollectMethod();
        list
                .stream()
                .sorted()
                .forEach((temp)->{
            System.out.println(temp);
        });
    }

    // Sorted: Büyükten Küçüğe
    public static void streamReverseSortedMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach((temp)->{
            System.out.println(temp);
        });
    }

    // Filter: filtreleme
    public static void streamFilterMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .filter((temp)->!"Malatya".equals(temp))
                .forEach((temp)->{
            System.out.println(temp);
        });
    }

    // Search Filter: filtreleme Listeleme
    public static void streamFilterSearchMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .forEach((temp)->{
                    System.out.println(temp);
                });

        String searchValue= JOptionPane.showInputDialog("Lütfen aramak istediğinzi kelimeyi yazınız");
        list.stream()
                .filter((temp)->searchValue.equals(temp))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // Search Filter: filtreleme Listeleme
    // Count
    public static void streamFilterSearchCountMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .forEach((temp)->{
                    System.out.println(temp);
                });

        String searchValue= JOptionPane.showInputDialog("Lütfen aramak istediğinzi kelimeyi yazınız");
       Long counter= list.stream()
                .filter((temp)->searchValue.equals(temp))
                .count();
        System.out.println("Aradığınız "+searchValue+" kelimesinden "+ counter+ " tane veri vardır");
    }


    // Aradığımız kelimeyi bulsun ve hepsini büyük karaktere çevirsin
    // Search Filter: filtreleme Listeleme
    public static void streamMapFilterSearchMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .forEach((temp)->{
                    System.out.println(temp);
                });

        String searchValue= JOptionPane.showInputDialog("Lütfen aramak istediğinzi kelimeyi yazınız");
        list.stream()
                .filter((temp)->searchValue.equals(temp))
                .map((temp)->temp.toUpperCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    // distinct: Tekrar eden verileri kaldırır.
    public static void streamDistinctMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .distinct()
                .forEach((temp)->{
                    System.out.println(temp);
                });
    }

    // Limit (maxSize)
    public static void streamFilterLimitMethod(){
        List<String> list=streamCollectMethod();
        list.stream()
                .filter((temp)->!"Malatya".equals(temp))
                .limit(3)
                .forEach((temp)->{
                    System.out.println(temp);
                });
    }

    public static void main(String[] args) {
        //streamForEachMethod();
        //streamSortedMethod();
        //streamReverseSortedMethod();
        //streamFilterMethod();
        //streamFilterSearchMethod();
        //streamFilterSearchCountMethod();
        streamMapFilterSearchMethod();
        //streamDistinctMethod();
        //streamFilterLimitMethod();
    }
}
