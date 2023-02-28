package gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan
        // sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup, bunun sonucunu main de
        // tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi= oku.nextInt();

        int carpim=faktoriel(sayi);

        if (carpim%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
        System.out.println(carpim);
    }
    public static int faktoriel (int sayi){
        int carpim=1;
        for (int i = 1; i <= sayi; i++) {
            carpim=i*carpim;
        }
        return carpim;
    }
}
