package gun30._02_FinalVeriables.ornek2;

import java.util.Scanner;


public class soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("Gun="); gun= oku.nextInt();
        System.out.print("Saat="); saat= oku.nextInt();
        System.out.print("Dakika="); dak= oku.nextInt();

        // 1. Yöntem
        int toplamSaniye=gun
                *sabitler.birGundekiSaatSayisi
                *sabitler.birSaattekiDakSayisi
                *sabitler.birDakikadakiSanSayisi
                +
                saat
                *sabitler.birSaattekiDakSayisi
                *sabitler.birDakikadakiSanSayisi
                +
                dak
                *sabitler.birDakikadakiSanSayisi;
        System.out.println("toplamSaniye = " + toplamSaniye);

        //2. Yöntem
        System.out.println("toplamSaniye = " + sabitler.hesapla(gun,saat,dak));

    }
}
