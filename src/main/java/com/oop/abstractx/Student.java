package com.oop.abstractx;

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
    public void govdeliMEthodFullName() {
        System.out.println(" Override Student ");
        super.govdeliMEthodFullName();
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Student Gövdesiz Method");
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
