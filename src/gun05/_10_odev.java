package gun05;

import java.util.Scanner;

public class _10_odev {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        System.out.print("isminizi giriniz: ");
        String isim = oku.next();
        System.out.println("isim = " + isim);

        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        System.out.print("bir sayi giriniz: ");
        int sayi = oku.nextInt();
        System.out.println("sayi = " + sayi);

        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        System.out.print("sevdiğiniz bir meyve: ");
        String meyve = oku.next();
        System.out.println("meyve = " + meyve);

        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("arabanızdaki kapı sayısı: ");
        int kapisayisi = oku.nextInt();
        System.out.println("kapisayisi = " + kapisayisi);

        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        System.out.print("10 sene önceki yaşadığınız şehir: ");
        String sehir = oku.next();
        System.out.println("sehir = " + sehir);

        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.print("doğum gününüz: ");
        String dogungunu = oku.next();
        System.out.println("dogungunu = " + dogungunu);

        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //    Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        System.out.print("bir banka hesabınız var mı? : ");
        boolean varmi = oku.nextBoolean();
        System.out.println("varmi = " + varmi);

        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        System.out.print("kilogram giriniz: ");
        byte kilo = oku.nextByte();
        System.out.println("kilo = " + kilo);

        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        System.out.print("boyunuzu giriniz:");
        float boy = oku.nextFloat();
        System.out.println("boy = " + boy);


    }
}
