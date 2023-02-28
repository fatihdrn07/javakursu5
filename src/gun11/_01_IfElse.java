package gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girilen bir sayıyı pozitif mi negatif mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi= oku.nextInt();

        if (sayi>0)
            System.out.println("pozitif.");
        else{
            if (sayi<0){
                System.out.println("negatif.");
            }
            else
                System.out.println("sıfır.");
        }


    }
}
