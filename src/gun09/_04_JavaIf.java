package gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının tek mi çift mi olduğunu yazdırın

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("sayi çifttir.");

        if (sayi % 2 != 0)
            System.out.println("sayi tektir.");


    }
}
