package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

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
public class _19_File {
    // Absolute Path : Static
    // Relative Path : Dinamiktir /
    // URL: domain
    // URI: domain/deneme.png
    public static final String FILE_URL = "C:\\io\\ecodation\\eco10.txt";

    // Userdata
    public static String userData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birşeyler  giriniz");
        String value = scanner.nextLine();
        return  "["+new Date(System.currentTimeMillis())+"]: "+ value;
    }

    // Writer
    public static void myFileWriter() {
        String data = userData();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_URL, true))) {
            bufferedWriter.write("\n"+data);
            bufferedWriter.flush();
            System.out.println("Kaydetme Tamamdır.");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //Reader
    public static void myFileReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_URL))) {
            StringBuilder stringBuilder=new StringBuilder();
            String rows="";
            while((rows=bufferedReader.readLine())!=null){
                stringBuilder.append("\n").append(rows);
            }
            String builderToChange=stringBuilder.toString();
            System.out.println(builderToChange);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myFileWriter();
        myFileReader();
    }
}
