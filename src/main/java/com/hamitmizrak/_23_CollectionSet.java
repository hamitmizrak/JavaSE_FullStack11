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
public class _23_CollectionSet {

    private String name;

    //parametreli-parametresiz constructor
    public _23_CollectionSet() {}
    public _23_CollectionSet(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "_17_Class{" +
                "name='" + name + '\'' +
                '}';
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //instance
        _23_CollectionSet data=new _23_CollectionSet();
        data.setName("Adı 44");
        System.out.println(data.getName());
        System.out.println(data);
    }
}
