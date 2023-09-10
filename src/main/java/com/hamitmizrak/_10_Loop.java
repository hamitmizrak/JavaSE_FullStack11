package com.hamitmizrak;

public class _10_Loop {
    public static void main(String[] args) {
        // Loop
        // break, return,continue
        for (int i = 1; i <=9; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

        int k = 1;
        while(k <=9){
            System.out.print(k+" ");
            // i++;
            // i+=1;
            k=k+1;
        }

        System.out.println("");

        int w = 1;
        do{
            System.out.print(w+" ");
            w+=1;
        }
        while(w <=9);

    }
}
