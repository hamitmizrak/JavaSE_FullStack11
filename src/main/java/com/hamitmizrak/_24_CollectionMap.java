package com.hamitmizrak;

// Collections
// Generics
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
public class _24_CollectionMap {

    private String name;

    //parametreli-parametresiz constructor
    public _24_CollectionMap() {}
    public _24_CollectionMap(String name) {
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
        _24_CollectionMap data=new _24_CollectionMap();
        data.setName("Adı 44");
        System.out.println(data.getName());
        System.out.println(data);
    }
}
