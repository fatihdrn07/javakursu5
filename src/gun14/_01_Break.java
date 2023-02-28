package gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının 2 aynı sayının çarpımına eşit olup
        // olmadığını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi= oku.nextInt();
        int sayac=0;
        int arananrakam=0;
        while (sayac<sayi){
            if (sayac*sayac==sayi) {
                System.out.println("tam karedir");
                arananrakam=sayac;
                break;  //çalıştığında döngüden çıkar
            }
            sayac++;
        }
        if (arananrakam==0)
            System.out.println("tam kare değildir");
    }
}
