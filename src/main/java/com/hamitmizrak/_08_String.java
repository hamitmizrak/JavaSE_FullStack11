package com.hamitmizrak;

public class _08_String {
    public static void main(String[] args) {
        System.out.println("String 1237");

        String value=" JaVA öğreniyorum JaVA ";
        System.out.println(value);
        System.out.println(value.length());
        System.out.println(value.hashCode());
        System.out.println(value.trim().length());

        System.out.println(value.concat("-Sona eklendi"));

        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());

        System.out.println(value.substring(3));
        System.out.println(value.substring(3,7));

        System.out.println(value.charAt(3));
        System.out.println(value.indexOf("JaVA"));
        System.out.println(value.lastIndexOf("JaVA"));

        System.out.println(value.contains("öğreniyorum"));
        System.out.println(value.isEmpty());

        System.out.println(value.replace(value," yeni değiştir"));
        System.out.println(value.startsWith(" "));
        System.out.println(value.trim().startsWith(" "));
        System.out.println(value.endsWith(" "));
        System.out.println(value.trim().endsWith(" "));

        //////////////////////////////////////////////
        String[] arrayString =  value.split(" ");
        for (String data : arrayString) {
            System.out.println(data);
        }

        // Ödev: Kullanıcıdan aldığınız isim ve soyismin; (isimi: scanner ve soyismi: jOptionalPane)
        // bu kelimenin harf sayısı ? [ ipucu: length() ]
        // bu kelimenin bütün karakteri büyük yapalım ? [ ipucu: toUpperCase()]
        // bu kelimenin bütün karakteri küçük yapalım ? [ ipucu: toLowerCase()]
        // bu kelimenin başında ve sonunda boşlukları alalım ? [ ipucu: trim()]
        // bu kelimenin j ile başlıyoru mu ?   [ ipucu: startsWith("j")]
        // bu kelimenin a ile biter mi ?   [ ipucu:  endsWith("a")]
        // bu kelimenin ilk harfi ? [ ipucu: charAt(0)]
        // bu kelimenin içinde baştan Altan geçiyor mu ? [ ipucu: indexOf("java")]
        // bu kelimenin içinde sondan Berkan geçiyor mu ? [ ipucu: lastIndexOf("java")]
        // bu kelimenin 4.harften sonra gösterilsin ? [ ipucu: substring(4)]
        // bu kelimenin sonuna INC ekleyelim  ? [ ipucu: concat(".INC")]
        // bu kelimenin içerisinde java44 geçiyor mu ? [ ipucu: contains("java44")]
        // bu kelimenin "deneme" ile aynı mı ?  [ipucu: ipucu: equals("deneme");]
        // equals ile comparateTo arasındaki fark nedir ?

        ////////////////////////////////////////////////////////////////////////////////////////
        // StringBuilder
        // StringTokenize
        // Formatter
        // Conditional
        // Loop
        // break, return,continue
        // Date
        // Exception Handling
        // Access Modifier (public-private-default-protected)
        // Class bileşenleri
        // Override
        // Overloading
        // Encapsulation
        // Method
        // Primitive Method
        // Recursive Method
        // Enum
        // Dizi
        // Inner Class
        // File
        // Threading
        // Collections
        // Java 8 gelen özelliklerde
        // OOP
        // Class (Lombok)
        // inheritance
        // abstract
        // interface
        // polymorhism
        // this, super
        // new, null,zero
    }
}
