package gun14;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        //carpımın değeri 10000 i gectiğinde işlem sonlansın

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sayi= oku.nextInt();
        int capim=1;
        for (int i=1;i<=sayi;i++) {
            capim = i * capim;

            if (capim>=1000){
                System.out.println("break calısti.");
                break;
            }
        }
        System.out.println("capim = " + capim);


    }
}
