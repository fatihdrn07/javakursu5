package gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

        //girilen sayı tek mi çift mi

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi= oku.nextInt();

        String sonuc=(sayi%2==0) ? "çift" : "tek" ;
        //  ? -> if    : -> else

        System.out.println("sonuc = " + sonuc);


    }
}
