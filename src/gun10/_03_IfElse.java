package gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //girilen bir sayının tek mi çift mi olduğunu yazdınız

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi= oku.nextInt();
        if (sayi%2==0)
            System.out.println("sayi çift.");
        else
            System.out.println("satı tek.");


    }
}
