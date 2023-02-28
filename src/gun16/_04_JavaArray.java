package gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] sayilar=new int[7];
        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("sayi giriniz:");
            sayilar[i]= oku.nextInt();

            toplam=sayilar[i]+toplam;

        }
        int ortalama=toplam/ sayilar.length;
        int sayac1=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > ortalama && sayilar[i]%2!=2) {
                sayac1++;
            }

        }
        System.out.println("ortalama:"+ortalama);
        System.out.println("Ortalamadan büyük ve tek sayı miktarı:"+sayac1);
    }
}
