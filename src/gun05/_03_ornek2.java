package gun05;

import java.util.Scanner;

public class _03_ornek2 {
    public static void main(String[] args) {
        // kullanıcının adını ve soyadını ekrana yazdırınız.

        Scanner oku =new Scanner(System.in);

        System.out.print("Adınız ve soyadınız:");
        String adsoyad=oku.nextLine();
        System.out.println("adsoyad = " + adsoyad);

    }
}
