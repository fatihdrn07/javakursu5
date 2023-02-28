package gun05;

import java.util.Scanner;

public class _05_ornek4 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz: ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int sayi2 = oku.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.print("toplam = " + toplam);

    }
}
