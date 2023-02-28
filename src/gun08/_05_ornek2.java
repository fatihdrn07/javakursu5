package gun08;

import java.util.Scanner;

public class _05_ornek2 {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit olup olmadığını yazdırınız.


        Scanner oku=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz:");
        int sayi1= oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2= oku.nextInt();
        System.out.println("say1 sayı2 ye eşit mi?:" + (sayi1==sayi2));






    }
}
