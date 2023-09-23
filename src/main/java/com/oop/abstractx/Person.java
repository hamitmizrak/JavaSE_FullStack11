package com.oop.abstractx;

abstract public class Person {

    // Global
    private String name;
    private String surname;

    // Constructor
    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // ToString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // Method Full Name
    public void govdeliMEthodFullName() {
        System.out.println(this.name + " " + this.surname);
    }

    abstract public void govdesizMethod();

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
