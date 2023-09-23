package com.oop.abstractx;

public class AbstractMainTest {

    public static void main(String[] args) {


        // PERSON-2
        Person person2 = new Teacher(); // polymorphism
        person2.setName("person name-2");
        person2.setSurname("person surname-2");
        System.out.println(person2.getName()+" "+person2.getSurname());
        person2.govdeliMEthodFullName();
        person2.govdesizMethod();
        System.out.println(person2);
        System.out.println("------------------------------------------");

        // TEACHER
        Teacher teacher=new Teacher();
        teacher.setName("teacher name");
        teacher.setSurname("teacher surname");
        System.out.println(teacher.getName()+" "+teacher.getSurname());
        teacher.govdeliMEthodFullName();
        teacher.govdesizMethod();
        System.out.println(teacher);
        System.out.println("------------------------------------------");

        // Student
        Student student=new Student();
        student.setName("student name");
        student.setSurname("student surname");
        System.out.println(student.getName()+" "+student.getSurname());
        student.govdeliMEthodFullName();
        student.govdesizMethod();
        student.setSpecialStudentLesson("Matematik");
        System.out.println(student);
        System.out.println("------------------------------------------");
    }
}
