package gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen 2 sayıdan büyük olanını değerini ekrana yazdırın
        //eşit ise eşit yazdırın

        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("büyük sayi:" + sayi1);
        if (sayi2 > sayi1)
            System.out.println("büyük sayi:" + sayi2);
        if (sayi1 == sayi2)
            System.out.println("sayilar eşittir");


    }
}
