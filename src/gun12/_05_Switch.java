package gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // daha önce çözdüğünüz hesap makinesi sorusunu
        // switch ile çözünüz.

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int sayi1= oku.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma  için P");
        System.out.println("Bölme   için B");
        Scanner okustr=new Scanner(System.in);
        String secim=okustr.nextLine();

        switch (secim.toLowerCase()){
            case "t":
                System.out.println("toplam:"+(sayi1+sayi2)); break;
            case "ç":
                System.out.println("fark:" + (sayi1-sayi2)); break;
            case "p":
                System.out.println("çarpım:"+(sayi1*sayi2)); break;
            case "b":
                System.out.println("bölüm:"+(sayi1/sayi2)); break;
            default:
                System.out.println("hatalı değer.");
        }



    }
}
