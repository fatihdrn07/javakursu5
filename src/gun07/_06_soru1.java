package gun07;

import java.util.Scanner;

public class _06_soru1 {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner oku = new Scanner(System.in);


        System.out.print("Ad Soyad giriniz:");
        String isim = oku.nextLine();

        int boslukindex=isim.indexOf(" ");
        String ad=isim.substring(0,boslukindex);
        String soyad=isim.substring(boslukindex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}
