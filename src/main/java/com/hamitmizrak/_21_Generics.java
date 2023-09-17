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

// Linux Bash Script
// SQL Native Select, Delete, Update, Find
// Katmanlı Mimariye Giriş ,
// Design Pattern (Singleton Design pattern) ,
// MVC kendimiz yazacağız.
// PreparementStatement

// Generics: Wrapper Type tanır primitive tanımaz. Byte,Short,Integer,Long,Float,Double,Character
// Cast işlemleriyle uğraşmaz
// Tür güvenliğini sağlar
// Bazen enduser'ın gireceğini türü bilmediğimiz zamanlarda kulanmak çok değerlidir.
public class _21_Generics <T> {

    // Global Variables
    private T person;

    // Parametresiz
    public _21_Generics() {
    }

    // Parametreli
    public _21_Generics(T person) {
        this.person = person;
    }

    // Method
    public <K> void genericsMethod(T name, T surname,T number, K country, String city){
        System.out.println(name+" "+surname+" "+number+" "+country+" "+city);
    }

    // GETTER AND SETTER
    public Object getPerson() {
        return person;
    }

    public void setPerson(T person) {
        this.person = person;
    }

    public static void main(String[] args) {
        _21_Generics generics=new _21_Generics();
        generics.setPerson(true);
        System.out.println(generics.getPerson());
        generics.genericsMethod("Hamit",7877878,44,"Türkiye","İstanbul");
    }
}
