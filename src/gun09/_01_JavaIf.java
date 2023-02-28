package gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // if --> eğer
        //if in içinde tek komut varsa süslü paranteze gerek yok

        Scanner oku = new Scanner(System.in);

        System.out.print("sayi giriniz:");
        int sayi = oku.nextInt();

        if (sayi > 10) // noktalı virgül koymuyoruz
        {
            System.out.println("sayi 10 dan büyük");
        }

    }
}
