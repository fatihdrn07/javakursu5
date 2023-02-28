package gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız

        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int[] notlar = new int[5];

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("notu giriniz");
            notlar[i] = oku.nextInt();
            toplam = notlar[i] + toplam;
        }
        int ortalama = toplam / notlar.length;
        int gecenler=0;
        for (int i = 0; i < notlar.length; i++)
        {
            if (notlar[i]>ortalama)
            {
                System.out.println("ortalamadan büyük notlar="+notlar[i]);
                gecenler++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenler = " + gecenler);


    }
}

