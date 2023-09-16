package com.hamitmizrak;


import java.util.Arrays;

// Dizi
public class _16_1_Array {

    public static void main(String[] args) {
        int[] dizi = new int[9];
        dizi[0] = 1;
        dizi[1] = 2;
        dizi[7] = 8;
        dizi[8] = 9;
        dizi[2] = 3;
        dizi[3] = 4;
        dizi[4] = 5;
        dizi[5] = 6;

        // iterative for
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

        //System.out.println("\n"+dizi[0]);
        //System.out.println(dizi[8]);
        //System.out.println(dizi[dizi.length-1]);
        System.out.println("");
        // Küçükten büyüğe doğru sırala
        Arrays.sort(dizi);

        // forEach
        for (int temp : dizi) {
            System.out.print(temp + " ");
        }
        System.out.println("\n///////////////////////////////////////////");

        // Clone Array Iterative
        System.out.println("Clone Array Iterative");
        int[] dizi2 = new int[dizi.length];
        for (int i = 0; i <dizi.length ; i++) {
            dizi2[i]=dizi[i];
        }

        for (int temp : dizi2) {
            System.out.print(temp + " ");
        }

        System.out.println("\n///////////////////////////////////////////");
        // Clone Method
        System.out.println("Clone Array Method");
        int[] dizi3 =    dizi.clone();
        for (int temp : dizi3) {
            System.out.print(temp + " ");
        }
        System.out.println("\n///////////////////////////////////////////");
        int[] dizi4 = {5,6,9,1,2,44};
        for (int temp : dizi4) {
            System.out.print(temp + " ");
        }

        System.out.println("\n///////////////////////////////////////////");
        Object [] dizi5 = {true,44,"Merhabalar",50.44};
        for (Object temp : dizi5) {
            System.out.print(temp + " ");
        }

        System.out.println("\n///////////////////////////////////////////");
        int [][] matrix=new int [2][2];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[1][0]=3;
        matrix[1][1]=4;

        for (int i = 0; i < matrix.length; i++) {// satır(rows)
            for (int k = 0; k < matrix[i].length; k++) { // sutun (cols)
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
    }
}
