package com.oop.inheritancex;

public class InheritanceMainTest {

    public static void main(String[] args) {

        // PERSON
        Person person=new Person();
        person.setName("person name");
        person.setSurname("person surname");
        System.out.println(person.getName()+" "+person.getSurname());
        System.out.println(person);

        // TEACHER
        Teacher teacher=new Teacher();
        teacher.setName("teacher name");
        teacher.setSurname("teacher surname");
        System.out.println(teacher.getName()+" "+teacher.getSurname());
        System.out.println(teacher);

        // Student
        Student student=new Student();
        student.setName("student name");
        student.setSurname("student surname");
        System.out.println(student.getName()+" "+student.getSurname());
        System.out.println(student);

    }
}
