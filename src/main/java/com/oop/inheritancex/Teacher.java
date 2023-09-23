package com.oop.inheritancex;

public class Teacher extends Person {

    @Override
    public void fullName() {
        System.out.println(" Override Teacher ");
        super.fullName();
    }
}
