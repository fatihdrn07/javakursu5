package gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girilen bir öğrenci notuna göre 50den büyük eşit ise
        //geçtiniz kçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("notu giriniz: ");
        int not= oku.nextInt();
        
        if (not>=50)
            System.out.println("geçtiniz.");
        else
            System.out.println("kaldınız.");


    }
}
