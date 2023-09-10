package com.hamitmizrak;

public class _10_Loop {
    public static void main(String[] args) {
        // Loop
        // break, return,continue
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int k = 1;
        while (k <= 9) {
            System.out.print(k + " ");
            // i++;
            // i+=1;
            k = k + 1;
        }

        System.out.println("");

        int w = 1;
        do {
            System.out.print(w + " ");
            w += 1;
        }
        while (w <= 9);

        // ÖDEVLER
        // Klavyeden girilen bir sayının negatif mi , pozitif mi olduğunu gösteren algoritma
        /*Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = klavye.nextInt();
        if (sayi < 0) {
            System.out.println("bu bir negatif sayıdır");
        } else {
            System.out.println("Bu bi pozitif sayıdır");
        }*/

        // Kullanıcı tarafından alınan bir sayıya göre ceza kesilecektir.
        // Hızı:79 kadar ise para cezası  : 0 TL      ==>  1<=speed<=79
        // Hızı:80 ise para cezası : 800 TL hızlısınız   ==>  80<=speed<=94
        // Hızı:95 ise para cezası : 1200 TL çok hızlısınız   ==>  95<=speed<=119
        // Hızı:120 ise para cezası: 2000 TL  tehlikeli hızlısınız ==>  speed>=120
        // Soför kaç kere trafik cezası yediğini ve toplam para cezasını
        // ve eğer toplam ceza sayısı 5 ve üstüne ise ehliyetine el konulsun  hesaplayan algoritma yazalım ?

        // Klavyeden girilen karakter harf mi , sayı mı , özel simge mi ?

        // Vize Final Ödevi
        // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması
        // eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
        // ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
        // bunun haricinde sürekli vize final sorsun
        // Not Harfleri ==> AA BA BB FF
        // not ortalaması: ortalama<50 altında ise kaldı FF
        // not ortalaması: ortalama==50 Geçti
        // not ortalaması: 55<=x<=69 BB
        // not ortalaması: 70<=x<=84 BA
        // not ortalaması: 85<=x<=100 AA
        // Vize:40% Final:60%
        // Dikkat: Consolda virgül kullanmalısın.

        // while sonsuz döngü   ==> while(true) {}
        // for sonsuz döngü     ==> for(;;) {}


        // Kullanıcı tarafından girilen haftanın gününü bulan algoritma


        // Örnek: 1-10 arasında 5 tane random sayı üretelim ?
        // Bu sayıları toplayalım
        // Bu sayılar içinde tek sayı toplamı
        // Bu sayılar içinde tek sayı adeti

    }
}

