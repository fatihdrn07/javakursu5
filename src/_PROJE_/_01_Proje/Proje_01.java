package _PROJE_._01_Proje;

import java.util.Scanner;

public class Proje_01 {
    public static void main(String[] args) {
        // Scanner class tanimlayin...
        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...
        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim
        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"
        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"
        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"
        // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim
        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...

        Scanner oku = new Scanner(System.in);
        System.out.println("Merhaba, lütfen isminizi giriniz..:");
        String isim = oku.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println(isim + " hoşgeldin, soyismini girer misin?");
        String soyisim = oku.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        String harf;
        do {
            System.out.println(isim + " " + soyisim + " isminiz doğru ise devam etmek için 'Y' tusuna basınız.");
            harf = oku.next();
            if (!harf.equalsIgnoreCase("y"))
                System.out.println("Tercihinizi doğru yapmadınız. Lütfen tekrar deneyiniz.");
        } while (!harf.equalsIgnoreCase("y"));

        System.out.println("Isim ve soyismin sistem basarili bir sekilde kaydedilmistir.");
        System.out.println("Lütfen kullanıcı adı belirleyiniz..:");
        String kullanciadi= oku.next();
        String sifre;
        String tekrarsifre;
        do {
            System.out.println("Lütfen sifrenizi belirleyiniz..:");
            sifre=oku.next();
            System.out.println("Sifreniz tekrar giriniz..:");
            tekrarsifre=oku.next();
            if (!sifre.equals(tekrarsifre))
                System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...");
        }while (!sifre.equals(tekrarsifre));
        System.out.println("Tebrikler..."+ kullanciadi+" kullanıcı adıyla sisteme kayır oldunuz...");



    }
}
