package gun05;

import java.util.Scanner;

public class _09_ornek8 {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("kilonuzu giriniz: ");
        double kilo= oku.nextDouble();
        System.out.print("boyunuzu giriniz: ");
        double boy= oku.nextDouble();
        double indeks=kilo/(boy*boy);
        System.out.println("indeks = " + indeks);

    }
}
