package gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int sayi2 = oku.nextInt();

        Scanner okustr=new Scanner(System.in);
        System.out.print("yapmak istediğiniz işlemi girin:");
        String islem = okustr.nextLine();

        if (islem == "T") {
            int toplam = sayi1 + sayi2;
            System.out.println("toplam = " + toplam);
        }
        if (islem == "Ç") {
            int cikarma = sayi1 - sayi2;
            System.out.println("cikarma = " + cikarma);
        }
        if (islem == "P") {
            int carpma = sayi1 * sayi2;
            System.out.println("carpma = " + carpma);
        }
        if (islem == "B") {
            int bolme = sayi1 / sayi2;
            System.out.println("bolme = " + bolme);
        }


    }
}
