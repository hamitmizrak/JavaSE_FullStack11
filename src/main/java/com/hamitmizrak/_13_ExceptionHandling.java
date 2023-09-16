package com.hamitmizrak;

public class _13_ExceptionHandling {

    public static void main(String[] args) throws IndexOutOfBoundsException,ClassNotFoundException {
        try {
            int divideResult = 4 / 0;
            System.out.println(divideResult);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("db.close");
            System.out.println("socket.close");
        }
        // Exception Handling

        System.out.println("Son Satır");
        throw new HamitMizrakException("Burada bir hata var Dikkat !!!!!");
    }

}
