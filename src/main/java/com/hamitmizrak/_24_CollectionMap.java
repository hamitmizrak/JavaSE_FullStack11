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

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

// Linux Bash Script
// SQL Native Select, Delete, Update, Find
// Katmanlı Mimariye Giriş ,
// Design Pattern (Singleton Design pattern) ,
// MVC kendimiz yazacağız.
// PreparementStatement
public class _24_CollectionMap {

    // H H L T
    public static void main(String[] args) {
        Map<String,String> mapList=new LinkedHashMap<>();

        mapList.put("1","kelime0");

        // Iterative
        for (int i = 0; i < 5 ; i++) {
            mapList.put(UUID.randomUUID().toString(),"kelime"+i);
        }

        // KEY
        for (String key :mapList.keySet()) {
            System.out.println(key);
        }
        System.out.println("");

        // VALUE
        for (String value :mapList.values()) {
            System.out.println(value);
        }

        // KEY-VALUE
        System.out.println("");
        for (String key :mapList.keySet()) {
            System.out.println(key+" => "+mapList.get(key));
        }
        System.out.println("");

        System.out.println(" GET "+mapList.get("1"));
        System.out.println(" SIZE "+mapList.size());
        System.out.println(" HASH CODE"+mapList.hashCode());
        System.out.println(" TO STRING "+mapList.toString());
        System.out.println(" KEY "+mapList.containsKey("1"));
        mapList.remove("1");
        System.out.println(" KEY "+mapList.containsKey("1"));
        System.out.println(" VALUE "+mapList.containsValue("kelime0"));

        System.out.println("******Lambda Expression Java 8**************");
        mapList.entrySet().forEach((temp)->{
            System.out.println(temp);
        });

        System.out.println("******Method Referances Java 8**************");
        mapList.entrySet().forEach(System.out::println);
    }
}
