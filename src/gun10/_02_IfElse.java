package gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("vize notunu giriniz:");
        int vize = oku.nextInt();
        System.out.print("final notunu giriniz:");
        int fnl = oku.nextInt();
        int ort = (vize + fnl) / 2;
        if (ort >= 60)
            System.out.println("geçtiniz, tebrikler.");
        else
            System.out.println("bütünlemeye kaldınız.");


    }
}
