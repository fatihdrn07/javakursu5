package gun08;

import java.util.Scanner;

public class _06_ornek3 {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("bir sayı giriniz:");
        int sayi= oku.nextInt();

        System.out.println("sayı tek mi? " + (sayi%2 !=0));



    }
}
