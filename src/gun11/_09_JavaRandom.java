package gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sinir= oku.nextInt();

        int tutulansayi=(int)(Math.random()*sinir);

        System.out.print("tahmininiz:");
        int tahmin= oku.nextInt();

        if(tahmin==tutulansayi)
            System.out.println("tebrikler");
        else
            System.out.println("bilemedinnnn :)");


    }
}
