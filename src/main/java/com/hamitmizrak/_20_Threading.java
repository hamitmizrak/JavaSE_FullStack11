package com.hamitmizrak;

// Threading
// Collections
// Set,Map, List
// Java 8 gelen özelliklerden
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
public class _20_Threading extends Thread{ //Thread

    private Long threadId;
    private String threadName;

    public  _20_Threading(Long threadId,String threadName){
        this.threadId=threadId;
        this.threadName=threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println("extends Thread");
            for (int i = 1; i <=9 ; i++) {
                System.out.println(this.threadId+" "+ this.threadName+" => "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    } //extends Thread

    public static void main(String[] args) throws InterruptedException {
        _20_Threading deneme=new _20_Threading(1L,"javascript");
        _20_Threading deneme2=new _20_Threading(2L,"python");
        _20_Threading deneme3=new _20_Threading(3L, "java");
        _20_Threading deneme4=new _20_Threading(4L, "C#");

        /*deneme.setName("Thread İzmir");
        System.out.println("Thread Name: "+deneme.getName());
        System.out.println("Thread isAlive: "+deneme.isAlive());*/

        deneme.start();
        deneme.join();

        deneme2.start();
        deneme3.start();
        deneme2.join();
        deneme3.join();

        deneme4.start();
    }
} //end class extends Thread


 class _20_Threading_2 implements Runnable { //interface
     @Override
     public void run() {
         try {
             System.out.println("implements Runnable");
             for (int i = 1; i <=9 ; i++) {
                 System.out.println(i);
                 Thread.sleep(1000);
             }
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
     public static void main(String[] args) throws InterruptedException {
         System.out.println("other Main");
     }
} //end class implements Runnable



 class _20_Threading_3 {
     public static void main(String[] args) {
         Thread thread=new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     System.out.println("Anonymous Thread Runnable");
                     for (int i = 1; i <=9 ; i++) {
                         System.out.println(i);
                         Thread.sleep(1000);
                     }
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }) ;
     }
} //end class Anonymous Thread - Runnable
