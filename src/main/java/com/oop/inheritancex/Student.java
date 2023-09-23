package com.oop.inheritancex;

public class Student extends Person {

    @Override
    public void fullName() {
        System.out.println(" Override Student ");
        super.fullName();
    }
}
