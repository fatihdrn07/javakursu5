package _odev1_;

public class _02_soru3 {
    public static void main(String[] args) {
        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] sayilar={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i < 5; i++) {
            toplam=sayilar[i]+toplam;
        }
        System.out.println(toplam);

    }
}
