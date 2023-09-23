package com.oop.inheritancex;

public class Student extends Person {

    // Field
    private String specialStudentLesson;

    // parametresiz constructor
    public Student() {
    }

    // parametreli constructor
    public Student(String name, String surname, String specialStudentLesson) {
        super(name, surname);
        this.specialStudentLesson = specialStudentLesson;
    }

    // Override
    @Override
    public void fullName() {
        System.out.println(" Override Student ");
        super.fullName();
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "specialStudentLesson='" + specialStudentLesson + '\'' +
                "} " + super.toString();
    }

    // GETTER AND SETTER
    public String getSpecialStudentLesson() {
        return specialStudentLesson;
    }

    public void setSpecialStudentLesson(String specialStudentLesson) {
        this.specialStudentLesson = specialStudentLesson;
    }
}
