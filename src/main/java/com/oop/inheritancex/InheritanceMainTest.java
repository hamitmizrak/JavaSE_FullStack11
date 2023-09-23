package com.oop.inheritancex;

public class InheritanceMainTest {

    public static void main(String[] args) {

        // PERSON-1
        Person person = new Person();
        person.setName("person name");
        person.setSurname("person surname");
        System.out.println(person.getName()+" "+person.getSurname());
        person.fullName();
        System.out.println(person);
        System.out.println("------------------------------------------");

        // PERSON-2
        Person person2 = new Teacher(); // polymorphism
        person2.setName("person name-2");
        person2.setSurname("person surname-2");
        System.out.println(person2.getName()+" "+person2.getSurname());
        person2.fullName();
        System.out.println(person2);
        System.out.println("------------------------------------------");

        // TEACHER
        Teacher teacher=new Teacher();
        teacher.setName("teacher name");
        teacher.setSurname("teacher surname");
        System.out.println(teacher.getName()+" "+teacher.getSurname());
        teacher.fullName();
        System.out.println(teacher);
        System.out.println("------------------------------------------");

        // Student
        Student student=new Student();
        student.setName("student name");
        student.setSurname("student surname");
        System.out.println(student.getName()+" "+student.getSurname());
        student.fullName();
        System.out.println(student);
        System.out.println("------------------------------------------");
    }
}
