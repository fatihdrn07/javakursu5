package gun42;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try {  // hata bölgesini try{} ile aldık


            Scanner oku = new Scanner(System.in);

            System.out.println("sayi1=");
            int sayi1 = oku.nextInt();

            System.out.println("sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (Exception hata)
        // hat mesajlarını hata isimli Exception cinsinden değişkene attım
        {
            System.out.println("hata = "+hata.getMessage());
            System.out.println("Lütfen tekrar deneyiniz.");
        }
        System.out.println("program bitti");
    }
}
