package com.hamitmizrak;

public class _04_Examples {

// 1.soru
// 1.dereceden 2 bilinmeyenli denklem
// y=3x+4k;
// x=5;
// k=3

int x = 5;
int k = 3;
int y = 3 * x + 4 * k;
System.out.println(y);

// 2.soru
// Dereceyi Fahrenhayt
// (derece*9/5)+32
// 0 derece 32 fahrenhayttır
int degree = 0, fahranhayt;
fahranhayt = (degree * 9 / 5) + 32;
System.out.println(fahranhayt);


// 3.soru iki sayıda dört işlem
// x1=4,x2=2;
// bölme/çıkarma/çarpma/toplama/bölümünden kalan(%)
var x1 = 4;
var x2 = 2;
var toplam = x1 + x2;
System.out.println(toplam);

var cikarma = x1 - x2;
System.out.println(cikarma);

var carpma = x1 * x2;
System.out.println(carpma);

var bolme = x1 / x2;
System.out.println(bolme);

var kalan = x1 % x2;
System.out.println(kalan);

}
