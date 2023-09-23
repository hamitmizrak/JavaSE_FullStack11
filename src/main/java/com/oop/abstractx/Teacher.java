package com.oop.abstractx;

public class Teacher extends Person {

    @Override
    public void govdeliMEthodFullName() {
        System.out.println(" Override Teacher ");
        super.govdeliMEthodFullName();
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Teacher Gövdesiz Method");
    }
}
