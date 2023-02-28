package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] dizi = new int[5];
        diziRandomYazdir(dizi);
        diziEnKucuk(dizi);
        diziEnBuyuk(dizi);
        diziOrtalama(dizi);
    }
    public static void diziRandomYazdir(int[] sayilar) {
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("sayi giriniz:");
            sayilar[i] = oku.nextInt();
        }
        System.out.println("Dizi:"+Arrays.toString(sayilar));
    }
    public static void diziEnKucuk(int[] sayilar) {
        int enkucuk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < enkucuk)
                enkucuk = sayilar[i];
        }
        System.out.println("En kücük değer:" + enkucuk);
    }
    public static void diziEnBuyuk(int[] sayilar) {
        int enbuyuk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > enbuyuk)
                enbuyuk = sayilar[i];
        }
        System.out.println("En buyuk değer:"+enbuyuk);
    }
    public static void diziOrtalama(int[] sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=sayilar[i]+toplam;
        }
        int ort=toplam/ sayilar.length;
        System.out.println("Ortalam değer:"+ort);
    }
}
