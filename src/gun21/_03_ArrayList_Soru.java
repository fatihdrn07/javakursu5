package gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner oku = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        String cevap;

        do {
            System.out.print("not giriniz:");
            notlar.add(oku.nextInt());
            Scanner oku2 = new Scanner(System.in);
            System.out.print("devam etmek istiyor musunuz?:");
            cevap = oku2.next();
        } while (!cevap.equalsIgnoreCase("h"));

        int toplam = 0;
        for (int i = 0; i < notlar.size(); i++) {
            toplam = notlar.get(i) + toplam;

        }
        int ort = toplam / notlar.size();
        int gecenler = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (ort > notlar.get(i)) ;
            gecenler++;
        }
        System.out.println("gecenler = " + gecenler);

    }
}
