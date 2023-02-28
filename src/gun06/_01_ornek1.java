package gun06;

import java.util.Scanner;

public class _01_ornek1 {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.


        Scanner oku = new Scanner(System.in);

        System.out.println("Adres bilgilerinizi giriniz:");
        System.out.print("Mahalle:");
        String mahalle=oku.nextLine();

        System.out.print("Cadde-Sokak:");
        String cadde = oku.nextLine();

        System.out.print("Bina no:");
        int bina = oku.nextInt();

        System.out.print("Daire no:");
        int daire = oku.nextInt();

        System.out.print("Posta kodu:");
        int posta = oku.nextInt();

        System.out.print("Ülke/Şehir:");
        String ulke = oku.nextLine();


    }
}
