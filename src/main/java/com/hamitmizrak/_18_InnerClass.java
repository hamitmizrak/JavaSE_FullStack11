package com.hamitmizrak;

// Inner Class
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
public class _18_InnerClass {

    private String country;

    // getter and setter
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static class City{
        private String city;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }


    public static void main(String[] args) {
        _18_InnerClass country=new _18_InnerClass();
        country.setCountry("Türkiye");

        City city=new City();
        city.setCity("Sivas");

        System.out.println("Ülke: "+country.getCountry()+" Sehir: "+city.getCity());
    }
}
