package gun38._05_OOP_Soru;

import Utility.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        List<food> siparisler = new ArrayList<>();
        Scanner oku = new Scanner(System.in);

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();
            switch (secim) {
                case 1:
                    food ak = new adanaKebap();
                    siparisler.add(ak);
                    break;
                case 2:
                    food lh = new lahmacun();
                    siparisler.add(lh);
                    break;
                case 3:
                    food bo = new borsh();
                    siparisler.add(bo);
                    break;
                case 4:
                    food pl = new palov();
                    siparisler.add(pl);
                    break;
            }
        } while (secim < 5);

        System.out.println("Alınan sipiarişler");
        for(food f:siparisler){
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("Siparişleriniz hazırlanıyor...\n");
        MyFunc.bekle(1);
        double toplam=0;
        for(food f: siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
            MyFunc.bekle(1);
        }
        System.out.println("Toplam ücret= "+toplam);
    }
    public static void menu() {
        System.out.println("\n****Menu****" +
                "\n1-Adana Kebap (80 TL)" +
                "\n2-Lahmacun (32 TL)" +
                "\n3-Borsh (55 TL)" +
                "\n4-Palov (35 TL)" +
                "\nSeciminiz=");
    }
}
