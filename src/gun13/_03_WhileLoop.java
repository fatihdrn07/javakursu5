package gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayının toplamının sonucunu yazdınız

        Scanner oku = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;
        while (sayac < 20)
        {
            sayac++;
            System.out.print(sayac + "sayiyi giriniz:");
            int sayi = oku.nextInt();
            toplam = toplam + sayi;

        }
        System.out.println("toplam = " + toplam);
    }
}
