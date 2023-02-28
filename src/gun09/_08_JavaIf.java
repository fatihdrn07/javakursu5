package gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // kullanıcının 2 kex gireceği şifrenin aynı olduğunu
        //aynı veya değil şeklinde yazdırınız

        Scanner oku = new Scanner(System.in);

        System.out.print("şifre giriniz:");
        String sifre1 = oku.nextLine();
        System.out.print("tekrar şifre giriniz:");
        String sifre2 = oku.nextLine();

        if (sifre1.equals(sifre2))
            System.out.println("Tebrikler şifreniz eşleşti.");
        if (!sifre1.equals(sifre2))
            System.out.println("Sifreler uyusmuyor. Tekrar deneyiniz.");

    }
}
