package gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının negatif mi pozitif mi olduğunu
        //yazdırın. sıfır ise sıfır yazdırın

        Scanner oku = new Scanner(System.in);

        System.out.print("bir sayi giririniz:");
        int sayi = oku.nextInt();
        if (sayi < 0)
            System.out.println("sayi negatiftir.");

        if (sayi > 0)
            System.out.println("sayi pozitiftir.");

        if (sayi == 0)
            System.out.println("sayi sifira esittir.");

    }
}
