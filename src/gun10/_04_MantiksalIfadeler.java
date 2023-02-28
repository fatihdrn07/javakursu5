package gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        //mantıksal ifadeler
        // && ve işaretimiz(shift+6)
        // || veya işaretimiz(altgr+<)

        // girilen sayı pozitif ve tek ise, ekrana uygun sayı girildi
        //değilse uygun sayı girilmedi yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi= oku.nextInt();

        if(sayi%2==1 && sayi>0)
            System.out.println("uygun sayi girildi.");
        else
            System.out.println("uygun sayi girilmedi.");


    }
}
