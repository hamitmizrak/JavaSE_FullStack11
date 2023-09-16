package com.hamitmizrak;


// Class bileşenleri
// Override
// Overloading
// Encapsulation
// Inner Class
// Class (Lombok)
///////////////////////////////////////////////////////////////////
// File
///////////////////////////////////////////////////////////////////
// Threading
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
public class _17_Class {

    private String name;

    //parametreli-parametresiz constructor
    public _17_Class() {}
    public _17_Class(String name) {
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
        _17_Class data=new _17_Class();
        data.setName("Adı 44");
        System.out.println(data.getName());
        System.out.println(data);
    }
}
